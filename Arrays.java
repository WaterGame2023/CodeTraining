package section1;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * int a = 10; 
		 * int b = 20; 
		 * int c, d, e; 
		 * c = 30; 
		 * d = 40; e = 50;
		 */
		
		/*
		 * int a1 = 10;
		 * int a2 = 10;
		 */
		
		
		int [] a = {10, 20, 30, 40, 50};	//Best way to store data
		
		System.out.println(a[2] + " " + a[4]);
		
		//enhanced for
		for(int temp: a) {
			System.out.println(temp);
		}

		System.out.println("-------------1");
		
		int[] x = new int [5]; //This x-array have 5 numbers.
		
		x[3] = 25;
		x[0] = 12;	//The ones that are not listed will be 0.
		
		
		for(int temp2: x) {
			System.out.println(temp2);
		}
		
		System.out.println("-------------2");
		
		String[] st = {"one", "two", "three"};
		
		for(String temp3: st) {
			System.out.println(temp3);
		}
		
		System.out.println("-------------3");
		
		String[] stx = new String[5];
		
		stx[3] = "25";
		stx[0] = "12";	//The ones that are not listed will be null.
		
		
		for(String temp4: stx) {
			System.out.println(temp4);
		}
	}
}
