import java.util.Scanner;
public class ControlFlowExercises {

    public static void letterGrade(int num){
        if (num <= 100 && num >= 88){
            System.out.println("A");
        } else if (num <= 87 && num >= 80){
            System.out.println("B");
        } else if (num <= 79 && num >= 67){
            System.out.println("C");
        } else if (num <= 66 && num >= 60) {
            System.out.println("D");
        } else if (num <= 59) {
            System.out.println("F");
        } else {
            System.out.println("N/A");
        }
    }










    public static void main(String[] args) {

        int q = 5;
        int x = 100;
        long y = 2;

//        while (q <= 15) {
//            System.out.println(q);
//            q++;
//        }
//
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while (x >= -10);
//
//        do {
//            System.out.println(y);
//            y = y * y;
//        } while (y < 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//
//        }
        Scanner enterNum = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//        int yourNum = enterNum.nextInt();
//        System.out.println("Here is your table!\n");
//        System.out.println(
//                "number | squared | cubed\n" +
//                        "------ | ------- | -----\n");
//        for (int i = 1; i <= yourNum; i++) {
//            int squared = i * i;
//            int cubed = i * i * i;
//
//            System.out.println(i + "      | " + (squared) + "       | " + (cubed));
//        }
//
        Scanner userInput = new Scanner(System.in);
        boolean noSelection = false;
        do {
            System.out.println("Please enter your number grade (1-100): ");
        int numGrade = enterNum.nextInt();
        letterGrade(numGrade);
            System.out.println("Do you want to continue? Y/N");
            char userChoice = userInput.next().charAt(0);
            if (userChoice == 'Y') {
                noSelection = true;
            }
        }  while (noSelection);
//
    }
}
