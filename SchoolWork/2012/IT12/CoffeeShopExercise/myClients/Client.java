package myClients;

public class Client {
	private int clientID;
	private String name;
	private double hoursUsed;
	
	public Client ()
	{
		setClientID(0);
		setName("");
		setHoursUsed(0.00);
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHoursUsed() {
		return hoursUsed;
	}

	public void setHoursUsed(double hoursUsed) {
		this.hoursUsed = hoursUsed;
	}
	
	public int getHours()
	{
		return (int)hoursUsed;
	}
	
	public int getMinutes()
	{
		double temp = hoursUsed-getHours();
		temp = temp*100;
		return (int)temp;
	}
	
	public double calcCost()
	{
		double temp = 0.00;
		temp = getHours()*30;
		if (getMinutes()>0)
		{
			temp += 30.00;
		}
		
		return temp;
	}
	
	public String toString()
	{
		return ""+name+" spend "+getHours()+" hours and "+getMinutes()+" minutes on the internet and paid R"+calcCost()+"\n";
	}
	
}
