package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num01 = 40;
		int num02 = 50;
		int result = (num01++) + (++num02);
		
		System.out.println(result);
		System.out.println(num01);
		System.out.println(num02);
		
		//예상 40+51=91,41,51 

	}

}
