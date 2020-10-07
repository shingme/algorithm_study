package codeUp;
import java.util.Scanner;
/**
 * 코드업: 1901
 * 1 부터 정수 n까지 출력하는 재귀함수를 설계하시오.
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 *
 */
public class codeup_1901 {

	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 1;
        increase(num, n); //1, 10
        
    }
    
    public static void increase(int num, int n){
        if(num > n){
            return;
        }else{
            System.out.println(n--);
            increase(num, n);
        }
       
    }

}
