//Nyree Larkins

//COP2552.001

import javax.swing.JOptionPane;

public class Swim {
	private static int timeInMin;
	private static int intensity;
	private static double swimTotalCal;
	
	////////////////////////////////constructor
	Swim (){
		timeInMin = 0;
		intensity = 0;
		swimTotalCal = 0.0;
	}
	
	///////////////////////////////get methods
	public int getTimeInMin() {
		return timeInMin;
	}
	
	public int getIntensity() {
		return intensity;
	}
	
	public double getSwimTotalCal() {
		return swimTotalCal;
	}
	
	///////////////////////////////set methods
	public void setTimeInMin(int timeInMin) {
		this.timeInMin = timeInMin;
	}
	
	public void setIntensity(int intensity) {
		this.intensity  = intensity;
	}
	
	public void setSwimTotalCal(double swimTotalCal) {
		this.swimTotalCal = swimTotalCal;
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
		String holdTime = JOptionPane.showInputDialog("Time Spent Swimming: \n");
		timeInMin = Integer.parseInt(holdTime);
		calculateCal();
	}
	
	//Calculates the calories consumed given intensity and duration of exercise
	public void calculateCal() {
		if (intensity == 1) {
			swimTotalCal = (6.8 * timeInMin);
		}
		
		else if (intensity == 2) {
			swimTotalCal = (14.8 * timeInMin);
		}
				
	}

}
