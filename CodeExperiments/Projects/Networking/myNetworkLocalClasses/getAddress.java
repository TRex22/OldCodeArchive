package myNetworkLocalClasses;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class getAddress {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */


	private static UnknownHostException error;
	private static String errReturn;
	public getAddress()
	{
	//	setError("No Errors Detected");
		errReturn = null;
	}
	public static void main(String[] args){//throws UnknownHostException {
		//System.out.println(InetAddress.getLocalHost());
		
		getIPAddr();
		if (error == null)
		{
			errReturn = "No Errors Detected";
		}
		else
		{
			errReturn = ""+error;
		}
		JOptionPane.showMessageDialog(null, "Ip Address: "+getIPAddr()+"\nErrors: "+errReturn);

	}
	public static InetAddress getIPAddr()
	{
		InetAddress ipAddress = null;
		try {
			ipAddress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error = e;
		}


		return ipAddress;

	}
	//public String getError() {
	//	return error;
	//}
	//public void setError(String error) {
	//	this.error = error;
	//}
	public static String geterrReturn()
	{
		return errReturn;
	}
	//public static void seterrReturn(String err)
	//{
	//	errReturn = err;
	//}
	
}
