package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("가로: ");
		
		double width = sc.nextDouble();
		
		System.out.print("세로: " );
		
		double height = sc.nextDouble
				();
		
		System.out.println("삼각형의 넓이는 " + width*height/2);
		
		sc.close();

	}

}
