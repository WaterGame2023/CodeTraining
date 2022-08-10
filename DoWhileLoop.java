package section1;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int x = 10;
	//	int x = -10;
	//	While Loop would not print -10;
		
		do {
			System.out.println("x = " + x);
			x--;
		}while(x > 0);
	}
}
