package packageSimulateShapes;
import packageMain.*;
import packageShape.*;
import packageCheckException.*;
//Class to simulate the 
public class SimulateBallOnBox implements SimulateShapes{

	public void simulate(Shape shape[])
	{
		Ground ground= Ground.getGround();
		double l_x = shape[0].getLocation_X(); //Store the initial location_X
		double v_x = shape[0].getVelocity(); //Store the initial velocity
		
		double a=-ground.getMu()*ground.getG(); // calculates the acceleration
		WriteToCSV.writeToCSV("Simulation of BALL"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[1].getVelocity()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[1].setLocation_X(shape[1].getLocation_X()+s);
			double v=shape[1].getVelocity()+a*ground.t;
			shape[1].setVelocity(v);
			
			//Method to update data on the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[1].getLocation_X(), shape[1].getLocation_Y(), shape[1].getVelocity(), shape[1].getOrientation());

		}
		
		//Set the shape zero to its initial configuration
		shape[0].setLocation_X(l_x);
		shape[0].setVelocity(v_x);
		
		a=-ground.getMu()*ground.getG(); // calculates the acceleration
		WriteToCSV.writeToCSV("Simulation of BOX"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[0].getVelocity()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[0].setLocation_X(shape[0].getLocation_X()+s);
			double v=shape[0].getVelocity()+a*ground.t;
			shape[0].setVelocity(v);
			//Method to update data on the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[0].getLocation_X(), shape[0].getLocation_Y(), shape[0].getVelocity(), shape[0].getOrientation());
		}
	}
}
