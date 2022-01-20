import java. io. IOException; 
import java. net. InetAddress; 
 
public class Router { 
 
    public static void scanAddresses(String subnet, int timeOut){ 
        for (int endofAddr=1; endofAddr<255; endofAddr++){ 
            try { 
                String addr = subnet + "." + endofAddr; 
                if (InetAddress.getByName(addr).isReachable(timeOut)) 
                    System.out.println(addr + " found"); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
 
    public static void main(String[] args) { 
        scanAddresses("192.168.0.1", 200); 
    } 
} 