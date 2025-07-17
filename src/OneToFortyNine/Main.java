package OneToFortyNine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Q :   1 ~ 49 사이의 정수 값을 사용자 입력을 통해 입력받고 이를 정수 배열에 저장을 한다.
         * -1 이 입력될 때까지 배열의 크기를 +1씩 증가시키면서 사용자 입력 값을 배열에 저장을 하며
         * -1 이 입력되어 더 이상 사용자 입력을 받지 않을 때 배열에 저장된 모든 값의 합을 출력한다.
         */

        Scanner scan = new Scanner(System.in);
        int[] array = new int[1];
        int sum = 0;

        while(true) {
            System.out.println("1~49 사이의 정수를 입력하세요. (-1 입력 시 종료)");
            int input = scan.nextInt();
            if(input == -1) {
                break;
            }
            else if(input < 1 || input > 49) {
                System.out.println("1~49 사이의 정수를 입력해야합니다.");
                continue;

            }
            else {
                array[array.length - 1] = input;
                array = Arrays.copyOf(array, array.length + 1);
            }
        }
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        System.out.println("배열에 저장된 모든 값의 합: " + sum);
        scan.close();
        System.out.println("프로그램을 종료합니다.");
        
    }
}
