
public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Cylindar "+getName()+" with radius of "+getRadius()+" with height of "+getHeight();
    }
    public double getVolume(){
	return getArea()*getHeight();
    }
}