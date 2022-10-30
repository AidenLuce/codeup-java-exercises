import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input I1 = new Input();
        System.out.println(I1.yesNo());
        System.out.println(I1.getInt( 3,24 ));
        System.out.println("Enter an Integer:");
        System.out.println(I1.getInt());
        System.out.println(I1.getDouble(2.5, 134.6));
        System.out.println("Enter a Double:");
        System.out.println(I1.getDouble());
        }
    }


