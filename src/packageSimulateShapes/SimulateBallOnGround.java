package packageSimulateShapes;
import packageMain.*;
import packageShape.*;
import packageCheckException.*;
public class SimulateBallOnGround implements SimulateShapes{
	public void simulate(Shape shape[])
	{
		Ground ground= Ground.getGround();
		
		//Assumption taken that the object is always in pure rolling motion
		WriteToCSV.writeToCSV("Simulation of BALL ON GROUND"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s = shape[0].getVelocity()*ground.t;
			shape[0].setLocation_X(shape[0].getLocation_X()+s);
			
			//Method to update data on the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[0].getLocation_X(), shape[0].getLocation_Y(), shape[0].getVelocity(), shape[0].getOrientation());
		}
	}
}
