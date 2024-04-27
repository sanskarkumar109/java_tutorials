import java.util.*;

public class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius ,int height){
        this.radius=radius;
        this.height=height;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }
     
    public int getRadius()
    {
        return radius;
    }
    
    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }

    public double surfacearea(){
        return 2*Math.PI*radius*radius +2*Math.PI*radius*height;
    }

    public double volume()
    {
        return 2*Math.PI*radius*radius*height;
    }

    public static void main(String[] args){
        cylinder c=new cylinder(9,12);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println(c.surfacearea());
        System.out.println(c.volume());
        

    }
}
