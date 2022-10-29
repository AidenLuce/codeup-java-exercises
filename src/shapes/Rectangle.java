package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return (2*width)+(2*length);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


//    ===============================================================================
//    ======= Code that was asked to be removed but I refuse to delete >:( ==========
//    ===============================================================================
//    protected double length;
//    protected double width;
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return(2*length)+(2*width);
//    }
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public Rectangle(){}
}
