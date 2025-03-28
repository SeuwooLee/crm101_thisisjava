package ch04.sec08.practice;

public class Problem5 {
    public static void main(String[] args) {
        // 10번 반복
        for (int j = 0; j < 10; j++) {
            // 첫 번째 for문: j가 0일 때 1부터 10까지 출력
            for (int i = 1 + j; i <= 10 + j; i++) {
                System.out.print(i + "\t");
            }
            // 줄 바꾸기
            System.out.println();
        }
    }
}
