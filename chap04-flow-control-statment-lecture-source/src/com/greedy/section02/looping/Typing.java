package com.greedy.section02.looping;

import java.util.Scanner;

public class Typing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		int max = 0;
		int min = 0;
		int sum = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else if(num1 < num2) {
			max = num2;
			min = num1;
		} else {
			System.out.println("서로 다른 정수로 다시 입력하세요.");
			return;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min + "부터 " + max + "까지의 합 : " + sum);
		
		
	}
	
	public void printSimpleGugudan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int result = 0;
		
		if(num >= 2 && num <= 9) {
			
			for(int i = 1; i <= 9; i++) {
				result = num * i;
				System.out.println(num + " * " + i + " = " + result);
				
			}
		} else {
			System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
		}
	}

}
