package packageMain;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;
import java.util.*;
public class Driver
{
	public static final Scanner in=new Scanner(System.in); //Global object to take input in multiple classes
	public static Shape shape[];
	public int N;
	SimulateShapes sim;
	public void simulate()
	{
		// finds the shape on the top
		if(N==2)
			shape[0].onTop = shape[1].getShapeID();
		else shape[0].onTop = 0;
		
		// Creates a csv file to store the data
		try {
			WriteToCSV.makeFile();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//calls simulate on different object configurations
		Simulator s=new Simulator(shape);
		sim=s.assignShape(N);
		sim.simulate(shape);
		
		WriteToCSV.closeFile(); //calls method to close the csv file
	}
	
	public static void main(String[] args)
	{
		ShapeCreator shapecreator = new ShapeCreator();
		Driver driver=new Driver();
		
		System.out.println("SPRING FRICTION AND FORCES SIMULATION");
		System.out.println("SET GROUND VARIABLES");
		
		System.out.println("Enter Number of objects to be used in simulation:");	
		driver.N=Driver.in.nextInt();
		while(driver.N>2 || driver.N<=0)
		{
			try {
				throw new NRangeException("Scope of the project is limited. So, enter either 1 or 2. Try Again!");
			}
			catch(NRangeException e)
			{
				System.out.println(e.getMessage());
			}
			driver.N=Driver.in.nextInt();
		}
		
		Ground ground=Ground.getGround(); //returns the singleton object of the Ground class
		ground.readInput();
		
		// Displays the shape details
		driver.shapeDetails();
		shape = shapecreator.shapeCreator(driver.N);
		
		driver.simulate();	// calls the simulate method 	
		System.out.println("Run the Application again to perform a new Simulation");
	}
	
	//Prints the different available shapes
	public void shapeDetails() {
		System.out.println("1. BOX");
		System.out.println("2. BALL");
		System.out.println("3. RING");
		System.out.println("4. CYLINDER");
	}
	
	
}

