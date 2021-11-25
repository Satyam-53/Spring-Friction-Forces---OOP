package packageMain;

import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;
public class Simulator {
	Shape []shape;
	SimulateShapes sim;
	Simulator(Shape shape[])
	{
		this.shape=shape;
	}
	
	//Method to create objects for specific orientation
	public SimulateShapes assignShape(int n)
	{
		
		if(n==1 && shape[0].getShapeID()==1)
			sim=new SimulateBoxOnGround();
		else if(n==2 && shape[0].getShapeID()==1 && shape[1].getShapeID()==1)
			sim=new SimulateBoxOnBox();
		else if(n==1 && shape[0].getShapeID()==2)
			sim=new SimulateBallOnGround();
		else if(n==2 && shape[0].getShapeID()==1 && shape[1].getShapeID()==2)
			sim=new SimulateBallOnBox();
		else if(n==1 && shape[0].getShapeID()==3)
			sim=new SimulateRingOnGround();
		else if(n==2 && shape[0].getShapeID()==1 && shape[1].getShapeID()==3)
			sim=new SimulateRingOnBox();
		else if(n==1 && shape[0].getShapeID()==4) 
			sim = new SimulateCylinderOnGround();
		
		return sim; //returns object
	}
}
