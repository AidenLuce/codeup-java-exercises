import java.util.Scanner;
public class Bob {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi! My name is Bob! You can ask/tell me anything! ");
        String QorS;
        do {
            QorS = userInput.nextLine();
            if (QorS.endsWith("?")) {
                System.out.println("Sure");
            } else if (QorS.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (QorS.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (QorS.equalsIgnoreCase("goodbye")){
                System.out.println("Later");
            } else {
                    System.out.println("whatever");
                }
        } while(!QorS.equalsIgnoreCase("goodbye"));
    }
}
