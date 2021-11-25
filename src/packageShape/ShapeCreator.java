package packageShape;
import packageMain.*;
import packageSimulateShapes.*;
import packageCheckException.*;
//Class to create objects of different shapes based on the input by the user
public class ShapeCreator {
	
	public Shape[] shapeCreator(int N) {
		Shape[] shape = new Shape[N];
		for(int i=0; i<N; i++)
		{
			System.out.println("-----------------------------<<ENTER SHAPE DETAILS>>-----------------------------------------");
			
			//Creates objects of different shapes
			System.out.println("Enter Shape ID:");
			int temp=Driver.in.nextInt();
			
			CheckException cE=new CheckException();
			if(cE.checkExcpetion(temp, i+1, N)) 
				System.exit(0);
			
			switch(temp)
			{
			case 1:
				shape[i]=new Box();
				shape[i].setShapeID(temp);
				shape[i].readInput();
				break;
			case 2:
				shape[i]= new Ball();
				shape[i].setShapeID(temp);
				shape[i].readInput();
				break;
			case 3:
				shape[i]= new Ring();
				shape[i].setShapeID(temp);
				shape[i].readInput();
				break;
			case 4:
				shape[i]= new Cylinder();
				shape[i].setShapeID(temp);
				shape[i].readInput();
				break;
			}
			
			
		}
		return shape; //return the array of the shapes
	}
}
