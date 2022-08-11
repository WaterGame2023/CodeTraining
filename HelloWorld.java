public class HelloWorld {
    
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";
        System.out.println(one + two);
    }  
    public static If-Then-ElseIf() {
        double price = 2.5;
        int stock = 20;
        double givenMoney = 3;
        double change = givenMoney -= price;
        
       if (stock >= 1) {
      System.out.println("Available For Purchase!");
    } else {
      System.out.println("Sorry, This Item Is Out Of Stock!");
    }
      if (change >= 0.1) {
      System.out.println("You Have Enough To Purchase! Your change is " + change + "!");
    } else if (change == 0) {
      System.out.println("You Have Enough To Purchase! You do not get any change.");               
    } else {
      System.out.println("You Do Not Have Enough To Purchase!");
    }
  }   
}
