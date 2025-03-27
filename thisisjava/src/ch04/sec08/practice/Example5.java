package ch04.sec08.practice;

public class Example5 {

  public static void main(String[] args) {
    // 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드
    // 를 작성해보세요. 단, x와 y는 10 이하의 자연수입니다.

//    for (int x = 1; x <= 10; x++) {
//      for (int y = 1; y <= 10; y++) {
//        int total = 4 * x + 5 * y;
//        if (total == 60) {
//          System.out.print("(" + x + "," + y + ")  ");
//          System.out.println("" + total + " ");
//        }
//      }
//    }

    for (int x = 1; x <= 10; x++) {
      for (int y = 1; y <= 10; y++) {
        if ((4 * x + 5 * y) == 60) {
          System.out.println("(" + x + ", " + y + ")");
        }
      }
    }

  }

}