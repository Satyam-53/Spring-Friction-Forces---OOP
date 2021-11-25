package packageMain;
import java.io.*;
import packageShape.*;
import packageSimulateShapes.*;
import packageCheckException.*;

public class WriteToCSV {
	public static File csvFile = null;
	public static PrintWriter out = null;
	
	public static void makeFile() throws FileNotFoundException { //Method to create a new CSV file
		csvFile = new File("output.csv");
		out = new PrintWriter(csvFile);
		out.printf("Time (Seconds), X coordinate, Y coordinate, Velocity (Metre/Second), Orientation(Radians)\n");
	}
	
	//Method to update the CSV file
	public static void writeToCSV(String shapeName) { 
		out.printf("%s\n", shapeName);
	}
	
	public static void writeToCSV(double timeslice, double l_x, double l_y, double v, double theta) { 
		out.printf("%f, %f, %f, %f, %f\n", timeslice, l_x, l_y, v, theta);
	}
	
	//Method to close the file
	public static void closeFile() {
		System.out.println("Check the CSV file for simulation results");
		if(out!= null) {
			out.close();
		}
	}
}