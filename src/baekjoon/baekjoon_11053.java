package baekjoon;

import java.util.Scanner;
//반례가 존재함
public class baekjoon_11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] A = new int[n]; // 10,20,10,30,20,50
		int[] DP = new int[n];
		
		for(int i=0; i<n; i++){
			A[i] = input.nextInt();
		}
		
		DP[0] = 1;
		for(int i=1; i<n; i++){
			DP[i] = 1;
			
			for(int j=0; j<i; j++){
				if(A[j] < A[i] && DP[i] <= DP[j]){
					DP[i] = DP[j]+1;
				}
			}
		}
		int max = 0;
		for(int num : DP){
			max = Math.max(max, num);
		}
		System.out.println(max);
	}

}
