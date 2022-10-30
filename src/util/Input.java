package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public  Input(){
       this.scanner = new Scanner(System.in);
    }
    public String getString(){
       return this.scanner.nextLine();
    }

    public String getString(String input){
        System.out.println(input);
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
        String input = getString();
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException e){
            System.out.println("ERROR please enter an integer.");
            return getInt();
        }
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
        String input = getString();
        try{
            return Double.parseDouble(input);
        } catch (NumberFormatException e){
            System.out.println("ERROR please enter a Double.");
            return getDouble();
        }
    }
}
