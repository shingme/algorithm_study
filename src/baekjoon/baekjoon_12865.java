package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_12865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] w = new int[n];
		int[] v = new int[n];
		
		for(int i=0; i<n; i++){
			w[i] = input.nextInt();
			v[i] = input.nextInt();
		}
		
		//정렬
		mergeSort(w, v, 0, w.length-1);
		
		for(int i=0; i<w.length; i++){
			System.out.print(w[i]);
		}
		System.out.println();
		for(int i=0; i<w.length; i++){
			System.out.print(v[i]);
		}
//
		int resultVal = 0;
		
		for(int i=n; i>0; i--){
			if(w[0]+w[i] > k){
				continue;
			}
			for(int j=i; j>0; j--){
				if(resultVal < v[i]+v[j]){
					resultVal = v[i]+v[j];
				}
			}
		}
			
//		for(int i=0; i<n; i++){
//			if(w[i]+w[n-1] > k){
//				continue;
//			}
//			for(int j=n-1; j>i; j--){
//				if(resultVal < v[i]+v[j]){
//					resultVal = v[i]+v[j];
//				}
//			}
//		}
		System.out.println(resultVal);
		
	}
	
	static void mergeSort(int[] w, int[] v, int left, int right) {
		  if(left < right) {
		    int mid = (left + right) /2 ;
		    mergeSort(w, v, left, mid);
		    mergeSort(w, v, mid + 1, right);
		    merge(w, v, left, mid, right);
		  }
		}

		static void merge(int[] w, int[] v, int left, int mid, int right) {
		  int[] L = Arrays.copyOfRange(w, left, mid + 1);
		  int[] R = Arrays.copyOfRange(w, mid + 1, right + 1);
		  
		  int[] LV = Arrays.copyOfRange(v, left, mid + 1);
		  int[] RV = Arrays.copyOfRange(v, mid + 1, right + 1);

		  int i = 0, j = 0, k = left;
		  int l_length = L.length,r_length = R.length;

		  while(i < l_length && j < r_length) {
		    if(L[i] <= R[j]) {
		    	w[k] = L[i];
		    	v[k] = LV[i];
		    	i++;
		    }else {
		    	w[k] = R[j];
		    	v[k] = RV[j];
		    	j++;
		    }
		    k++;
		  }

		  while(i < l_length) {
		  	w[k] = L[i];
		  	v[k] = LV[i];
		  	k++;
		  	i++;
		  }
		  while(j < r_length) {
		  	w[k] = R[j];
		  	v[k] = RV[j];
		  	k++;
		  	j++;
		  }
		}

}
