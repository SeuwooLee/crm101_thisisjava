package ch04.sec08.practice;

import java.util.Scanner;

public class Problem06 {

  public static void main(String[] args) {
 // 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다
 // 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다
    System.out.println("숫자를 입력하세요");
    
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int sum = 0;
    
    // 짝수
    if(number%2 == 0) {
      for (int i=0; i <= number ; i+=2) {
        sum += i;
      }
    // 홀수 
    }else {
      for (int i=1; i <= number ; i+=2) {
        sum += i;
      }
    }
    
    System.out.println("결과값: " + sum);
    
  }
}
