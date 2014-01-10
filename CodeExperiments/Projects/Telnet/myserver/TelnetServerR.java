package myserver;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TelnetServerR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data = "Hello Client!! ";
	      try {
	          // Create object of Server Socket
	         ServerSocket srvr = new ServerSocket(8088);
	          // Socket object that listens the port (8088) and accepts the incoming connection
	          //requests
	         Socket skt = srvr.accept();
	         System.out.println("Client Connected!");
	         // gets output stream object 
	         PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
	         //gets input stream object   
	         DataInputStream din=new DataInputStream(skt.getInputStream());       
	         if(din.readUTF().equals("1")){ 
	         // sends response to incoming request if command is '1'   

	         System.out.println("String: '" + data);
	         out.print(data);
	         }
	         out.close();// clos out
	         skt.close();// close skt
	         srvr.close();// close srvr
	         din.close(); // close din
	      }
	      catch(Exception e) {
	         System.out.print(e);
	      }
	}

}
