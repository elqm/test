package com.greedy.section01.method;

public class Question {

	public static void main(String[] args) {

		/* 출제 의도
		 * 메소드 구현
		 * */
		int cash = 10000;
		int apple = 1000;
		int banana = 2000;
		int change1 = cash - apple;
		int change2 = cash - banana;

		Question app = new Question();
		app.buyA(change1);
		app.buyB(change2);


	}

	public void buyA(int change1) {

		System.out.println("사과를 사고 남은 거스름돈 : " + change1);

	}

	public void buyB(int change2) {

		System.out.println("바나나를 사고 남은 거스름돈 : " + change2);

	}
}
