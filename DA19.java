package com.sb.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * takes about 30 seconds to run on repl.it might want to copy/paste to a local
 * IDE
 */

public class DA19 {

	private String[] rules;
	private ArrayList<String> messages;

	public static void main(String args[]) {
		new DA19().part1();
		new DA19().part2();
	}

	public DA19() {
		Scanner reader = null;
		try {
			// reader = new Scanner(new File("res/day19_sample"));
			reader = new Scanner(new File("src/main/resources/day19"));
		} catch (Exception e) {
			System.out.print("File not found");
		}

		rules = new String[150];
		messages = new ArrayList<String>();

		while (reader.hasNext()) {
			String line = reader.nextLine();
			if (line.contains(":")) {
				int i = Integer.parseInt(line.substring(0, line.indexOf(":")));
				// replace the quotes around "a" and "b" when we find them
				rules[i] = line.substring(line.indexOf(":") + 2).replace("\"", "");
			} else if (!line.equals(""))
				messages.add(line);
		}
	}

	public void part1() {
		// expected regex for sample input: "^(a((aa|bb)(ab|ba)|(ab|ba)(aa|bb))b)$"
		// create a regex for rule 0
		String re = "^" + makeRegex(rules, 0) + "$";

		int count = 0;
		for (String m : messages)
			if (m.matches(re))
				count++;

		System.out.println("Valid messages: " + count);

	}

	public void part2() {
		// we are now making changes to rules 8 and 11
		// rule 0: 8 11
		// new rule 8: 42 | 42 8
		// new rule 11: 42 31 | 42 11 31
		// therefore, rule 0: (42 | 42 8) (42 31 | 42 11 31)
		// as far as I can tell, the pattern should begin with one or more copies of
		// rule42, followed X number of rule42 + X number of rule31

		// I'm hoping the largest X might be is 10?
		// we will create a regex for this pattern
		// ^((42+) ((42 31) | (42 42 31 31) | (42 42 42 31 31 31) | (42 42 42 42 31 31
		// 31 31) | (42 42 42 42 42 31 31 31 31 31) | (42 42 42 42 42 42 31 31 31 31 31
		// 31) | (42 42 42 42 42 42 42 31 31 31 31 31 31 31) | (42 42 42 42 42 42 42 42
		// 31 31 31 31 31 31 31 31) | (42 42 42 42 42 42 42 42 42 31 31 31 31 31 31 31
		// 31 31) | (42 42 42 42 42 42 42 42 42 42 31 31 31 31 31
		// 31 31 31 31 31)))$
		// I know, I want to throw up too.

		// create a regex for rule 42 and rule 31
		String r42 = makeRegex(rules, 42);
		String r31 = makeRegex(rules, 31);

		String masterRegex = "(" + r42 + "+)(";
		for (int i = 1; i < 10; i++) {
			masterRegex += "(";
			for (int j = 1; j <= i; j++) {
				masterRegex += r42;
			}
			for (int j = 1; j <= i; j++) {
				masterRegex += r31;
			}
			masterRegex += ")";
			if (i < 9) {
				masterRegex += "|";
			}
		}
		masterRegex = "^(" + masterRegex + "))$";

		int count = 0;
		for (String m : messages) {
			if (m.matches(masterRegex)) {
				count++;
			}
		}

		System.out.println("Valid messages: " + count);
	}

	private static String makeRegex(String[] rules, int i) {

		// as long as there is still a number somewhere in rules[i], find a number and
		// replace it with it's rule
		while (rules[i].matches(".*\\d.*")) {
			String[] parts = rules[i].split(" ");
			String rep = ""; // string that will replace rules[i] at each iteration
			for (String part : parts) {
				if (part.matches("\\d+")) {
					// if part is numerical, add the rule from that index
					// if the rule is 'a' or 'b', just add that letter
					// otherwise add '( ' + rule + ' )' so that .split separates that number in next
					// iteration
					if (rules[Integer.parseInt(part)].matches("[ab]")) {
						rep += rules[Integer.parseInt(part)];
					} else {
						rep += "( " + rules[Integer.parseInt(part)] + " )";
					}
				} else {
					// part is not numerical so just add whatever it is
					rep += part;
				}
			}
			rules[i] = rep;
		}
		return "(" + rules[i] + ")";
	}

}
// 224, 436