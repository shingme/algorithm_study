import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스_월간챌린지 시즌1
 * 두 개 뽑아서 더하기 
 */
public class practice_20201004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] temp = str.split(",");
		int[] numbers = new int[temp.length];
		
		for(int i=0; i<temp.length; i++){
			numbers[i] = Integer.parseInt(temp[i]);
		}
		
		int[] result = solution(numbers);
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]);
		}
	}
	 
	public static int[] solution(int[] numbers) {
        int len = numbers.length; //5
        int val = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        //서로 다른 두 수 더하기 
        for(int i=0; i<len-1; i++){
        	for(int j=i+1; j<len; j++){
        		val = numbers[i] + numbers[j];
        		set.add(val);
        	}
        }
        
        //오름차순 정렬
        ArrayList<Integer> numberArray = new ArrayList<Integer>(set);
        Collections.sort(numberArray);
        
        int[] answer = new int[numberArray.size()];
        int cnt = 0;
        for(int n : numberArray){
        	answer[cnt++] = n;
        }
        
        return answer;
    }

}
