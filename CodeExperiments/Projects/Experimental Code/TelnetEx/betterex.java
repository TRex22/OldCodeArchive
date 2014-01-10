package TelnetEx;

//Telnet Client
//this code connects to the telnet server and receives data whenever command "1" is entered
import java.net.*;
import java.io.*;

class TelnetClient
{
    @SuppressWarnings("deprecation")
	public static void main(String args[]) throws Exception
    {
        //Create object of Socket
        Socket soc=new Socket("localhost",8088);
        String Command;
        //Create object of Input Stream to read from socket
        DataInputStream din=new DataInputStream(soc.getInputStream());   
        //Create object of Output Stream  to write on socket
        DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
        // Object of Buffered Reader to read command from terminal
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Telnet Client");
        System.out.println("< Telnet Prompt >");
        Command=br.readLine();//reads the command
        dout.writeUTF(Command);//sends command to server
        System.out.println(din.readLine()); //gets the response of server       
        soc.close();  //close port 
        din.close();  //close input stream      
        dout.close(); //close output stream     
        br.close();  //close buffered Reader   
    }
}
