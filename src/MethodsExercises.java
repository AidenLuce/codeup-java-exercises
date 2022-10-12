import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    public static void addition (int x, int y){
        System.out.println(x + y);
    }
    public static void subtraction (int x, int y){
        System.out.println(x - y);
    }
    public static void multiplication (int x, int y){
        System.out.println(x * y);
    }
    public static void division (int x, int y){
        System.out.println(x / y);
    }
    public static void modulus (int x, int y){
        System.out.println(x % y);
    }
    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num >= min && num <= max){
            return num;
        } else {
            return getInteger(min, max);
        }
    }
    public static String factorial(){
        System.out.print("Enter a number from 1 to 10: ");
        Scanner input = new Scanner(System.in);
        int num2 = input.nextInt();
        long total = num2;
        for (int i = 1; i < num2; i++){
            total *= i;
        }
        System.out.println(total);
        System.out.println("Would you like to continue? (Y/N) ");
        Scanner input2 = new Scanner(System.in);
        String response = input2.nextLine();
        if (response.equalsIgnoreCase("Y")){
            return factorial();
        } else {
            return "goodbye";
        }
    }

    public static void main (String [] args){
        addition(10,8);
        subtraction(10, 7);
        multiplication(10, 8);
        division(10, 5);
        modulus(100, 8);
        System.out.println(getInteger(1,10));
        System.out.println(factorial());
    }
}
