package packageShape;
import packageMain.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public class Cylinder extends Shape implements RollableShapes{
	private double height;
	private double radius;
	private double mOI;
	
	//implemented from interface
	public void calcMOI()
	{
		mOI= 0.5*this.getMass()*radius*radius;	
	}
	
	@Override
	public void readInput()
	{
		super.readInput();
		System.out.println("Enter the cylinder height in cm:");
		height=Driver.in.nextInt();
		System.out.println("Enter the cylinder radius in cm:");
		radius=Driver.in.nextInt();
	}
		
	//Getter and Setter functions
	public double getHeight()
	{
		return height;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getMOI()
	{
		return mOI;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	 
}