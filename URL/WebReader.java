import java.net.*;
import java.io.*;

public class WebReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/connecting.html");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    } 
}