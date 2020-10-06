import java.util.Scanner;

/**
 * 시계방향으로 사각형 달팽이 그리기
 */

public class practice_20201005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] numbers = drawSnail(n);
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers.length; j++){
				System.out.print(numbers[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static int[][] drawSnail(int n){
		//눈에 보이는 사각형을 2차원 배열로 저장가능
		int[][] resultNumbers = new int[n][n];
		//회전순서를 알기 위해 바깥을 1로 감싸고, 채울 공간은 0으로 채우기
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
		int y = 0;
		int num = 1;
		
		
		while(num <= n*n){
			//오른쪽,아래,왼쪽,위 순서가 있으므로 step4로 로직 구상하기 
			//오른쪽
			while(numbers[x][y+1] == 0){
				numbers[x][y+1] = num++;
				y++;
			}
			//아래쪽
			while(numbers[x+1][y] == 0){
				numbers[x+1][y] = num++;
				x++;
			}
			//왼쪽
			while(numbers[x][y-1] == 0){
				numbers[x][y-1] = num++;
				y--;
			}
			//위쪽
			while(numbers[x-1][y] == 0){
				numbers[x-1][y] = num++;
				x--;
			}
		}
		
		for(int i=1; i<len-1; i++){
			for(int j=1; j<len-1; j++){
				resultNumbers[i-1][j-1] = numbers[i][j];
			}
		}
		
		return resultNumbers;
	}

}
