package SubjectList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    /*
     * Q :   과목 리스트를 관리하는 프로그램.
     * 1. 과목을 추가할 수 있다.
     * 2. 과목을 삭제할 수 있다.
     * 3. 과목을 수정할 수 있다.
     * 4. 과목을 검색할 수 있다.
     * 5. 과목을 정렬할 수 있다.
     * 6. 과목을 출력할 수 있다.
     * 7. 과목을 저장할 수 있다.
     * 8. 과목을 불러올 수 있다.
    */
    public static void main(String[] args) {
        
        List <String> subjectList = new ArrayList<>();
        Scanner scan  = new Scanner(System.in);
        // 과목 리스트를 관리하는 프로그램을 구현합니다.
        System.out.println("과목 리스트를 관리하는 프로그램입니다.");
        // 과목 리스트는 사용자가 직접 입력할 수 있습니다.
        while(true) {
            System.out.println("1. 과목 추가");
            System.out.println("2. 과목 삭제");
            System.out.println("3. 과목 수정");
            System.out.println("4. 과목 검색");
            System.out.println("5. 과목 정렬");
            System.out.println("6. 과목 출력");
            System.out.println("7. 과목 저장");
            System.out.println("8. 과목 불러오기");
            System.out.println("0. 종료");
            int select = scan.nextInt();
            if(select == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if(select == 1) {
                while(true) {
                    System.out.println("추가할 과목을 입력하세요(종료하려면 0을 입력하세요): ");
                    String input = scan.next();
                    if(input.equals("0")) {
                        System.out.println("과목 추가를 종료합니다.");
                        break;
                    }
                    if(subjectList.contains(input)) {
                        System.out.println("이미 존재하는 과목입니다.");
                    } else {
                        subjectList.add(input);
                        System.out.println(input + "이(가) 추가되었습니다.");
                    }

                }

            }
            else if(select == 2) {

            }
            else if(select == 3) {

            }
            else if(select == 4) {
                
            }
            else if(select == 5) {

            }
            else if(select == 6) {

            }
            else if(select == 7) {

            }
            else if(select == 8) {

            }
            else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }

        }
        // 사용자가 과목을 추가, 삭제, 수정, 검색, 정렬, 출력, 저장, 불러올 수 있도록 합니다.
        // 과목 리스트는 ArrayList를 사용하여 구현합니다.
        // 과목 리스트는 String 타입으로 구현합니다.
        // 과목 리스트는 중복된 값을 허용하지 않습니다.
        // 과목 리스트는 대소문자를 구분하지 않습니다.
        // 과목 리스트는 정렬할 때 대소문자를 구분하지 않습니다.
        // 과목 리스트는 저장할 때 대소문자를 구분하지 않습니다.
        // 과목 리스트는 불러올 때 대소문자를 구분하지 않습니다.
        // 과목 리스트는 출력할 때 대소문자를 구분하지 않습니다.
    }
}
