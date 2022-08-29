public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World");
        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);
        double myString = 3.14159;
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        {
            int x = 4;
            System.out.println(x += 5);
        }
        {
            int x = 3;
            int y = 4;
            System.out.println(y *= x);
        }
        {
            int x = 10;
            int y = 2;
            System.out.println(x /= y);
            System.out.println(y -= x);
        }
    }
}
