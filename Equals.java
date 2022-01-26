import java.net.InetAddress;  
public class Equals{  
    public static void main(String[] args){  
        try{  
            InetAddress ip=InetAddress.getByName("www.facebook.com");  
            InetAddress ip1=InetAddress.getByName("m.facebook.com");  
            System.out.println("Host Name 1: "+ip.getHostName());  
            System.out.println("Host Name 2: "+ip1.getHostName());  
            if(ip.equals(ip1)){  
                System.out.println("Both are equals");  
            }  
            else{  
                System.out.println("Both the Inet Address are unequal");  
            }  
        }catch(Exception e){System.out.println(e);}  
    }  
}  