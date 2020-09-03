import javax.swing.JOptionPane;

public class SystemTestY3871807 {
	
	// Main method
	public static void main(String[] args) 
	{
		// Declare string variables as GUI returns strings only
	    String make;
		String model;
		String speedString;
		String memorySizeString;
		String hardDiskSizeString;
		String purchaseCostString;
		String answerString;
		int speed;
		int answer;
		
		// GUI input for class constructor
		make = JOptionPane.showInputDialog("What is the system make?");
		model = JOptionPane.showInputDialog("What is the system model?");
		speedString = JOptionPane.showInputDialog("What is the system speed?");
		
		// Use Integer wrapper to parse string to integer
		speed = Integer.parseInt(speedString);
		
		// Create system object using GUI user inputs
		SystemY3871807 sys=new SystemY3871807(make, model, speed);
		
		// Main GUI menu logic - switch statement based on GUI user input value (1-4)
		do
		{
			// User decides what option to select (1-4)
			answerString = JOptionPane.showInputDialog("Please select one of the following options:\n"
					+ "1 - Print system details\n"
					+ "2 - Diagnose system\n"
					+ "3 - Set details\n"
					+ "4 - Quit program\n");
			
			// Parse input value to integer
			answer = Integer.parseInt(answerString);
			// Switch statement to display correct option
			switch(answer)
			{
			case 1:
				sys.displayDetails();
				sys.displaySystemProperties();
				break;
				
			case 2:
				sys.diagnoseSystem();
			    break;
			    
			case 3:
				memorySizeString = JOptionPane.showInputDialog("What is the system memory size (MB)?");
				hardDiskSizeString = JOptionPane.showInputDialog("What is the hard disk size (GB)?");
				purchaseCostString = JOptionPane.showInputDialog("What is the system purchase cost?");
				// Parameters for set methods are parsed first
				sys.setMemory(Integer.parseInt(memorySizeString));
				sys.setHardDisk(Double.parseDouble(hardDiskSizeString));
				sys.setPurchaseCost(Double.parseDouble(purchaseCostString));
				break;
				
			case 4:
				answer = 4;
				break;
			}	
		}
		// Keeps looping until quit/case 4 is selected (answer = 4)
		while (answer != 4);
	}
}

/*
// Part a - terminal testing
System.out.println(sys.getMake());
System.out.println(sys.getModel());
System.out.println(sys.getProcessorSpeed());
sys.displayDetails();
sys.checkHDStatus();
sys.goodMemorySize();
sys.diagnoseSystem();
// Check diagnose system method with bad system specifications
sys.setHardDisk(1.5);
sys.setMemory(100);
sys.diagnoseSystem();
sys.displaySystemProperties();
*/