package variable;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int target = random.nextInt(100) + 1;
            int guess = 0;
            System.out.println("1~100 사이 숫자 맞히기!");

            while (guess != target) {
                System.out.print("숫자 입력: ");
                guess = scanner.nextInt();

                if (guess < target) {
                    System.out.println("더 높게!");
                } else if (guess > target) {
                    System.out.println("더 낮게!");
                } else {
                    System.out.println("정답!");
                }
            }

            System.out.print("다시 할까요? (y/n): ");
            char again = scanner.next().charAt(0);
            if (again != 'y' && again != 'Y') {
                break;
            }
        }

        System.out.println("게임 끝!");
        scanner.close();
    }
}

