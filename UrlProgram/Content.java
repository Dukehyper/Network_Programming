package UrlProgram;
import java.net.URL;  
import java.util.Scanner;  
  
public class Content{  
public static void main(String args[])throws Exception  
{  
    //Creating url object  
    URL url1=new URL("https://www.kalovatvatey.com/");  
    System.out.println(" Given Url is : "+url1);  
    System.out.println(" The content of given url is: "+url1.getContent());  
 }  
}  