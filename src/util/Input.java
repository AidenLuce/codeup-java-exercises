package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public  Input(){
       this.scanner = new Scanner(System.in);
    }
    String getString(){
       return this.scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Yes or No: ");
        String s1 = getString();
        return s1.equalsIgnoreCase("y") || s1.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        System.out.println("type a number between min and max: ");
         int userInput;
        do{
            userInput= Integer.parseInt(getString());
        }while(userInput < min || userInput > max);
        return userInput;
    }
    public int getInt(){
        return Integer.parseInt(getString());

    }
    public double getDouble(double min, double max){
        System.out.println("type a number between min and max: ");
        double userInput;
        do{

            userInput= Double.parseDouble(getString());
        }while(userInput < min || userInput > max);
        return userInput;
    }
    public double getDouble(){
        return Double.parseDouble(getString());
    }




}
