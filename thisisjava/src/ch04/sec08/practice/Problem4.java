package ch04.sec08.practice;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("숫자 5개를 입력하세요");
        
        int[] arr = new int[5];
        int max = 0;
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.println((i + 1) + "번째 수: " + arr[i]);


            if (arr[i] > arr[max]) {
                max = i;  
            }
        }
        
        System.out.println("가장 큰 수는: " + arr[max]);
        scanner.close();
    }
}