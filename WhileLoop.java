package section1;

public class WhileLoop {

	public static void main(String[] args) {
	
		int x = -10;
		
		while(x <= 0) {
			System.out.println("x = " + x);
		//	These all work the same:
			/*
			x++;
			x = x + 1;
			x += 1;
			 */

			x += 2;	//This is going to skip by 2:
		
		}
	}
}
