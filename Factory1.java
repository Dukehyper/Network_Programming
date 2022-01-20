
import java.net.*;

public class Factory1 {
    public static void main(String[] args) {
        try {
            NetworkInterface ni = NetworkInterface.getByName("wlan5");
            if (ni == null) {
                System.out.println("No such interface:  eth0");
            } else {
                System.out.println(ni);
            }
        } catch (SocketException ex) {
            System.out.println("Could not list sockets.");
        }
    }
}
