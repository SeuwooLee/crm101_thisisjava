package ch04.sec08.practice;

// 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합 출력.
// 짝수인 경우에는 입력 값까지 짝수의 합 출력
// ex 7을 입력하면 16 출력( 1+3+5+7=16)

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		// Scanner 객체로 사용자 입력 받기
		Scanner scanner = new Scanner(System.in);

		// 사용자에게 숫자 입력 받기
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();

		// 홀수일 경우, 1부터 num까지의 홀수 합 구하기
		if (num % 2 != 0) { // 입력받은 숫자가 홀수인지 확인
			int sum = 0;
			for (int i = 1; i <= num; i += 2) { // 1부터 num까지 홀수만 더함
				sum += i;
			}
			System.out.println("입력한 홀수까지의 합: " + sum);
		}

		else { // 입력받은 숫자가 짝수인지 확인
			int sum = 0;
			for (int i = 2; i <= num; i += 2) { // 1부터 num까지 짝수만 더함
				sum += i;
			}

			System.out.println("입력한 짝수까지의 합: " + sum);

			scanner.close();
		}
	}
}
