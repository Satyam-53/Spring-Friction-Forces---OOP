package packageSimulateShapes;
import packageMain.*;
import packageShape.*;

import packageCheckException.*;
public class SimulateBoxOnGround implements SimulateShapes{
	public void simulate(Shape shape[])
	{
		Ground ground= Ground.getGround();
		double a=-ground.getMu(); // Calculates acceleration
		WriteToCSV.writeToCSV("BOX On Ground Simulation"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[0].getVelocity()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[0].setLocation_X(shape[0].getLocation_X()+s);
			double v=shape[0].getVelocity()+a*ground.t;
			shape[0].setVelocity(v);
			//Method to update the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[0].getLocation_X(), shape[0].getLocation_Y(), shape[0].getVelocity(), shape[0].getOrientation());
		}
	}
}
