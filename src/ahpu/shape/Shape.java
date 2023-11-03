package ahpu.shape;

public abstract class Shape {
    public String color;

    public abstract void draw();

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }
}
