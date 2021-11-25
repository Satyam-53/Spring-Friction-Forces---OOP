package packageMain;

import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public class Ground {
	private static Ground ground=null;
	private double g;
	private double mu;
	public int k;
	public double t;
	
	//Method to read the ground inputs
	public void readInput()
	{
		System.out.println("Enter acceleration due to gravity-(m/s^2)");
		g=Driver.in.nextDouble();
		System.out.println("Enter coeficient of friction-");
		mu=Driver.in.nextDouble();
		System.out.println("Enter number of snapshots-");
		k=Driver.in.nextInt();
		System.out.println("Enter time slice-(s)");
		t=Driver.in.nextDouble();
		System.out.println("---------------------------------------------------------------------");
	}
	
	//Static method to return the ground object
	public static Ground getGround() {
		if(ground != null)
			return ground;
		else {
			ground = new Ground();
			return ground;
		}
	}
	
	//Getter and Setter functions
	public double getMu()
	{
		return mu;
	}
	public double getG()
	{
		return g;
	}
	public void setMu(double Mu) {
		this.mu = Mu;
	}
	public void setG(double g) {
		this.g = g;
	}
	
}

