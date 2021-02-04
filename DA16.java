package com.sb.demo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DA16 {

    public static void main(String[] args) throws Exception {
        final List<String> input = new ArrayList<String>();
        File file = new File("src/main/resources/day16");
		Scanner myReader = new Scanner(file);
		while(myReader.hasNextLine()){
			String data=myReader.nextLine();
			input.add(data);
		}
        final List<Field> fields = new ArrayList<>();
        final List<List<Integer>> tickets = new ArrayList<>();
        int i = 0;
        for (; ; i++) {
            final String line = input.get(i);
            if (line.isEmpty()) {
                break;
            }

            final String[] parts = line.split("(: )|-|( or )");
            fields.add(new Field(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])));
        }

        i += 2;
        for (; i < input.size(); i++) {
            final String line = input.get(i);
            if (line.isEmpty()) {
                i++;
                continue;
            }

            tickets.add(Arrays.asList(line.split(",")).stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList()));
        }

        part1(fields, tickets);
        part2(fields, tickets);
    }

    private static void part1(List<Field> fields, List<List<Integer>> tickets) {
        int failure = 0;
        for (List<Integer> ticket : tickets) {
            for (int value : ticket) {
                boolean valid = false;
                for (Field field : fields) {
                    if (field.isValid(value)) {
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    failure += value;
                }
            }
        }

        System.out.println(failure);
    }

    private static void part2(List<Field> fields, List<List<Integer>> tickets) {
        final List<List<Integer>> tickets2 = new ArrayList<>();
        for (List<Integer> ticket : tickets) {
            boolean allValid = true;
            for (int value : ticket) {
                boolean valid = false;
                for (Field field : fields) {
                    if (field.isValid(value)) {
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    allValid = false;
                    break;
                }
            }

            if (allValid) {
                tickets2.add(ticket);
            }
        }

        tickets = tickets2;
        final HashMap<String, Set<Integer>> candidates = new HashMap<>();
        final List<String> positions = new ArrayList<>();
        final Set<Integer> all = new HashSet<>();
        for (int i = 0; i < tickets.get(0).size(); i++) {
            positions.add(null);
            all.add(i);
        }

        for (Field field : fields) {
            candidates.put(field.name, new HashSet<>(all));
        }

        while (positions.stream().anyMatch(a -> a == null)) {
            for (Field field : fields) {
                final Set<Integer> pos = candidates.get(field.name);
                for (List<Integer> ticket : tickets) {
                    for (int i = 0; i < ticket.size(); i++) {
                        if (!field.isValid(ticket.get(i))) {
                            pos.remove(i);
                            if (pos.size() == 1) {
                                final int finalPos = new ArrayList<>(pos).get(0);
                                positions.set(finalPos, field.name);
                                for (Entry<String, Set<Integer>> candidate : candidates.entrySet()) {
                                    if (candidate.getValue() == pos) {
                                        continue;
                                    }

                                    candidate.getValue().remove(finalPos);
                                    if (candidate.getValue().size() == 1) {
                                        positions.set(new ArrayList<>(candidate.getValue()).get(0), candidate.getKey());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        final List<Integer> ticket = tickets.get(0);
        long total = 1;
        for (int i = 0; i < ticket.size(); i++) {
            if (positions.get(i).startsWith("departure")) {
                total *= ticket.get(i);
            }
        }

        System.out.println(total);
    }

    private static class Field {
        public final String name;
        public final int lower1;
        public final int upper1;
        public final int lower2;
        public final int upper2;

        public Field(String name, int lower1, int upper1, int lower2, int upper2) {
            this.name = name;
            this.lower1 = lower1;
            this.upper1 = upper1;
            this.lower2 = lower2;
            this.upper2 = upper2;
        }

        public boolean isValid(int value) {
            return (value >= this.lower1 && value <= this.upper1) || (value >= this.lower2 && value <= this.upper2);
        }
    }
}