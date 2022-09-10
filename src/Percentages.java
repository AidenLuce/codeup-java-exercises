import java.util.Scanner;
public class Percentages {
    public static void computePercent(double element1, double element2){
        System.out.println( element1 + " is " + ((element1 / element2) * 100) + "% of " + element2);
        System.out.println( element2 + " is " + ((element2 / element1) * 100) + "% of " + element1);
    }

    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.println("Please enter two double variables: ");
        double num1 = A.nextDouble();
        double num2 = A.nextDouble();

        computePercent(num1,num2);
    }
}
