package section1;

public class StringsAndWrapper {

	public static void main(String[] args) {
		
		
		String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		//Make everything upper case
		System.out.println(x.toUpperCase());
		
		//Starting from 2, not at 2
		System.out.println(x.substring(2));
		
		//From 2, up to 7 (Does not include 2 or 7)
		System.out.println(x.substring(2,7));
		
		//Print 3
		System.out.println(x.charAt(3));
		

		
		System.out.println("-----------");
		
		String age = "37";
		String salary = "78965.83";
		
		//Convert string to an integer
		int a = Integer.parseInt(age) + 2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);
		
	}

}
