package baekjoon;

import java.util.Scanner;

public class baekjoon_9251 {
	static String[] str1;// 첫번째 입력값
	static String[] str2; //두번째 입력값 
	static int[][] dp; // 처음에 재귀로 풀 생각이었음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		str1 = input.nextLine().split("");
		str2 = input.nextLine().split("");
		
		dp = new int[str1.length][str2.length];
		
		int str1Len = str1.length;
		int str2Len = str2.length;
		
		for(int i=0; i<str1Len; i++){
			for(int j=0; j<str2.length; j++){
				dp[i][j] = -1;
			}
		}
		// 반례 있음 ;;; A, AA 런타임에러남 ;;;; 이 경우 고려해주기 
		dp[0][0] = compare(0,0);
		//대각선범주 계산
		int n = 1; //str1 중간 길이 
		int m = 1; //str2 중간 길이 
		
		while(true){
			for(int i=0; i<=n; i++){
				for(int j=0; j<=m; j++){
					if(dp[i][j] != -1){ // -1이 아니면 이미 계산된 것
						continue;
					}else if(i == 0){
						// 가상일 경우 1을 초과할 수 X 비교하고자 하는 값은 1개이기 때문(추후에 생각함1)
						dp[i][j] = Math.max(dp[i][j-1], compare(i,j)); 
					}else if(j == 0){
						dp[i][j] = Math.max(dp[i-1][j],compare(i,j));
					}else if(str1[i].equals(str2[j])){ //전에 같은 문자로 count가 되었을 때 추가 count 방지(추후에 생각함2)
						dp[i][j] = dp[i-1][j-1] + 1;
						
					}else{
						dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]) + compare(i,j); // 이 점화식만 생각해냄
					}
				}
			}
			if(n+1 == str1Len && m+1 == str2Len){ //모두 탐색했을 때 종료
				break;
			}
			//입력값 2개 길이가 다를 경우 
			if(n+1 < str1Len) n++;
			if(m+1 < str2Len) m++;
		}

		System.out.println(dp[str1Len-1][str2Len-1]);
	}
	
	public static int compare(int i, int j){
		if(str1[i].equals(str2[j])) return 1;
		else return 0;
	}

}