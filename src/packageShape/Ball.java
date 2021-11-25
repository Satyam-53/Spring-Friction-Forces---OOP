package packageShape;
import packageMain.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public class Ball extends Shape implements RollableShapes{
	private double radius;
	private double mOI;
	@Override
	public void readInput()
	{
		super.readInput();
		System.out.println("Enter the ball radius in cm:");
		radius=Driver.in.nextInt();
	}
	
	//Function to calculate the moment of inertia
	public void calcMOI()
	{
		mOI= 2*this.getMass()*radius*radius/3;	
	}
	
	//Getter and Setter functions
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
