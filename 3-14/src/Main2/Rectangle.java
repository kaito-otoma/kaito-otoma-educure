package Main2;

public class Rectangle extends Shape{
    double height;
    double width;

    public Rectangle(double width, double height){ 
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return height * width;
    }
}
