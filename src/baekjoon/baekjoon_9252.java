package baekjoon;

import java.util.Scanner;

public class baekjoon_9252 {
		static String[] ch1;
		static String[] ch2;
		static int[][] dp;
		static String str;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ch1 = input.nextLine().split("");
		ch2 = input.nextLine().split("");
		
		dp = new int[ch1.length+1][ch2.length+1];
		str = "";
		
		for(int i=1; i<ch1.length+1; i++){
			for(int j=1; j<ch2.length+1; j++){
				if(ch1[i-1].equals(ch2[j-1])){
					dp[i][j] = dp[i-1][j-1] + compare(i-1,j-1);
				}else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		print(ch1.length, ch2.length);
		
		System.out.println(dp[ch1.length][ch2.length]);
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.println(strBuffer.reverse());
		
	}
	
	public static int compare(int i, int j){
		if(ch1[i].equals(ch2[j]))	return 1;
		else return 0;
	}
	
	public static void print(int i, int j){ // 3, 4
		while(i > 0 && j > 0){ 
			if(ch1[i-1].equals(ch2[j-1])){
				str += ch1[i-1];
				--i;
				--j;
			}else{
				if(dp[i-1][j] > dp[i][j-1]){
					--i;
				}else{
					--j;
				}
			}
		}
	}
}
