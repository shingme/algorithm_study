import java.util.Scanner;

/**
 * 프로그래머스_월간챌린지 시즌1
 * 반시계방향으로 삼각형 달팽이 그리기
 */

public class practice_20201006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numbers = drawTriangleSnail(n);
		
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);
			if(i < numbers.length-1){
				System.out.print(", ");
			}
		}
	}
	
	public static int[] drawTriangleSnail(int n){
		int cnt = n*(n+1)/2;
		int[][] resultNumbers = new int[n][n];
		int[] result = new int[cnt];
		
		int[][] numbers = new int[n+2][n+2];
		int len = numbers.length;
		
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){
				if((i == 0) || (i == len-1) || (j == 0) || (j == len-1)){
					numbers[i][j] = 1;
				}else{
					numbers[i][j] = 0;
				}
			}
		}
		
		int x = 1;
		int y = 1;
		int num = 1;
		
		while(num <= cnt){
			//아래
			while(numbers[x][y] == 0){
				numbers[x++][y] = num++;
			}
			x -= 1;
			y += 1;
			//오른쪽
			while(numbers[x][y] == 0){
				numbers[x][y++] = num++;
			}
			x -= 1;
			y -= 2;
			//위(대각선)
			while(numbers[x][y] == 0){
				numbers[x--][y--] = num++;
			} //1,1
			x += 2;
			y += 1;
			//3,2
		}
		int l = 0;
		for(int i=1; i<len-1; i++){
			for(int j=1; j<len-1; j++){
				if(numbers[i][j] != 0){
					result[l++] = numbers[i][j];
				}
			}
		}
		
		return result;
	}

}
