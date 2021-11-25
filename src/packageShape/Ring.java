package packageShape;
import packageMain.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public class Ring extends Shape{
	private double radius;
	private double mOI;
	
	//Method to read the input of the specified shape
	public void readInput()
	{
		super.readInput(); //calls the parent method to input the common attributes
		System.out.println("Enter the ring radius in cm:");
		radius=Driver.in.nextDouble();
	}
	
	// implemented method from the interface
	public void calcMOI()
	{
		mOI= 2*this.getMass()*radius*radius/3;	
	}
	
	//Getter and Setter Functions
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getmOI()
	{
		return mOI;
	}
}
