import javax.swing.JOptionPane;

public class SystemY3871807 {
	
	// Declare variables
	String make;
	String model;
	int speed;
	int memorySize; //MB
	double hardDiskSize; //GB
	double purchaseCost;
	
	// Class constructor
	public SystemY3871807(String make, String model, int speed)
	{
		this.make = make;
		this.model = model;
		this.speed = speed;	
	}
	
	// Get & set methods
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getProcessorSpeed()
	{
		return speed;
	}
	
	public void setMemory(int memorySize)
	{
		this.memorySize = memorySize;
	}
	
	public void setHardDisk(double hardDiskSize)
	{
		this.hardDiskSize = hardDiskSize;
	}

	public void setPurchaseCost(double PurchaseCost)
	{
		this.purchaseCost = PurchaseCost;
	}
	
	// Check HDD status method
	public String checkHDStatus()
	{
		if (hardDiskSize < 2)
		{
			return "Low";
		}
		else
		{
			return "Ok";
		}
	}
	
	// Check memory size is good method
	public boolean goodMemorySize()
	{
		if (memorySize < 128)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	// GUI displays system details method 
	public void displayDetails()
	{
		JOptionPane.showMessageDialog(null, 
				"Make: " + make + "\n" +
				"Model: " + model + "\n" +
				"Speed: " + speed + "\n" +
				"Hard disk size: " + hardDiskSize + "\n" +
				"Memory size: " + memorySize + "\n" +
				"Purchase cost: " + purchaseCost, 
				"System Details", JOptionPane.INFORMATION_MESSAGE);
	}
	
	// Diagnose system output in terminal - not GUI 
	public void diagnoseSystem()
	{
		System.out.println("Hard disk status: " + checkHDStatus());
		System.out.println("Good memory size: " + goodMemorySize());
	}
	
	// GUI displays system properties method
	public void displaySystemProperties() 
	{
		JOptionPane.showMessageDialog(null, 
				"OS Architecture: " + System.getProperty("os.arch") + "\n" +
			    "OS Name: " + System.getProperty("os.name") + "\n" +
			    "OS Version: " + System.getProperty("os.version") + "\n" +
				"Username: " + System.getProperty("user.name") + "\n" +
				"Java Version: " + System.getProperty("java.version") + "\n",
				"System Properties", JOptionPane.INFORMATION_MESSAGE);
		
		if (System.getProperty("os.name") == "Windows XP")
		{
			JOptionPane.showMessageDialog(null, 
				    "Congratulations you are using Windows XP!");
		}
		else if (System.getProperty("os.name") == "Linux")
		{
			JOptionPane.showMessageDialog(null, 
				    "Unfortunately, you are using Linux...");
		}
	}
}

