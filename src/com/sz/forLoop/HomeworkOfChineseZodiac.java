package com.sz.forLoop;

import java.util.Scanner;

public class HomeworkOfChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.format("Please input your birth year, you can input \"STOP\" to stop the program\n");
			
				String birthYear = sc.nextLine();
				birthYear = birthYear.toUpperCase();
				if ("STOP".equals(birthYear)) {
				break;
				}
			
				try {	
				String zodiac = "0";
				int bY = Integer.parseInt(birthYear); 
				int remainder = bY % 12;


				switch (remainder) {
				case 0 : zodiac = "Monkey"; break;
				case 1 : zodiac = "Roster"; break;
				case 2 : zodiac = "Dog"; break;
				case 3 : zodiac = "Pig"; break;
				case 4 : zodiac = "Mouse"; break;
				case 5 : zodiac = "Ox"; break;
				case 6 : zodiac = "Tiger"; break;
				case 7 : zodiac = "Rabbit"; break;
				case 8 : zodiac = "Dragon"; break;
				case 9 : zodiac = "Snake"; break;
				case 10 : zodiac = "Horse"; break;
				case 11 : zodiac = "Sheep"; break;

				}
				System.out.format("You were born in %d, and your zodiac is %s\n", bY, zodiac);
				System.out.println();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}


		}

	}

}
