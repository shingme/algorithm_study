package codeUp;

import java.util.Scanner;
/**
 * 1905 : (재귀함수) 1부터 n까지 합 구하기
 *
 */
public class codeup_1905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//3
		System.out.println(sum(1,n));
	}
	
	public static int sum(int val, int n){
		if(val == n){ //재귀함수 종료 시점
			return val;
		}else{
			return val + sum(++val, n);
		}
	}

}
