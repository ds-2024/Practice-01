package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		System.out.println((a>13) && (a>=13));
		System.out.println((a>13)|| (a>=13));
		System.out.println((a/3 == 4) && (a%3 == 2));
		System.out.println((a/3 == 4) || (a%3 == 2));
		System.out.println((a/3 == 4) && (a%3 == 2) || (a/3 == 4));
		
		/*예상 1. f&&t -> f
		 * 2. f||t -> t
		 * 3. t&&f -> f
		 * 4. t||f -> t
		 * 5. t&&f||t ->t
		 */
	}

}
