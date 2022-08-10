package section1;

public class IfElseCondition {

	public static void main(String[] args) {
		
		int x = 20;
		int y = 20;
		
		/*
		if (x < y){
			System.out.println("x is less than y");
		}if (x == y){
			System.out.println("x is equal to y");
		}if (x > y){
			System.out.println("x is greater than y"); 
		*/
		
		//These work the same as above.
		
		if (x < y){
			System.out.println("x is less than y");
		}else if (x == y){
			System.out.println("x is equal to y");
		}else {
			System.out.println("x is greater than y");
		}
	}
}
