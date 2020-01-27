import java.util.Scanner;


/**
 *
 * @author Ashkan Hariri
 * 01/11/2020
 */
public class resturantBill {
    
    public static void main(String[] args) {
    
    //******** Resturant Bill ********************
    // Calculate resturant bill with tip based off total with tac 
    
    final double tax = 0.1; //Declare double constant for tax to hold 10%
    double subTotal; //Declare a double variable to store subtotal
    double tip; //Declare a double variable to store tip %
    double finalTotal; //total before tip
    double total; //Declare a double variable to store the final total
    double tipAmount; //declaring a double variable to display tip amount
    double taxAmount;//declaring variable to display tax amount
    
    Scanner keyboard = new Scanner(System.in); 
	

    System.out.println("Enter the subtotal:");
    //prompt user to enter subtotal
    subTotal = keyboard.nextDouble();
    //input subtotal
    System.out.println("Enter the tip in decimal form:");
    //prompt user to enter tip percentage
    tip = keyboard.nextDouble();
    //input tip percentage
    taxAmount = subTotal * tax;
    //calculating tax amount
    total = (subTotal * tax + subTotal);
    //calculating total with tax
    tipAmount = total * tip;
    //calculating tip amount
    
    finalTotal = total * tip + total;
    //calculating final total with tax and tip included
    System.out.println("Your total with tax is "+ total);
    //outputting total with tax but no tip
    System.out.println("Your total tax is "+ taxAmount);
    //outputting tax total
    System.out.println("Your total tip is "+ tipAmount);
    //outputting tip amount
    System.out.println("Your final total with tax and tip is "+ finalTotal);
    //outputting final total with tax and tip
    
    }
}
