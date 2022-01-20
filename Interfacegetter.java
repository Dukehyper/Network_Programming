import java.net.*;
import java.util.*;

public class Interfacegetter {
    public static void main(String[] args) {
        try {
            NetworkInterface eth0 = NetworkInterface.getByName("eth0");
            Enumeration addresses = eth0.getInetAddresses();
            while (addresses.hasMoreElements()) {
                System.out.println(addresses.nextElement());
            }
        } catch (SocketException ex) {
            System.out.println("Could not list sockets.");
        }

    }

}
