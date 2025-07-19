package VowelChecker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     *
     * Q :  
     * 사용자로부터 임의의 문자열을 입력받은 후        
     * a, e, i, o, u 문자가 포함되어 있을 때마다
     * 문자열 strBox 배열에 저장하고,
     * 해당배열의 길이를 출력하여
     * a, e, i, o, u 가 얼마나 포함되어 있는지 확인하게 한다.
     * 
     * 
     */

    public static boolean isVowel(char spelling) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        // 모음 문자가 포함된 횟수를 세기 위한 변수

        for (char vowel : vowels) {
            if (spelling == vowel) {
                return true; // 모음 문자가 발견되면 true 반환
            }
        }
        return false; // 모음 문자가 없으면 false 반환

    }

    public static void vowelCount() {
        // 사용자로부터 문자열 입력 받기
        Scanner scan = new Scanner(System.in);

        // 입력된 문자열을 저장할 배열
        String[] strBox = new String[0];
        // 모음 문자 배열

        int count = 0;

        while (true) {
            System.out.print("아무 영단어나 입력하세요 (종료는 'z' 입력) : ");
            String input = scan.nextLine();

            if (input.equals("z")) {
                break;
            } else {
                // 문자열 배열 크기 증가
                String[] temp = new String[strBox.length + 1];
                // 기존 문자열 배열의 내용을 새 배열로 복사
                for (int i = 0; i < strBox.length; i++) {
                    temp[i] = strBox[i];
                }
                // 새 문자열을 마지막에 추가
                strBox = temp;
                strBox[strBox.length - 1] = input;
            }

            System.out.println("현재 문자열 배열: " + Arrays.toString(strBox));
        }

        if (strBox.length > 0) {
            // 모음 문자가 포함된 문자열의 갯수 세기

            // AI 도움
            for (int i = 0; i < strBox.length; i++) {
                String currentString = strBox[i];
                for (int j = 0; j < currentString.length(); j++) {
                    // 모음 문자가 포함되어 있는지 확인

                    if (isVowel(currentString.charAt(j))) {
                        // 모음 문자가 발견되면 해당 문자열의 갯수를 세고
                        // 다음 문자열로 넘어가기 위해 break
                        count++;
                        break;
                    }

                }
            }
            // 모음 문자가 포함된 문자열의 갯수 출력
        }

        System.out.println("모음 문자가 포함된 문자열의 갯수: " + count);
        // Scanner 자원 해제
        scan.close();
    }

    public static void main(String[] args) {

        vowelCount();

    }
}
