package baekjoon;

import java.util.Scanner;

public class baekjoon_9461 {
	static long[] dp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//테스트케이스 입력 
		int tc = input.nextInt();
		int[] arr = new int[tc];
		for(int i=0; i<tc; i++){
			arr[i] = input.nextInt();
		}
		
		//테스트케이스 한개씩 돌리기 
		int n = 0;
		for(int i=0; i<tc; i++){
			n = arr[i];
			dp = new long[n+1];
			
			padovanSequence(n);
			
			System.out.println(dp[n]);
		}
	}
	
	public static long padovanSequence(int n){
		if(n <= 5){ //점화식이 -5로 5 미만은 계산 처리
			if(n == 0) return 0;
			else if(n == 1 || n ==2 || n == 3) return dp[n] = 1;
			else return dp[n] = 2;
		}
		if(dp[n] != 0) return dp[n];
		return dp[n] = padovanSequence(n-5) + padovanSequence(n-1);
	}

}
