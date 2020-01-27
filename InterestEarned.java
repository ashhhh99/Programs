
import java.util.Scanner;



/**
 *
 * @author Ashkan Hariri
 * 01/11/2020
 */
public class InterestEarned {
    public static void main(String[] args) {
    
    //********Interest Earned after one year ********************
    //  
    
    double principal; //Declare double constant for principle investment
    double rate; //Declare a double variable for interest rate
    double time; //Declare a double variable to amount of time 
    //investment compounds in a year
    double amount; //declare a double variable for the interest earned
    double interestEarned; //declare variable for interest earned.
    Scanner keyboard = new Scanner(System.in); 

    System.out.println("Enter your principle investment: ");
    //prompting user to enter principal investment
    principal = keyboard.nextDouble();
    //input principal
    System.out.println("Enter the interest rate in decimal form: ");
    //prompting user to enter interest rate in decimal form
    rate = keyboard.nextDouble();
    //Input rate
    System.out.println("Enter how many times your investment compounds: ");
    //prompting user to enter times investment is compounded
    time = keyboard.nextDouble();
    //input time
    amount = principal * Math.pow(1.0 + rate/time, time);
    //calculating using the formula Amount = Principal * (1 + Rate/T)^T
    interestEarned = amount - principal;
    //calculating the interest earned by subtracting amount from principal
    System.out.println("Interest rate: "+ rate);
    //outputting interest rate
    System.out.println("Times compounded: ");
    //outputting times compounded
    System.out.println("Principal: "+ principal);
    //outputting principal investment
    System.out.println("Interest earned: "+ interestEarned);
    //outputting interest earned
    System.out.println("Amount in savings:  "+ amount);
    //outputting total amount in savings including principal and interest.
    
    }
}
