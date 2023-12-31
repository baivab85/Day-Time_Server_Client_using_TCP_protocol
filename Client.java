import java.io.*;
import java.net.*;

publicclassClientDT
{
	publicstaticvoid main(String args[]) throwsIOException
	{
		Socket objclient = new Socket("localhost",9005);
		
		DataOutputStreamdout=newDataOutputStream(objclient.getOutputStream());
		dout.writeUTF("\nHi Server...Today's date ??" + "\n");
		
		
		DataInputStreamdin=newDataInputStream(objclient.getInputStream());
		String msg2=din.readUTF();
		System.out.println("CLient Received  message From Server.." + msg2.toUpperCase());
	}
}

