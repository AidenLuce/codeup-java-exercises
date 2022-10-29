package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
//    what is the point of adding this ^
    protected double length;
    protected double width;

// Constructors
    public Quadrilateral(){} // Default
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }


//    Getters
    public double getLength(double length){
        return length;
    }
    public double getWidth(double length){
        return width;
    }
//    Setters
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
