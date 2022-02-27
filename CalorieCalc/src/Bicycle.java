//Nyree Larkins

//COP2552.001

import javax.swing.JOptionPane;

public class Bicycle {
	private static int timeInMin;
	private static int intensity;
	private static double bikeTotalCal;
	
	////////////////////////////////constructor
	Bicycle (){
		timeInMin = 0;
		intensity = 0;
		bikeTotalCal = 0.0;
	}
	
	///////////////////////////////get methods
	public int getTimeInMin() {
		return timeInMin;
	}
	
	public int getIntensity() {
		return intensity;
	}
	
	public double getBikeTotalCal() {
		return bikeTotalCal;
	}
	
	///////////////////////////////set methods
	public void setTimeInMin(int timeInMin) {
		this.timeInMin = timeInMin;
	}
	
	public void setIntensity(int intensity) {
		this.intensity  = intensity;
	}
	
	public void setBikeTotalCal(double bikeTotalCal) {
		this.bikeTotalCal = bikeTotalCal;
	}
	
	///////////////////////////////Methods
	
	//Prompts user for input - intensity
	public void promptIntensity() {
				
			String holdIntensity = JOptionPane.showInputDialog("Your Workout Intensity\n\n"
					+ "Press 1 for Moderate\n"
					+ "Press 2 for Vigorous");
		
			intensity = Integer.parseInt(holdIntensity);
			
			//calls promptTime method if input is valid
			//Reprompts for intensity if input is invalid
			if (intensity == 1 || intensity == 2) {
				promptTime(); 
				}
			
			else {
				JOptionPane.showMessageDialog(null, "Please enter 1 or 2");
				promptIntensity();
			}
	}
	
	//Prompts user for input - time
	public void promptTime() {
		String holdTime = JOptionPane.showInputDialog("Time Spent on the Bicycle: \n");
		timeInMin = Integer.parseInt(holdTime);
		calculateCal();
	}
	
	//Calculates the calories consumed given intensity and duration of exercise
	public void calculateCal() {
		if (intensity == 1) {
			bikeTotalCal = (10 * timeInMin);
		}
		
		else if (intensity == 2) {
			bikeTotalCal = (14.3 * timeInMin);
		}
				
	}

}
