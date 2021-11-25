package packageSimulateShapes;
import packageMain.*;
import packageShape.*;
import packageCheckException.*;

public class SimulateCylinderOnGround implements SimulateShapes {
	public void simulate(Shape []shape)
	{
		Ground ground= Ground.getGround();
		WriteToCSV.writeToCSV("Cylinder on Ground Simulation"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s = shape[0].getVelocity()*ground.t;
			shape[0].setLocation_X(shape[0].getLocation_X()+s);
			
			//Method to update the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[0].getLocation_X(), shape[0].getLocation_Y(), shape[0].getVelocity(), shape[0].getOrientation());
		}
	}
}
