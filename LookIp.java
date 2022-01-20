import java.net.*;

public class LookIp {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
        byte[] addressVersion = address.getAddress();
        if(addressVersion.length == 4) {
            System.out.println(address.getHostAddress());
            System.out.println("This is version 4");
        } else {
            System.out.println(address.getHostAddress());
            System.out.println("This is version 6");
        }
        } 
        catch (UnknownHostException ex){
            System.out.println(ex);
        }
        
    }
}
