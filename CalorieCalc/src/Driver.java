//Nyree Larkins

//COP2552.001

import javax.swing.JOptionPane;

public class Driver {
	
	Bicycle biking = new Bicycle();
	Run run = new Run();
	Swim swim = new Swim();
	Walk walk = new Walk();
	Weights weights = new Weights();
	ExitProgram exit = new ExitProgram();
	
	public void inputExerciseType() {
		
		String inputType = JOptionPane.showInputDialog("Activity Monitor\n\n"
				+ "Press 1 for Bicycle\n"
				+ "Press 2 for Running/Jogging\n"
				+ "Press 3 for Swimming\n"
				+ "Press 4 for Walking\n"
				+ "Press 5 for Weight Training\n"
				+ "Press 6 for Exit");
	
		int inputTypeParsed = Integer.parseInt(inputType);
	
		if (inputTypeParsed == 1) {
			biking.promptIntensity();
			inputExerciseType();

		}
		else if (inputTypeParsed == 2) {
			run.promptIntensity();
			inputExerciseType();
		}
	
		else if (inputTypeParsed == 3) {
			swim.promptIntensity();
			inputExerciseType();
		}
	
		else if (inputTypeParsed == 4) {
			walk.promptIntensity();
			inputExerciseType();
		}
	
		else if (inputTypeParsed == 5) {
			weights.promptIntensity();
			inputExerciseType();
		}

		else if (inputTypeParsed == 6) {
			exit.displayTotal();
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Please enter a number that's 1 through 6");
			inputExerciseType();
		}
		

	}
	

}
