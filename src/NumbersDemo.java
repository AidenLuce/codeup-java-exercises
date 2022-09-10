import java.util.Scanner;
public class NumbersDemo {
    public static void  displayTwiceTheNumber(int element1, int element2){
        System.out.println("Double "+ element1 +" = "+(element1 * 2 ) + "\n" + "Double " + element2 + " = " + (element2 * 2));
    }
    public static void displayNumberPlusFive(int element1, int element2){
        System.out. println(element1 + " + 5 = " +(element1 + 5) + "\n" + element2 + " + 5 = " +(element2 + 5));
    }
    public static void displayNumberSquared(int element1, int element2){
        System.out.println(element1 + " Squared = " + (element1 * element1) + "\n" + element2 + " Squared = " + (element2 * element2));
    }

    public static void main (String[] args){
        Scanner A = new Scanner(System.in);
        System.out.println("Please insert two integers: ");
        int num1 = A.nextInt();
        int num2 = A.nextInt();

        displayTwiceTheNumber(num1,num2);
        displayNumberPlusFive(num1,num2);
        displayNumberSquared(num1, num2);
    }
}
