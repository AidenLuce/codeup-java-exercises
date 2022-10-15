package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter circle radius: ");
        Input test = new Input();
        Circle test2 = new Circle(test.getDouble());
        System.out.printf("Your circle's area: %s \nYour circle's circumference: %s",test2.getArea(), test2.getCircumference());
    }
}
