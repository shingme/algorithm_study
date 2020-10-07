package codeUp;

import java.util.Scanner;

/**
 * 
 * 1912 : (재귀함수) 팩토리얼 계산
 *
 */
public class codeup_1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return n*factorial(--n);
		}
	}

}
