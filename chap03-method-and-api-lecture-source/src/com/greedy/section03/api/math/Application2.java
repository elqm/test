package com.greedy.section03.api.math;

public class Application2 {

	public static void main(String[] args) {

		/* 원하는 범위의 난수 발생 */
		/* Math.random() * a	//여기서 a는 발생시키려는 난수의 '범위'를 설정함
		 * Math.random() +- b	//여기서 b는 발생시키려는 난수의 '시작점'을 설정함
		 * (int) (Math.random() * 구하려는 난수의 갯수) + 난수의 최솟값
		 * */
		
		/* 0 ~ 9까지의 난수 발생 */
		int random1 = (int) (Math.random() * 10);
		System.out.println("0부터 9 사이의 난수 : " + random1);
		
		/* 1 ~ 10까지의 난수 발생 */
		int random2 = (int) (Math.random() * 10) + 1;
		System.out.println("1부터 10 사이의 난수 : " + random2);
		
		/* 10 ~ 15까지의 난수 발생 */
		int random3 = (int) (Math.random() * 6) + 10;
		System.out.println("10부터 15 사이의 난수 : " + random3);
		
		/* -128 ~ 127까지의 난수 발생 */
		int random4 = (int) (Math.random() * 256) - 128;
		System.out.println("-128부터 127 사이의 난수 : " + random4);
		
		/* 대문자 범위 난수 발생 */
		int random5 = (int) (Math.random() * 26) + 65;
		System.out.println("A부터 Z 사이의 난수 : " + (char) random5);
	}

}
