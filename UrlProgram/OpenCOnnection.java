package UrlProgram;
import java.io.*;
import java.net.*;

public class OpenCOnnection {
    public static void main(String[] args) {
        try {
            URL myURL = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/connecting.html");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            System.out.println(myURLConnection);
        } catch (MalformedURLException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
