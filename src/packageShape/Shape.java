package packageShape;
import packageMain.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public abstract class Shape {
	private int shapeId;
	private double mass;
	private double orientation;
	private double x_initial;
	private double y_initial;
	private double velocity;
	public int onTop;
	
	//Method to read the common attributes of all the shapes
	public void readInput()
	{
		System.out.println("Enter mass in kg: ");
		mass=Driver.in.nextDouble();
		System.out.println("Enter orientation in degrees");
		orientation=Driver.in.nextDouble();
		System.out.println("Enter the X coordinate:");
		x_initial=Driver.in.nextDouble();
		System.out.println("Enter the Y coordinate:");
		y_initial=Driver.in.nextDouble();
		System.out.println("Enter the velocity in m/s:");
		velocity=Driver.in.nextDouble();

	}
	
	// Getter and Setter Functions
	public int getShapeID()
	{
		return shapeId;
	}
	public double getMass()
	{
		return mass;
	}
	public double getOrientation()
	{
		return orientation;
	}
	public double getLocation_X()
	{
		return x_initial;
	}
	public double getLocation_Y()
	{
		return y_initial;
	}
	public double getVelocity()
	{
		return velocity;
	}
	public void setShapeID(int shapeId)
	{
		this.shapeId=shapeId;
	}
	public void setMass(double mass)
	{
		this.mass=mass;
	}
	public void setOrientation(double orientation)
	{
		this.orientation=orientation;
	}
	public void setLocation_X(double x_initial)
	{
		this.x_initial=x_initial;
	}
	public void setLocation_Y(double y_initial)
	{
		this.y_initial=y_initial;
	}
	public void setVelocity(double velocity)
	{
		this.velocity=velocity;
	}

}
