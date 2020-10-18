package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//반례가 존재함
public class baekjoon_11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] A = new int[n];
		List<Integer> resultA;
		int MaxLen = 0;
		int z = 0;
		for(int i=0; i<n; i++){
			A[i] = input.nextInt();
		}
		
		for(int i=0; i<n-1; i++){
			z = i;
			int cnt = 0;
			resultA = new ArrayList<Integer>();
			resultA.add(cnt++, A[i]);
			for(int j=i+1; j<n; j++){
				if(A[i] < A[j]){
					resultA.add(cnt++, A[j]);
					i=j;
				}
			}
			if(MaxLen < resultA.size()){
				MaxLen = resultA.size();
				i = z;
			}
		}
		
		System.out.println(MaxLen);
	}

}
