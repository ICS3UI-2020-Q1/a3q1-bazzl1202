import java.util.Scanner;
/**
 * Finds the maximum number out of three numbers.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to input three integers
    System.out.println("Please enter three integers on separate lines");

    // delclare and initialize the three integers
    int integerOne = input.nextInt();
    int integerTwo = input.nextInt();
    int integerThree = input.nextInt(); 

    // determining the maximum integer
    if (integerOne >= integerTwo && integerOne >= integerThree){
      System.out.println("Maximun: " + integerOne);
    }else if(integerTwo >= integerOne && integerTwo >= integerThree){
      System.out.println("Maximun: " + integerTwo);
    }else if(integerThree >= integerOne && integerThree >= integerTwo){
      System.out.println("Maximum: " + integerThree);
    }


    
  }
}
