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
    //meant to print 'Fizz' on every number that isnt divisable by 5 or 7
    public static FizzBuzz() {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzBuzz = "FizzBuzz";
        int counter = 0;
      for (int i == 0; i >= 100, i++) {
        counter++;
        if (counter % 5 == 0) {
        System.out.println("Buzz");
       } else if (counter % 5 == 0 && counter % 7 == 0) {
        System.out.println("FizzBuzz");  
      } else {
        System.out.println("Fizz");
      }
    }
  }
    public static void placeHolder(double ₍ᐢ•(ܫ)•ᐢ₎ ) {
    }
}




//this lacks a few imports
public PretendSubsystem() {
    //private MotorType NameOfMotor = new MotorType(Which port is the motor plugged into);
    private Spark frontRight = new Spark(0);
    private Spark frontLeft = new Spark(1);
    private Spark backRight = new Spark(2);
    private Spark backLeft = new Spark(3);
  //private MotorControllerGroup NameYouWant = new MotorControllerGroup(One MotorController
    private MotorControllerGroup leftGroup = new MotorControllerGroup(frontLeft, BackLeft);
    private MotorControllerGroup rightGroup = new MotorControllerGroup(frontRight, backRight);
  //private DifferentialDrive NameYouWant = new DifferentialDrive(OneMotorControllerGroup, OtherMotorContollerGroup);
    private DifferentialDrive diffDrive = new DifferentialDrive(leftGroup, rightGroup);
    public class PretendSubsystem extends SubsystemBase{
    leftGroup.setInverted(true);
    rightGroup.setInverted(false);
  }
    public void ArcadeDrive(double speed, double rotation) {
     diffDrive.arcadeDrive(speed, rotation);
    }
}

 public PretendCommand() {
     private PretendSubsystem pretendSubsystem;
 public class PretendCommand {
     addRequirments(pretendSubsystem);
 }
 public void execute() {
    boolean TIP = RobotContainer.gamepad.getRightBumperPressed();
    boolean turtle = RobotContainer.gamepad.getRawButtonPressed(2);
    boolean turbo = RobotContainer.gamepad.getRawButtonPressed(3);
    double speed = turbo ? 0.5 : 1;
    double rotation = turbo ? 0.4 : 0.75;
    pretendSubsystem.ArcadeDrive(
      RobotContainer.touchySticks.getLeftY() * speed,
      RobotContainer.touchySticks.getRightX() * rotation
     );
    }
  }

}
//This lacks a few imports too
public class DemoCode {
  //private SubsystemName NameYouWant = new SubsystemName(Leave Blank);
    private PretendSubsystem pretendSubsystem = new PretendSubsystem();
    private XboxController gamepad = new XboxController;
    
    
    public RobotContainer() {
    pretendSubsystem.setDefaultCommand(new PretendCommand(PretendSubsystem));
  } 
    
}
