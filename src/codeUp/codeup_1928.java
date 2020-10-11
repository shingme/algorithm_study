package codeUp;

import java.util.Scanner;

/**
 * 1928 : (재귀함수) 우박수 (3n+1) (basic)
 *
 */
public class codeup_1928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		hailstoneNumber(n);

	}
	
	public static void hailstoneNumber(int n){
		System.out.println(n);
		if(n == 1){
			return;
		}else if(n%2 != 0){ // 홀수 
			hailstoneNumber(3*n+1);
		}else{ //짝수 
			hailstoneNumber(n/2);
		}
	}

}
