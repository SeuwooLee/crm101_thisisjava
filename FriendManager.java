package Crm101Practice;

import java.util.Scanner;

public class FriendManager {

    public static void main(String[] args) {
        Friend04[] friends = new Friend04[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("1. 추가  2. 목록  3. 수정  4. 종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1: // 추가
                    if (count >= 10) {
                        System.out.println("더 이상 추가할 수 없습니다.");
                        break;
                    }
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("전화번호: ");
                    String phone = sc.nextLine();
                    System.out.print("이메일: ");
                    String email = sc.nextLine();

                    friends[count++] = new Friend04(name, phone, email);
                    break;

                case 2: // 목록
                    for (int i = 0; i < count; i++) {
                        friends[i].showInfo();
                    }
                    break;

                case 3: // 수정
                    System.out.print("이름: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (friends[i].getName().equals(searchName)) {
                            System.out.print("전화번호: ");
                            String newPhone = sc.nextLine();
                            friends[i].setPhone(newPhone);
                            System.out.print("이메일: ");
                            String newEmail = sc.nextLine();
                            friends[i].setEmail(newEmail);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("그런 이름의 친구는 없습니다.");
                    }
                    break;

                case 4: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }
        }
    }
}
