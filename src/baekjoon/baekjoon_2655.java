package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baekjoon_2655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] arr = new int[n][4];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				arr[i][j] = input.nextInt();
			}
			arr[i][3] = i+1;
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b){
				return a[0] - b[0];
			}
		});

		long[][] dp = new long[2][n];
		dp[0][0] = arr[0][1]; //첫번째 값 세팅
		dp[1][0] = arr[0][3];
		
		int index = 1; // 기준값
		String arrMax = Integer.toString(arr[0][3]); // 출력값(입력번호)
		
		while(index < n){ //입력 배열 모두 탐색
			for(int i=0; i<index; i++){ // 기준값까지 탐색
				if(arr[i][2] < arr[index][2]){ //기준값보다 높이 작을 경우
					//높이 합 저장 
					dp[0][index] = dp[0][i] + arr[index][1];
					//입력 번호 저장
					dp[1][index] = Long.parseLong(Long.toString(dp[1][i]) + Long.toString(arr[index][3]));
				}
			}
			//기준값까지 탐색한 결과 높이가 기준값보다 클 경우, 기준값 넣기
			if(dp[0][index] == 0){
				dp[0][index] = arr[index][1];
				dp[1][index] = arr[index][3];
			}
			//최대 높이 저장
			if(dp[0][index-1] < dp[0][index]){
				arrMax = Long.toString(dp[1][index]);
			}
			index++;
		}
		
		String[] result = arrMax.split("");
		System.out.println(result.length);
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
		
	}

}
