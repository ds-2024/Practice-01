package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//계획세우기
		//scanner 실행
		//new Scanner(System.in); // 에러들어가서 import 해줘야함
		
		Scanner sc = new Scanner(System.in);
		
		//안내문구
		System.out.print("월급을 입력하세요:");
		
		//월급 입력받기
		int salary = sc.nextInt();
		
		//최종 선언
		System.out.println("10년동안 최대 저축액은 " + 10*12*salary + "원 입니다.");
		
		sc.close();

	}

}
