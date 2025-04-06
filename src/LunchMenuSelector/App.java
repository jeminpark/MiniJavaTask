package LunchMenuSelector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Q :   바쁜 직장인들을 위해 미리 선정된 점심 메뉴를 임의로 선택하여 제공하는 프로그램.
 *       1. 미리 선정된 메뉴를 사용하여 임의로 제공.     
 *       2. 사용자가 직접 메뉴를 입력하여 임의의 메뉴가 선택될 수 있도록 제공.
 * 
 */

public class App {

    public static void main(String[] args) {

      
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        List<String> menu = new ArrayList<>();
        menu.add("피자");
        menu.add("치킨");
        menu.add("햄버거");

        
        while(true) {
            int rNum = rand.nextInt(menu.size());
            // 랜덤으로 메뉴를 선택
            String menuPrint = menu.get(rNum);
            
            System.out.println("오늘의 점심메뉴는 " +menuPrint + " 입니다.");

            while(true) {
                System.out.println(menuPrint + "이(가) 마음에 들면 1, 맘에 들지않으면 2, 메뉴를 추가하려면 3을 눌러주세요. 4를 누르면 종료합니다.");
                System.out.print("입력 : ");
                int answer = scan.nextInt();

                if(answer == 1) {
                    System.out.println("오늘의 점심은 " + menuPrint + " 입니다.");
                    System.exit(0);
                }
                else if(answer == 2) { 
                    break;
                    
                    
                }
                else if(answer == 3) {
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    String addMenu = scan.next();
                    menu.add(addMenu);
                    System.out.println(addMenu + "이(가) 추가되었습니다.");
                    break;
                }
                else if(answer == 4) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                else {
                    System.out.println("잘못 선택하였습니다.");
                }
            }
        }
        
    }
}

/*
 * 
 * 메뉴를 List 타입으로 선언후 ArrayList 로 인스턴스화
 * 메뉴에 짜장면, 배떡, 강준치 add
 * addMenu ArrayList를 선언
 * 
 * 좋아요를 받을 변수 heart 를 랜덤숫자로 초기화후 선언
 * 횟수를 저장할 count 변수 선언
 * ran 변수를 랜덤숫자로 초기화
 * 내 메뉴를 받을 문자열변수 myMenu 선언
 * 
 * 무한루프를 돌리며 arrayList 내부의 랜덤점심메뉴를 출력
 * 내부루프를 돌리며 arrayList로 출력한 메뉴의 좋아요를 Scanner로 받음.
 * 계속 분석할것..
 * 
 */


// public static void ex3() {
//     List<String> menu = new ArrayList<String>();                             
//     menu.add("짜장면");  menu.add("배떡");  menu.add("강준치");  
    
//     List<String> addMenu = new ArrayList<String>();
    
    
//     int heart = rd.nextInt(3);
//     int count = 0;
//     int ran = rd.nextInt(3);
//     String myMenu = "";
    
//     while(true) {
//         System.out.println("오늘의 점심은 " + menu.get(ran) + " 입니다!");
//         while(true) {
//             System.out.print( menu.get(ran) + "이 맘에 들면 1, 맘에 들지 않으면 2, 메뉴 선택 혹은 추가는 3을 눌러주세요");
//             heart = sc.nextInt();   sc.nextLine();		
            
//             if(heart == 1) {
//                 System.out.println("오늘의 메뉴는 : " + menu.get(ran) + " 입니다.");
//                 System.exit(0);
//             }else if(heart == 2) {
//                 if(ran == 2) {
//                     ran = 0;
//                 }else {
//                     ran = (ran % 3) + 1; 
//                 }
//                 count = (count % 3) + 1; 
                
//                 if(count >= 3) {
//                     System.out.println("우리는 메뉴가 "+ menu.size() +"개뿐입니다..\n");
//                     continue;
//                 }
                
//                 System.out.print("다른 추천 메뉴는 " );
                
//                 if(ran >= 3)
//                     ran = 0;
                
//                 System.out.println(menu.get(ran) + "입니다.");
//                 continue;
//             }else if(heart == 3) {
//                 System.out.print("원하는 메뉴를 입력해주세요 :");
//                 myMenu = sc.nextLine();
                
//                 if(myMenu.equals("강준치")) {
//                     System.out.println("오늘의 메뉴는 강준치 입니다.");
//                     System.exit(0);
//                 }else if(myMenu.equals("배떡")) {
//                     System.out.println("오늘의 메뉴는 배떡 입니다.");
//                     System.exit(0);
//                 }else if(myMenu.equals("짜장면")) {
//                     System.out.println("오늘의 메뉴는 짜장면 입니다.");
//                     System.exit(0);
//                 }else {
//                     System.out.println(myMenu +"는 오늘부로 주문해서 내일 드실 수 있습니다.\n");
//                     addMenu.add(myMenu);
//                     continue;
//                 }
                
//             }
//             System.out.println("오늘의 메뉴는  " + menu.get(ran) + " 입니다.");
//             break;
//         }
        
//     }
// }

// public static void main(String[] args) {
//     ex3();
// }
