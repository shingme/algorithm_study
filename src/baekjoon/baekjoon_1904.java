package baekjoon;

import java.util.Scanner;

public class baekjoon_1904 {
	static long cnt = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); //6
		int[] arr = new int[n];

		
		if(n%2 == 0){
			for(int i=0; i<n; i++){ // 짝수일 때 , 홀수는 다시 세팅해야함 !
				arr[i] = 0; // 0 세팅
			}
		}else{
			arr[0] = 1;
			for(int i=1; i<n; i++){ // 짝수일 때 , 홀수는 다시 세팅해야함 !
				arr[i] = 0; // 0 세팅
			}
		}

		int k = 1;
		int z = 0;
		
		while(k < n){
			for(int i=0; i<k+1; i++){
				arr[i] = 1;
			}
			for(int i=k+1; i<n; i++){
				arr[i] = 0;
			}
			cnt++;
			if(k+1 >= n) break;
			z = k;
			while(z >= 0){
				swap(arr, z, z+2);
				z--;
			}
			k += 2;
		}
		System.out.println(cnt%15746);
	}
	
	public static void swap(int[] arr, int k, int j){
		if(j >= arr.length || arr[j] != 0) return;

		int swap = arr[j];
		arr[j] = arr[k];
		arr[k] = swap;
		k = j;
		j += 2;
		cnt++;
		swap(arr, k, j);
	}

}
