public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return "FIXME!";
    }
    public double getVolume(){
	return Math.PI*4*getRadius()*getRadius()*getRadius()/3;
    }
}


