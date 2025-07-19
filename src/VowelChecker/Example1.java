package FindChar;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void ex6() {
        Scanner sc = new Scanner(System.in);
		String str[] = new String[0];
		String inp = "";
		int count=0;
		while(true) {
			System.out.print("문자열 입력(종료는 'z'누르고 엔터) : ");
			inp = sc.nextLine();
			
			if(inp.equals("z")) {
				break;
			}else {
				String copyStr[] = new String[str.length + 1];
				for(int i=0; i<str.length; i++) {
					copyStr[i] = str[i];
				}
				str = copyStr;
				str[str.length - 1] = inp;
			}
			System.out.println(Arrays.toString(str));
			
			
		}
		
		if(str.length>0) {
			for(int i=0; i<str.length; i++) {
				for(int j=0; j<str[i].length(); j++) {
					
					// a,e,i,o,u 갯수를 모두 찾을때
//					switch(str[i].charAt(j)) {
//					
//						case 'a':
//							count++;
//							break;
//						case 'e':
//							count++;
//							break;
//						case 'i':
//							count++;
//							break;
//						case 'o':
//							count++;
//							break;
//						case 'u':
//							count++;
//							break;
//					}
					
					// a,e,i,o,u가 포함된 문자열의 갯수만 찾을 때
					if(str[i].charAt(j) == 'a' | str[i].charAt(j) == 'e' | str[i].charAt(j) == 'i' | str[i].charAt(j) == 'o' | str[i].charAt(j) == 'u') {
						count++;
						break;
					}
					
				}
			}
		}
		System.out.println("a,e,i,o,u 가 포함된 문자열의 갯수는 : " + count +"개");
	}
    
 public static void main(String[] args) {
		ex6();
	}

    
}
