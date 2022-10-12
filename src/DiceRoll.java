import java.util.Scanner;
import java.lang.Math;
public class DiceRoll {
    public static String roll(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to roll? (Y/N)");
        String response = userInput.next();
        if (response.equalsIgnoreCase("y")){
            System.out.println("Please enter the number of sides on the dice: ");
            int num = userInput.nextInt();
            double dice1 = Math.floor(Math.random() * num) + 1;
            double dice2 = Math.floor(Math.random() * num) + 1;
            System.out.println(dice1);
            System.out.println(dice2);
            return roll();
        } else if (response.equalsIgnoreCase("n")){
            return ("Goodbye");
        }
        System.out.println("Invalid response");
        return roll();
    }
    public static void main (String [] args){
        roll();
    }
}
