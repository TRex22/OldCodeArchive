package myNetworkLocalClasses;

import java.io.*;
import java.net.*;
import java.util.*;

public class TimeServer {

	/**
	 * @param args
	 */
	//fields
	private static final int PORT = 13;
	
	TimeServer () throws IOException
	{
		ServerSocket servSock = new ServerSocket (PORT);
		System.out.println ("Waiting for a connection...");
		
		Socket sock = servSock.accept();
		
		System.out.println("Connection established with client "+sock.getInetAddress().getHostName());
		String date = ""+new Date();
		
		
	}
	
	public static void main(String[] args) {
		

	}

}
