package ahpu.shape;

public class Demo {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Ellipse ellipse=new Ellipse();

        circle.setColor("blue");
        circle.draw();

        triangle.setColor("black");
        triangle.draw();

        ellipse.draw();

        Rectangle rectangle=new Rectangle();
        rectangle.setColor("red");
        rectangle.draw();
        rectangle.setLength(100);
        rectangle.setWidth(50);
        rectangle.GetArea();
    }
}
