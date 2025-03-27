package ch04.sec08.practice;

import java.util.Scanner;

public class Example7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
	
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());

			 switch(menuNum) {
				 case 1:
					 System.out.print("예금액> ");
					 balance += Integer.parseInt(scanner.nextLine());
					 break;
				 
				 case 2:
					 System.out.print("출금액> ");
					 balance -= Integer.parseInt(scanner.nextLine());
					 break;
				 
				 case 3:
					 System.out.print("잔액> ");
					 System.out.println(balance);
					 
					 // 잔액이 부족한 경우도 추가해야함(잔액이 -가 되지 않도록) 해보기
					 
	
				 case 4:
					run = false;
					break;
			 }
			 
			 System.out.println();
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}

