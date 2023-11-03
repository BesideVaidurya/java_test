package ahpu.shape;

public class Rectangle extends Shape implements IGeometry{
    int length;
    int width;
    public void draw(){
        System.out.println("Draw a circle with color: " + this.getColor() );
    }

    public void GetArea(){
        System.out.println(this.length*this.width);
    }

    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
}
