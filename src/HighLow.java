import java.util.Scanner;
import java.lang.Math;
public class HighLow {
    public static String guess(){
        double RN = (Math.floor(Math.random()* 100));

        Scanner SC = new Scanner(System.in);
        int guess;
        do{
            System.out.println("Guess a number 1-100");
            guess = SC.nextInt();
            if (guess > RN) {
                System.out.println("LOWER");
            } else if (guess < RN) {
                System.out.println("HIGHER");
            } else{
                System.out.println("GOOD GUESS!");
            }
        }while(guess != RN);
        return "GOOD GUESS!";
    }
    public static void main(String[] args){
        guess();
    }
}
