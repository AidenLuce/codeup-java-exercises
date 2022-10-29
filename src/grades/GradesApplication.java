package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        students.put("Mercenary.git", new Student("Mark Specter"));
        students.put("Museum Worker.git", new Student("Steven Grant"));
        students.put("Taxi Driver with a cool flat cap.git", new Student("Jake Lockley"));
        students.put("SuperHero.git", new Student("MoonKnight"));
        students.get("Mercenary.git").addGrade(85);
        students.get("Mercenary.git").addGrade(86);
        students.get("Mercenary.git").addGrade(87);
        students.get("Museum Worker.git").addGrade(98);
        students.get("Museum Worker.git").addGrade(99);
        students.get("Museum Worker.git").addGrade(100);
        students.get("Taxi Driver with a cool flat cap.git").addGrade(32);
        students.get("Taxi Driver with a cool flat cap.git").addGrade(45);
        students.get("Taxi Driver with a cool flat cap.git").addGrade(56);
        students.get("SuperHero.git").addGrade(100);
        students.get("SuperHero.git").addGrade(100);
        students.get("SuperHero.git").addGrade(100);
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println("==========================================================================================");
        System.out.println("|Mercenary.git| |Museum Worker.git| |Taxi Driver with a cool flat cap.git| |SuperHero.git|");
        System.out.println("==========================================================================================\n");


        String exitOrContinue;
        do {
            System.out.println("What student would you like to see more information on?");
            String userInput = scanner.nextLine();
            if (students.containsKey(userInput)) {
                System.out.printf("Name: %s - Github username: %s\nCurrent Average: %s\n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
            } else {
                System.out.println("Invalid Username");
            }
            System.out.println("Would you like to continue? Y/N");
            exitOrContinue = scanner.nextLine();
        } while (!exitOrContinue.equalsIgnoreCase("n"));
        System.out.println("Thank you come again!");
    }
}
