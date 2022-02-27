import javax.swing.JOptionPane;

public class ExitProgram {
	 Bicycle bike = new Bicycle();
	 Run run = new Run();
	 Swim swim = new Swim();
	 Walk walk = new Walk();
	 Weights weights = new Weights();
	

	public void displayTotal() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Total amount of time spent on the bicycle: " + bike.getTimeInMin() +
				 "\nTotal calories consumed while on the bicycle: " + bike.getBikeTotalCal() +
				 
				 "\n\nTotal amount of time spent running: " + run.getTimeInMin() +
				 "\nTotal calories consumed while running: " + run.getRunTotalCal() +
				 
				 "\n\nTotal amount of time spent swimming: " + swim.getTimeInMin() +
				 "\nTotal calories consumed while swimming: " + swim.getSwimTotalCal() +
				 
				 "\n\nTotal amount of time spent walking: " + walk.getTimeInMin() +
				 "\nTotal calories consumed while walking: " + walk.getWalkTotalCal() +
				 
				 "\n\nTotal amount of time spent lifting weights: " + weights.getTimeInMin() +
				 "\nTotal calories consumed while lifting weights: " + weights.getWeightsTotalCal());
		
	}
}