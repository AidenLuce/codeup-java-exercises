import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

//        int i = 5;
//        int x = 100;
//        long y = 2;

//       while(i <= 15){
//           System.out.println(i);
//           i++;
//       }

//       do{
//           System.out.println(x);
//           x -= 5;
//       } while (x >= -10);

//        do{
//        System.out.println(y);
//        y = y * y;
//        } while (y < 1000000);

//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for(int i = 100; i >= -10; i -=5){
//            System.out.println(i);
//        }
//        for (long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else{
//                System.out.println(i);
//            }
//
//        }
        Scanner enterNum = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int yourNum = enterNum.nextInt();
        System.out.println("Here is your table!\n");
        System.out.println(
                "number | squared | cubed\n" +
                "------ | ------- | -----\n");
        for(int i = 1; i <= yourNum; i++){
            int squared = i * i;
            int cubed = i*i*i;

            System.out.println(i+ "      | " + (squared) + "       | " + (cubed) );
        }



    }
}
