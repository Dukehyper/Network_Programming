// package network programming;
import java.net.*;

public class Day1Khai {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("172.217.27.164");
            System.out.println(address.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
