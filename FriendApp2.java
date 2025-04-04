package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp2 {
	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요(예시 : 홍길동 010-1111-1111 초/중/고)");

		// 친구정보 입력받기
		for (int i = 0; i < friendArray.length; i++) {
			String input = sc.nextLine();

			// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
			String[] data = input.split(" ");

		// Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
		// 배열에 추가하기 ( friendArray <- friend객체 )
            friendArray[i] = new Friend(data[0], data[1], data[2]);
        }

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++)  {
            friendArray[i].showInfo(); // showInfo() 메소드 호출
        }
		
		sc.close();
	}
}
