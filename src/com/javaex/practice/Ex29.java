package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//직사각형의 둘레와 면적 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextInt();
		
		System.out.print("세로를 입력하세요: ");
	    double length = sc.nextInt();
		
		System.out.println("사각형의 넓이는 "+ width*length);
		System.out.println("사각형의 둘레는 "+ 2*(width+length));
		
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
