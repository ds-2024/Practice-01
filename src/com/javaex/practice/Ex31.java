package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//부가세와 잔액 구하기
		
		System.out.print("상품가격: ");
	
		
		double price = sc.nextInt();
		
		
		System.out.print("받은돈: ");
		
		double cash = sc.nextInt();
		
		System.out.println("=================");
		
		System.out.println("받은돈: "+ cash);
		
		System.out.println("상품가격: " + price);
		
		System.out.println("부가세: " + 0.1*price);
		
		System.out.println("잔액: " + (cash-price));
		
		sc.close();
		

	}

}
