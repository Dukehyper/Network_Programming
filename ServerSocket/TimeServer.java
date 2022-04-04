package ServerSocket;

import java.net.*;
import java.io.*;
import java.util.Date;
public class TimeServer {
 public final static int DEFAULT_PORT = 37;
 public static void main(String[] args) {
 int port = DEFAULT_PORT;
 long differenceBetweenEpochs = 2208988800L;
 try {
 ServerSocket server = new ServerSocket(port);
 while (true) {
 Socket connection = null;
 try {
 connection = server.accept( );
 OutputStream out = connection.getOutputStream( );
 Date now = new Date( );
 long msSince1970 = now.getTime( );
 long secondsSince1970 = msSince1970/1000;
 long secondsSince1900 = secondsSince1970 + differenceBetweenEpochs;
 byte[] time = new byte[4];
 time[0] = (byte) ((secondsSince1900 & 0x00000000FF000000L) >> 24);
 time[1] = (byte) ((secondsSince1900 & 0x0000000000FF0000L) >> 16);
 time[2] = (byte) ((secondsSince1900 & 0x000000000000FF00L) >> 8);
 time[3] = (byte) (secondsSince1900 & 0x00000000000000FFL);
 out.write(time);

 DataOutputStream dout=new DataOutputStream(connection.getOutputStream());  
dout.write(time); 

 DataInputStream dis=new DataInputStream(connection.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println(str);

 out.flush( ); } // end try
 catch (IOException ex) {
 } // end catch
 finally {
 if (connection != null) connection.close( ); }
 } // end while
 } // end try
 catch (IOException ex) {
 System.err.println(ex);
 } // end catch
 } // end main
} // end TimeServer