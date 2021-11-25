package packageSimulateShapes;
import packageMain.*;
import packageShape.*;
import packageCheckException.*;
public class SimulateRingOnBox implements SimulateShapes{
	public void simulate(Shape []shape)
	{
		Ground ground= Ground.getGround();
		double a=-ground.getMu()*ground.getG(); //Calculates acceleration
		double l_x = shape[0].getLocation_X(); //Stores initial location of the object
		double v_x = shape[0].getVelocity(); //Stores initial velocity of the object
		
		WriteToCSV.writeToCSV("Ring Simulation"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[1].getVelocity()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[1].setLocation_X(shape[1].getLocation_X()+s);
			double v=shape[1].getVelocity()+a*ground.t;
			shape[1].setVelocity(v);
			
			//Method to update the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[1].getLocation_X(), shape[1].getLocation_Y(), shape[1].getVelocity(), shape[1].getOrientation());
		}
		
		shape[0].setLocation_X(l_x);
		shape[0].setVelocity(v_x);
		
		a=-ground.getMu()*ground.getG(); //Calculates acceleration
		WriteToCSV.writeToCSV("BOX Simulation"); //Method to print the simulated shape
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[0].getVelocity()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[0].setLocation_X(shape[0].getLocation_X()+s);
			double v=shape[0].getVelocity()+a*ground.t;
			shape[0].setVelocity(v);
			
			//MEthod to update the CSV file
			WriteToCSV.writeToCSV(ground.t*(i+1), shape[0].getLocation_X(), shape[0].getLocation_Y(), shape[0].getVelocity(), shape[0].getOrientation());
		}
	}
}
