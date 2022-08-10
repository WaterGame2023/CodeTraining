package section1;

public class AndOrStatements {

	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y = -10;
		
		if(x > 0 && y > 0) {
			System.out.println("Both numbers are Positive");
		}else if(x > 0 || y > 0) {
			System.out.println("At least one number is Postive");
		}else {
			System.out.println("Both numbers are Negative");
		}
	}
}
