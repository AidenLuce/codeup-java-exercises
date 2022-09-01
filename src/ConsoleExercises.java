import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;

        String words = "The value of pi is approximately";
        System.out.format("%s %.2f.%n", words, pi);

        Scanner enterInt = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int yourInt4 = enterInt.nextInt();
        System.out.print("your integer => " + yourInt4 +"\n");
        Scanner enterInt2 = new Scanner(System.in);
        System.out.print("Enter 3 Integers por favor: ");
        int yourInt1 = enterInt2.nextInt();
        int yourInt2 = enterInt2.nextInt();
        int yourInt3 = enterInt2.nextInt();
        System.out.print("These are your Integers => " + yourInt1 +", "+ yourInt2+",& "+yourInt3+"\n");

        Scanner enterWord = new Scanner(System.in);
        System.out.print("Enter 3 words por favor: ");
        String yourWord1 = enterWord.next();
        String yourWord2 = enterWord.next();
        String yourWord3 = enterWord.next();
        System.out.print("These are your words => " + yourWord1 +", "+ yourWord2+",& "+yourWord3+"\n");

        Scanner enterSentence = new Scanner(System.in);
        System.out.print("Pls enter a sentence: ");
        String yourSentence = enterSentence.nextLine();
        System.out.print("Your sentence is => "+ yourSentence + "\n");

        Scanner enterL = new Scanner(System.in);
        System.out.print("please enter the length of the classroom: \n");
        int length = Integer.parseInt(enterL.nextLine());
        Scanner enterW = new Scanner(System.in);
        System.out.print("please enter the width of the classroom: \n");
        int width = Integer.parseInt(enterW.nextLine());
        System.out.print("The area of the classroom is: "+ (width * length)+"\n" +
                "The perimeter of the classroom is: "+(width + width + length + length)+"\n");
    }
}
