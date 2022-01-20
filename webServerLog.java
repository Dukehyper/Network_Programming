import java.io.*;
import java.net.*;

public class webServerLog {

  public static void main(String[] args) {
    try (FileInputStream fin =  new FileInputStream("weblogger.txt");
      Reader in = new InputStreamReader(fin);
      BufferedReader bin = new BufferedReader(in);) {

      for (String entry = bin.readLine(); entry != null; entry = bin.readLine()) 
        {
        // separate out the IP address
        int index = entry.indexOf(' ');
        System.out.println(index);
        String ip = entry.substring(0, index);
        System.out.println(ip);
        String theRest = entry.substring(index);
        System.out.println(theRest);

        // Ask DNS for the hostname and print it out
        try {
          InetAddress address = InetAddress.getByName(ip);
          System.out.println(address.getHostName() + theRest);
        } catch (UnknownHostException ex) {
          System.out.println(ex);
          System.err.println(entry);
        }
      }
    } catch (IOException ex) {
      System.out.println("Exception: " + ex);
    }
  }
}