package com.sz.forLoop;

import java.util.Scanner;

public class HomeworkOfCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = 24;
		int b = 38;
		int counter = 0;
		
		
		for (int multiple=1; multiple <10000; multiple ++) {
			if (multiple % 24 == 0 && multiple % 38 ==0) {
				counter ++;
			}
		}
	
		System.out.println(counter);
	}

}
