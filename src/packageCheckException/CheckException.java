package packageCheckException;
import packageMain.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;
public class CheckException {
	public boolean checkExcpetion(int temp, int i, int N)
	{
		try {
			if(N==2 && i==1)
			{
				if(temp!=1 || temp==0)
					throw new InputOrderException("Simulation case invalid. Run the application again.");
			}
			else if(N==1 && (temp==0 || temp>4))
				throw new InputOrderException("Simulation case invalid. Run the application again.");
		}
			catch(InputOrderException e)
			{
				System.out.println(e.getMessage());
				return true;
			}
		return false;
	}
}
