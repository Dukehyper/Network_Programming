package URLconnection;

import java.io.*;    
import java.net.*;    
public class Sample{    
public static void main(String[] args){    
try{    
URL url=new URL("https://www.facebook.com/");     
HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
for(int i=1;i<=10;i++){  
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
huc.disconnect();   
}catch(Exception e){System.out.println(e);}    
}    
}