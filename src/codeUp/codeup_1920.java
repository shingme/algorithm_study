package codeUp;

import java.util.Scanner;

/*
 * 1920 : (재귀함수) 2진수 변환
 */
public class codeup_1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(demicalTobinary(n));
	}
	
	public static String demicalTobinary(int n){
		if(n <= 1){
			return Integer.toString(n);
		}else{
			return demicalTobinary(n/2) + n%2;
		}
	}

}
