package section1;

public class SwitchCase {

	public static void main(String[] args) {
		
		int j = 2;
		// if j = 5 (or something not listed below), then default.
		
		switch(j) {
			
			case 0:
				System.out.println("Value is 0");
				break;	//Without "break" statement, it will fall down to case 1
			case 1:
				System.out.println("Value is 1");
				break;
			case 2:
				System.out.println("Value is 2");
				break;
			case 3:
				System.out.println("Value is 3");
				break;
			default:
				System.out.println("No Value j");
			}
		
		
		String k = "Two";
				
		switch(k){
					
			case "Zero":
				System.out.println("Value is Zero");
				break;
			case "One":
				System.out.println("Value is One");
				break;
			case "Two":
				System.out.println("Value is Two");
				break;
			case "Three":
				System.out.println("Value is Three");
				break;
			default:
				System.out.println("No Value k");
			
		}
	}
}
