package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구 부피 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		double r = sc.nextDouble();
		
		System.out.println("구의 부피는: " + 4*3.14*r*r*r/3 +" 입니다.");
		
		sc.close();
		
		
	
	}

}
