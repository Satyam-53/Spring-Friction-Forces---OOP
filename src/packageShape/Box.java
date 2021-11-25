package packageShape;
import packageMain.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public class Box extends Shape{
	 private int height;
	 private int width;

	@Override
	public void readInput()
	{
		super.readInput();
		System.out.println("Enter the box height in cm:");
		height=Driver.in.nextInt();
		System.out.println("Enter the box width in cm:");
		width=Driver.in.nextInt();
	}
	
	//Getter and Setter Functions
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
