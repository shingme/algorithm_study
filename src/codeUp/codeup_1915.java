package codeUp;

import java.util.Scanner;
/*
 * 1915 : (재귀함수) 피보나치 수열
 */
public class codeup_1915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fibo(n)%10009);
	}
	
	public static int fibo(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			return fibo(n-1) + fibo(n-2);
		}
	}

}
