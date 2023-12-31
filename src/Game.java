
import javax.swing.*;

public class Game {
   public static void main(String[] args) {
       int computerNumber = (int) (Math.random()*10 + 1);
       int userAnswer = 0;
       System.out.println("The correct guess would be " + computerNumber);
        int num = 1;

       while (userAnswer != computerNumber)
       {
           String response = JOptionPane.showInputDialog(null,
               "Enter a guess between 1 and 10", "Guessing Game",3);
           userAnswer = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, num));
           num++;
       }  
   }

   public static String determineGuess(int userAnswer, int computerNumber, int num){
       if (userAnswer <=0 || userAnswer >10) {
           return "Your guess is invalid";
       }
       else if (userAnswer == computerNumber ){
           return "Correct!\nTotal Guesses: " + num;
       }
       else if (userAnswer > computerNumber) {
           return "Your guess is too high, try again.\nTry Number: " + num;
       }
       else if (userAnswer < computerNumber) {
           return "Your guess is too low, try again.\nTry Number: " + num;
       }
       else {
           return "Your guess is incorrect\nTry Number: " + num;
   	}
   }
}
