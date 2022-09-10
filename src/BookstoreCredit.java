import java.util.Scanner;
public class BookstoreCredit {
    public static void nameAndGrade(String nameElement,Double gradeElement ){
        System.out.println("Hello " + nameElement + "!\n" + "Your GPA is: " + gradeElement + "\n" + "Your credit is: $" + (gradeElement * 10));
    }
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = A.nextLine();
        System.out.println("Please enter your GPA: ");
        double GPA = A.nextDouble();

        nameAndGrade(name, GPA);
    }
}
