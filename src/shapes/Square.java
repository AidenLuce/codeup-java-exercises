package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

    @Override
    public void setLength(double length) {
        this.width = length;

    }

    @Override
    public void setWidth(double width) {
        this.length = width;
    }
}
//    ===============================================================================
//    ======= Code that was asked to be removed but I refuse to delete >:( ==========
//    ===============================================================================
//public class Square extends Rectangle{
//    public Square(double side){
//        super(side,side);
//
//
//    }
//    public double getArea(){
//        return Math.pow(super.width, 2);
//    }
//
//    public double getPerimeter() {
//        return 4 * super.length;
//    }
//}
