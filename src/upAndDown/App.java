package upAndDown;

import java.util.Random;
import java.util.Scanner;

public class App {

    /*
     * 
     * 업앤 다운. 
    -> 임의의 값을 하나 생성하고 사용자가 일정 범위의 정수 값 안에서 정수를 입력하면             
    미리 생성된 값과 비교를 통해 업 또는 다운으로 힌트를 주어 최종 생성 값을 맞추는 게임.
     * 
     */
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int number = rand.nextInt(100)+1;
        int count = 0;

        while(true){
            count ++;
            System.out.println("Up and Down 숫자입력 : ");
            int answer = scan.nextInt();

            if(number == answer) {
                System.out.println("맞췄다!!!");
                break;
            }
            else if(number < answer) {
                System.out.println("Down");
            }
            else if(number > answer) {
                System.out.println("UP");
            }

            System.out.println("게임횟수: "+count);
        }

    }
}
