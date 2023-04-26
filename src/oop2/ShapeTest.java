package oop2;

public class ShapeTest {
    public static void main(String[] args){

        Triangle triangle = new Triangle(2,5);
        Rectangle rectangle = new Rectangle(8,3);
        Circle circle = new Circle(8);
        Shape[] shapes = { triangle, rectangle,circle};

        int totalsum = getTotalArea(shapes);
        System.out.println(totalsum);
    }


    public static int getTotalArea(Shape[] sh) {
        int sum = 0;
        for (var i = 0; i < sh.length; i++){
            sum += sh[i].calculateArea();
        }
        return sum;
    }

}
