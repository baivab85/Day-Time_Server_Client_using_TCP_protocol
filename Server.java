import java.io.*;
import java.net.*;
importjava.util.*;


public class ServerDT {
	public static void main(String a[]) throws IOException
	{
	System.out.println("\n Welcome");
	ServerSocketss=new ServerSocket(9005); 
	System.out.println("\n Server Running......");
	
	    Socket serobj=ss.accept(); //binding
	
	
	
	DataInputStream din=new DataInputStream(serobj.getInputStream());
		String msg=din.readUTF();
	System.out.println("Message Received from CLIENT: " + msg);
	
	DataOutputStreamdout=new DataOutputStream(serobj.getOutputStream());
		dout.writeUTF("\nMessage From Server...." + "Today's Date is = " +(new Date()).toString()+ "\n");
		
	
	}

}
