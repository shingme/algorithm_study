package codeUp;

import java.util.Scanner;

/*
 * 1929 : (재귀함수) 우박수 (3n+1) (reverse)
 */
public class codeup_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//System.out.println(hailstoneNumber(n));
		hailstoneNumber2(n);

	}
	
	public static String hailstoneNumber(int n){ //5
		if(n == 1){
			return Integer.toString(n);
		}else if(n%2 != 0){ // 5
			return hailstoneNumber(3*n+1) + "\n"+n;
		}else{ //짝수 
			return hailstoneNumber(n/2) + "\n"+n;
		}
	}
	
	public static void hailstoneNumber2(int n){
		if(n == 1){
			System.out.println(n);
			return;
		}else if(n%2 != 0){ // 5
			hailstoneNumber2(3*n+1);
		}else{ //짝수 
			hailstoneNumber2(n/2);
		}
		System.out.println(n);
	}

}
