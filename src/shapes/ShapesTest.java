package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("Box1:");
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter() + "\n");
//        System.out.println("Box2:");
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter()+"\n");
//        System.out.println("Square refactor:");
//        Square refactor = new Square(5);
//        System.out.println(refactor.getArea());
//        System.out.println(refactor.getPerimeter()+"\n");
        Measurable myShape;
        System.out.println("Overcomplicated square refactor");
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println("Overcomplicated rectangle refactor");
        myShape = new Rectangle(4,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
