public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        width=1;
        height=1;
    }
    public Rectangle(double w,double h){
        setWidth(w);
        setHeight(h);
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        if(w>0) width=w;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        if(h>0) height=h;
    }

    public double area(){
        return  width*height;
    }
    public double perimeter(){
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Width: "+width+" -- Height: "+height;
    }
}
