package ch04.sec08.practice;
 //1~100까지의 수에서 5의 배수이면서 7의 배수인 수 출력하기.
 //클래스명 : Problem01.java

public class Problem01 {
	 public static void main(String[] args) {
	  for(int i = 1; i <= 100; i++) {
	   if((i%5 == 0) && (i%7 == 0)) {
		 //  System.out.print(i + " ");
		   System.out.println(i); 
	   }
	  }
	   
	  
	 }
}

//public class Problem01 {
//    public static void main(String[] args) {
//        // 1번 1~100 5의 배수 이면서 7의 배수 출력
//       // System.out.print("1~100 3의 배수 이면서 5의배수 출력 : ");
//        for(int i = 1; i <= 100; i++) {
//            // 3의 배수 && 5의 배수
//            if( (i%5 == 0) && (i%7 == 0) ) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("");
//    }
//}

