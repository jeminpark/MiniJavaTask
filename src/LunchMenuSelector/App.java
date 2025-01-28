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

        int rNum = rand.nextInt(3);
        
        while(true) {
            String menuPrint = menu.get(rNum);
            
            System.out.println("오늘의 점심메뉴는 " +menuPrint + " 입니다.");

            while(true) {
                System.out.println(menuPrint + "이(가) 마음에 들면 1, 맘에 들지않으면 2, 메뉴를 추가하려면 3을 눌러주세요.");
                int answer = scan.nextInt();

                if(answer == 1) {
                    System.out.println("오늘의 점심은 " + menuPrint + " 입니다.");
                    System.exit(0);
                }
                else if(answer == 2) { 
                    
                    int newRnum = rand.nextInt(3);
                    if(rNum == newRnum) {
                        
                    }
                    
                    
                }
                else if(answer == 3) {

                }
                else {
                    System.out.println("잘못 선택하였습니다.");
                }
            }
        }
        
    }
}