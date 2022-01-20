import java.net.*;

public class JavaInternetAddressByIp {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("31.13.79.35");
            System.out.println(address.getCanonicalHostName());
        }
        catch(UnknownHostException ex) {
            System.out.println(ex);
        }
    }
}