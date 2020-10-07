package codeUp;

import java.util.Scanner;

/**
 * 코드업: 1904 : (재귀함수) 두 수 사이의 홀수 출력하기
 *
 */

public class codeup_1904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int startNum = scan.nextInt();
		int endNum = scan.nextInt();
		
		oddChoice(startNum, endNum);
	}
	
	public static void oddChoice(int startNum, int endNum){
		if(startNum > endNum){
			return;
		}else{
			if(startNum%2 != 0){
				System.out.println(startNum);
			}
			oddChoice(++startNum, endNum); //후위연산자 사용하면 호출한 함수 끝난 이후에 증감함 
		}
		
	}

}
