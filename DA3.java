package com.sb.demo;

public class DA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "...........#..#.#.###....#.....",
				"...#..#...........#.#...#......",
				"#.....#..#........#...#..##....",
				"..#...##.#.....#.............#.",
				"#.#..#......#.....#....#.......",
				".....#......#..#....#.....#....",
				".......#.#..............#......",
				".....#...#..........##...#.....",
				"...#....#.#...#.#........#...#.",
				"..#.........###.......##...##..",
				".#....#...........#........#..#",
				"..#.............##.............",
				"..#.##.#....#................#.",
				".....##.#.......#....#...#.....",
				"......#.#....##................",
				"..#..........###..#..#.#..#....",
				"....#..............#....##..#.#",
				".#.........#.#....#.#.#....#...",
				"..#.....#......##.#....#.......",
				"..#.#....#..#.#...##....###....",
				"...#......##...#........#.#..#.",
				".##.#.......##....#............",
				"...##..#.#............#...#.#..",
				".##...##.#..#..................",
				"..#......##......#......##.....",
				".....##...#..#...#.........#...",
				".##.#.....#..#..#.##....##....#",
				"..#.#......#.......##..........",
				"......................#......##",
				"##.#...#.................#.#.#.",
				"......#.#..........#.....##.#..",
				"#.#......#.....#...........#...",
				".....#...#.......#..#..#.#...#.",
				"...........#......#.#...#......",
				"....##...##...........#......#.",
				".........#.##..................",
				"......#...#....#......##.##...#",
				"......#...#.#########......#...",
				".......#.#...#.......#..#......",
				"............#...#...#.###...##.",
				"...........#..........#...#....",
				"...#..#.#................#.#..#",
				"..#....#.....#.............#.#.",
				"....##......#........#....#....",
				"........##...............#....#",
				"........#..#...#..............#",
				"...#....#.#...#..#...#....#.#.#",
				".........#.......#....##.......",
				"#.##..............#.#........##",
				"......................###......",
				".........#....##..##....#.#.#..",
				".#...##.#.#...#....##..#.....#.",
				"....................#.#......#.",
				".#..#.......................#..",
				"..#..#.............#..#....#...",
				"...#...#..#...#...#.#..#.##....",
				"........#....#...#....#........",
				".#.....#........#.........#...#",
				"...#......#..#..#..####..#.....",
				"#....#..............#.##.......",
				".#....#.............##...#.....",
				"....#...#.##........##......#..",
				"##....#...#.......#..#........#",
				"....##........................#",
				"..................#..#.........",
				"..#....#........#..#.......#...",
				"#...#..#....#...##...........#.",
				".........#..#..#.#.##..........",
				"....#.#..#.....#..#.#.#.#..#.##",
				"##................#.##.....#...",
				".#.....###..#..#..#.....#....##",
				"...#...........#..........####.",
				".#.....#....#......#.##..#.#...",
				"..#...##....#................#.",
				"........#.......#......#.#.....",
				"....#.#.#.#....#...#......#..#.",
				"...........#......#..#.........",
				"###...##......##.#..#....##....",
				"##....##.........#..#....###...",
				"#.#.....#....#......#...#..##..",
				"#....##.#..............#.##....",
				".#........#.#.........#...#....",
				"......................#......#.",
				"........#..#..##.....#..#.#....",
				"..#...###.................#..#.",
				"...#...#............#..........",
				".##.......#..#.........#....#..",
				".#..............#....#....##...",
				"...............##..#.#.......##",
				".#.....#....#...#..#.......#..#",
				"#..#.............#....#......#.",
				".....#.#......#.........###..#.",
				".#...#.#...............#....#..",
				"#......#.............#.........",
				".#.##.#.####...#..#.##..#.....#",
				".....#......#..#...#.......#...",
				"#........###...#.....#..#.....#",
				"....#.#.....#...#..........#...",
				"...#.#.......#.#......#..#.##..",
				"..#..........#.#..#.......#.#..",
				"#...#.#..............#...###.#.",
				"...#..#...#............###.....",
				"..#..#...#.#............#..#...",
				".###.#.....................#..#",
				"....#....#..#.....##.##........",
				"#....#....#.#..#.........#.....",
				".#.....##....#............##..#",
				"#....#.#...#...#..#.#......#...",
				"#.....##.....##.....##.#...##..",
				"...##...#..#..####.#........#..",
				".........#...#......##..##..#..",
				"..#.....###.#..#..####.#.......",
				".......#......#...#..##....#...",
				".#.....#.#.#..#....#...#..##...",
				"..........#.#...#...#.#..#.....",
				"....#.....#........#.....##..#.",
				"..#.#.##.........#...##.....##.",
				".........#.##....#............#",
				"............##.....#.......#.#.",
				"......#.....#...#..#..###......",
				"##.....#.......#...##.#....#...",
				"...........##......#..##...#.#.",
				"..#.#.#.#...#.......#....#...#.",
				"#.............#.....#.#...###..",
				"##....#.......#.....#..##.#....",
				"...#.......#....#.........##...",
				"......#.......#......##.##.....",
				"..#......#...#.#........#......",
				"....#.#....#.#.##......#.....#.",
				"#......#.........#..#....#.....",
				"........#..#....##.....#.......",
				"#......##....#.##....#......#..",
				"..#.......#............##.....#",
				"...........#...#...........#...",
				"#.......#...#....#....#...#.#.#",
				"..###..#........#........#.....",
				"..#..###...........#.#......#..",
				".#...........#......#..........",
				".#.......#.....#.......#.......",
				"..#......##.#............#....#",
				"#..........#.....#.#..#........",
				".....#...##.##.......#......#..",
				"..........#.....#........#.#.#.",
				"....#......#.....#......#.#....",
				".........#.#.#..#...##....#...#",
				".........#.......#...##...#.#..",
				".##........#...............#...",
				".......#....#...........##.....",
				".........###......#.........#.#",
				"......#.......#...#..........#.",
				"...#.#..........##......#...#..",
				"#.......#.#..........#.........",
				"................#..#......#..##",
				".....#...#....#.#.....#........",
				"#.....#....#...........#....#..",
				"#....#.#..#...##....#...##.#...",
				"...#.....#......#.#....#..#..#.",
				"..#................#...#.#..##.",
				"..........#..............#..#.#",
				".....##.....#..#.###...........",
				"....#.#......#.#...........#...",
				".#....#.#.........##.#....#....",
				".#.#........#........###....#..",
				"##.#................#...#..#...",
				".......#......##..#.....#..#.#.",
				"...#............#......###...##",
				"#.#...........#.........#......",
				".....#.#.#.................#...",
				"....#..............#...#.#.....",
				"...#.#.....##..#...............",
				".#..##...#....##.....###..#....",
				"...............#...#...#.#.###.",
				".###....#.....#...#.#......#...",
				"...#..#.....#.......#..##.#....",
				"...........#..#....##..#...#...",
				"...#...#..........#.......##.#.",
				"............#.#.......#........",
				"....#.........#.....#..........",
				"...#.###.##..#...##..####..#..#",
				".#.#...#..#...................#",
				".....#..#.....##..#............",
				"....#......#...##..#.##........",
				"...#...............#..#.....##.",
				"...#......#.........#.#..##....",
				".#....#.##.......#......#......",
				"....#.......#....#..........#..",
				"#.#.#....###.#.#.............#.",
				"..##..###........#.#..#.#..#...",
				"......#.#............##.#...###",
				".........#.#....#####.....##...",
				"............##......#.#..#.....",
				"...#.....#.....###....#........",
				"##..........####.##.#.#........",
				"....................##.....##.#",
				"#.#............#........#......",
				"....#...##.....#......#....#...",
				"...###.#..##..................#",
				"..###......#..............#.#.#",
				".#...#...........#....#........",
				"....#............#..#..#.#.....",
				"...#.........#.#.........#.####",
				"..#...#...#...#...........#....",
				"...............#.#......##..#..",
				"#....#.#.......#.#..#......#..#",
				"........#.#....#..#...#..#...#.",
				"...#..#.......#...........#....",
				"...........#.......#...........",
				".#......#................#.....",
				"....#.#.#...#......#..#...#....",
				"................#.#.#....#.....",
				".........................##..#.",
				".#...........#............##...",
				"#...............#.....##.#.#..#",
				".........#.......###....#.....#",
				"....##...#...#.....#..#........",
				"........#.....#..#.#.#...#..#..",
				"......#.......#.#.........#.#..",
				"#......#............#...#....#.",
				"#..##...#..#................#..",
				".##...#...#.....#.##.......#..#",
				".......#.##........##..##......",
				"##.#..##...............#.....#.",
				"......#....#..##...#......###.#",
				"#........##..#....#.#......#...",
				".#......##.#...#.#...#.........",
				".#.#...#..#.............#......",
				".##..........#..........#......",
				".#.....#.....#..............#.#",
				"..#.........#..#.#.....#.#....#",
				"..#.##..............##...#..###",
				"....................#..........",
				"......###..#..#...........#....",
				"..#..........#.......#...#.....",
				"...#......#......#.............",
				"....##..............#.#.....#..",
				"........#.#......#..#........##",
				".............#...#.#.........##",
				"...###...#..........##.......#.",
				".#..........#...##..#.#.....#..",
				"##...#.........#...............",
				"......#....#....#.....#.....#..",
				"..........#....#...#...#..#...#",
				"...##....#.#.#..#...##.........",
				"#......#.#...##.###...#....#...",
				"##.......##.#......##..#...#...",
				"......#.............#.##.....##",
				"#.......###....####.#...##....#",
				"..#...#..#.......#..........#..",
				"#.....#..#..#..#.##...###...#..",
				".....##.#..#..#..#.#....#...#..",
				"..#...#..................##....",
				"....#.#........##..............",
				"#...#.......##...#...#.#.......",
				"..#...#........##....#.#.......",
				"..........###...###...#......#.",
				"#.....#..###...##...##..#..#..#",
				"..#.....##.....#.......##..#.#.",
				"........#........#.........#...",
				".................#....#.......#",
				".......#...#.....#...#.#.......",
				"....##...............#...##...#",
				".##...#................#...#...",
				".............#.................",
				".#..#....#....#.#....#.........",
				".#.#..#..........#.......#.....",
				".....##.....##...#..#..........",
				"#...#.#.........#......#..#....",
				"........#....#...#....#.#.##...",
				"....#..#........#...#...#......",
				".#..#.....#.#...#.........#....",
				".#..#..#...........#..#....#...",
				"....###.............#..#.......",
				"#......#..#..##..........#.#...",
				"#..#..#.##..#...#.#.#..........",
				"....###......#.##.....#....#...",
				".##..#...#......##.#...........",
				"..#..#.......#.....#.##....#.#.",
				".......#.#.#........#....##....",
				"..##...#....#...............###",
				"#..##..#...........#.#....##...",
				"...##..#.....................#.",
				"###......#....#....###..#...##.",
				".........##............#..#...#",
				"..#..........#...#.#.#......#.#",
				".......#.....##..##......#.##..",
				"#..........#.....##.#..........",
				"#.......#.#...#...#....#.......",
				"#...#.....##.......#.#..#.#.#..",
				".........#.#.#..#..#...#.###...",
				".................##...#....#...",
				"###.......#..........##...#....",
				"#.#..#.........#....##.#.......",
				"......#.#.....#........#.......",
				".......#.#........#......#.#..#",
				"..............#..#...##....#..#",
				"#...........#...##.....#..#.#..",
				"..#....#..#.#.#...#..#....#.#..",
				"...##.#.....#..#...##..#.....#.",
				"..#.#................#........#",
				"......#...#.............#......",
				".##............#....#...#..#...",
				"....#...#...........#.......#..",
				".###..#.......#.............#.#",
				".#.#....#.#...........#.#......",
				"...#.........#.........#..#....",
				"...#..........#.#.....#.#......",
				".....#........#....##......#...",
				"..#.#.#......#..#.#......#....#",
				".#.#..#................#.#.....",
				".#.#.........##...#.......#.#.#",
				"#..#.....#...#..#...........#..",
				"..##......####......#..#....###",
				"#.....###....#.#........#..#..#",
				"..##.#...#.#..##..........#..#.",
				"#.........#.#.............#...#",
				"...#.#...#...#.#.#....##.......",
				"##.##...#.....#...#...........#",
				"....#........#.#.....#.........",
				".................##..#..##...##",
				".....##....#...#...#.....#..#..",
				"....#...#........#............#",
				"..#...........##....#...#...##.",
				".....#......#.........#..##.#.."};

		int patLength = arr[0].length();
		long treeProd=1;
		
		int slopeX[] = { 1, 3, 5, 7, 1 };
		int slopeY[] = { 1, 1, 1, 1, 2 };
		for (int j = 0; j < slopeX.length; j++) {
			int treeCount = 0;
			int x = 0;
			int y = 0;
			for (int i = 0; i < arr.length; i=i+slopeY[j]) {
				x = (x + slopeX[j]) % patLength;
				y = i + slopeY[j];
				
				if (y >= arr.length) {
					break;
				}
				char loc = arr[y].charAt(x);
				if (loc == '#') {
					treeCount++;
				}
			}
			System.out.println(treeCount);
			treeProd=treeProd*treeCount;
			
		}
		System.out.println(treeProd);
		
	}

}
