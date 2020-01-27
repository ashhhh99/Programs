/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Formatter;
/**
 *
 * @author Ashkan Hariri
 */
public class MathTutor {

    public static void main(String[] args) {
        int answer = 0; // creating int variable for the correct answer.
        int userAnswer; //int variable for user's answer
        Scanner keyboard = new Scanner(System.in);

int number1 = (int) (999 * Math.random() + 1);//generating random number for addtion/subtraction problems
int number2 = (int) (999 * Math.random() + 1);//generating random number for addtion/subtraction problems

int selection = 0;// variable for selection by user
boolean brk = true;//creating boolean variable for while loop
//while loop to run until user makes a correct selection
while(brk) {
  System.out.println("Enter\n 1 for addtion,\n 2 for subtraction\n or\n 3 to exit:");
  //creating try/catch block to inside while loop for exception error
  try {
    String tmp = keyboard.next();
    selection = Integer.parseInt(tmp);//throw error if anything other than int is entered
    //as well as anything outside of 1-3
    if(selection <1 || selection > 3){
      throw new IllegalArgumentException();
    }
    brk = false;
  }
  //if anything other than 1- entered this message is outputed and user must enter a valid number
  catch (Exception e){
    System.out.println("Please try again, you must select between 1-3!");
    
            
  }
}
//once user selects between 1-3 they will go on to this if statments

    if (selection == 1) {
            answer = number1 + number2;
            //nested if/else statments to get larger int on top
            System.out.println("What is ");
            if(number1 > number2){
             //nested if/else statments to get larger int on top mostly formatted
            System.out.println(" " + number1);
            System.out.printf("+%3d\n", number2);
            }
            else{
            System.out.println(" " + number2);
            System.out.printf("+%3d\n", number1);
            }
            
            
            // for subtraction
        }else if (selection == 2) {
            
            System.out.println("What is ");
            //nested if/else statments to get larger int on top mostly formatted
            if(number1 > number2){
                answer = number1 - number2;//putting answer inside the nested if statment 
                //so that the answer is always big number - small number
                
            System.out.println(" "+ number1);
            System.out.printf("-%3d\n", number2);
            }
            else{
                //putting answer inside the nested if statment
                answer = number2 - number1;
            System.out.println(" " + number2);
            System.out.printf("-%3d\n", number1);
            }
        } //if user selects 3 then program terminates
    else {
            System.out.println("Exiting math tutor program");
            System.exit(0); //terminating program
        }
        userAnswer = keyboard.nextInt(); //getting user answer
        
        //if/else statment depanding on whether their answer was correct
        //and outputting that and/or correct answer
        if (userAnswer == answer) {
            System.out.println("Congratdulations that is correct!");
        } else {
            System.out.println("That is not correct, the correct answer is: " + answer);
        }
    }

    }
