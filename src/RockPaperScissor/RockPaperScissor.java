package RockPaperScissor;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 *  1. 사용자 / 컴퓨터가 임의의 가위, 바위, 보를 입력      
- 사용자는 Scanner 를 사용하여 입력 (직접 가위, 바위, 보 중 하나 입력)      
- 컴퓨터는 Random 를 사용하여 입력 (0, 1, 2 중 하나를 임의로 생성)      
- Random 을 통해 생성된 0, 1, 2 의 값은 각각 가위, 바위, 보로 치환하여 동작하게 한다.  
 2. 승부 비교를 위한 조건문 작성      
- 가위 : 바위 -> 바위 승, 가위 : 보 -> 가위 승, 가위 : 가위 -> 무승부      
- 바위 : 바위 -> 무승부,  바위 : 보 -> 보 승,  바위 : 가위 -> 바위 승      
- 보 : 바위 -> 보 승,    보 : 보 -> 무승부,   보 : 가위 -> 가위 승      
 3. 2번 비교 결과에 따른 승, 패, 무 저장해두어 승률을 출력
 * 
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while(true) {

            System.out.println("가위, 바위, 보");
            String player = scan.next();

            int comNumber = rand.nextInt(3);
            String comResult = "";

            if(comNumber == 0) {
                comResult = "가위";
            }
            else if(comNumber == 1) {
                comResult = "바위";
            }
            else if(comNumber == 2) {
                comResult = "보";
            }


            if(player.equals("가위")) {
                if(comResult.equals("가위")) {
                    System.out.println("비겼다.");
                }
                else if(comResult.equals("바위")) {
                    System.out.println("내가 졌다..");
                }
                else if(comResult.equals("보")) {
                    System.out.println("내가 이겼다!");
                }
            }
            else if(player.equals("바위")) {
                if(comResult.equals("가위")) {
                    System.out.println("내가 이겼다!");
                }
                else if(comResult.equals("바위")) {
                    System.out.println("비겼다.");
                }
                else if(comResult.equals("보")) {
                    System.out.println("내가 졌다..");
                }
            }
            else if(player.equals("보")) {
                if(comResult.equals("가위")) {
                    System.out.println("내가 졌다..");
                }
                else if(comResult.equals("바위")) {
                    System.out.println("내가 이겼다!");
                }
                else if(comResult.equals("보")) {
                    System.out.println("비겼다.");
                }
            }
            else {
                System.out.println("잘못 입력하였습니다.");
                
            }

        }
    }
}
