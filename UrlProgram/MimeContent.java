package UrlProgram;
import java.net.URL;  
import java.net.URLConnection;  
  
public class MimeContent {  
  
    public static void main(String args[]) throws Exception {  
        URL url = new URL("http://www.kalovatvatey.com");  
        URLConnection connection = url.openConnection( );   
        String mimeType = connection.getContentType( );   
        Object contents = url.getContent();  
        System.out.println( contents.getClass().getName());  
        System.out.println(" The mime type is : "+mimeType);  
          
      }  
}  