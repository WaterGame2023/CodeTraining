package section1;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] TwoDim = new int [4][3];
		
		//TwoDim[2][1] = 10;
		
		int temp = 10;
		
		//A loop within a loop
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
				TwoDim[i][j] = temp;
				temp += 10;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(TwoDim[i][j] + " ");
			}
			System.out.println();//Print a new line every time j loop ends:
		}
	}
}
