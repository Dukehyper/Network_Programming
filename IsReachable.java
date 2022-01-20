 import java.io.IOException;
import java.net.InetAddress;

public class IsReachable
{
  public static void main(final String[] args) throws IOException
  {
    final InetAddress host = InetAddress.getByName("127.0.0.1");
    System.out.println("host.isReachable(1000) = " + host.isReachable(1000));
  }
}