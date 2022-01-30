package Proxy;
// Java Program to illustrate ProxySelector Class
// of java.net package
// only creating methods here
  
// Importing standard input output classes
import java.io.IOException;
// Importing classes from java.net package
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
// Importing List and ArrayList as utility classes from
// java.util package
import java.util.ArrayList;
import java.util.List;
  
// Class 1
// Helper class extending ProxySelector class
public class PrivateDataProxy extends ProxySelector {
  
    // According to API we need to return List<Proxy>
    // even if we return only one element, so
  
    // Creating List class object of Proxy type
    private final List<Proxy> noProxy = new ArrayList<>();
    private final List<Proxy> proxies = new ArrayList<>();
  
    // Constructor of this class
    public PrivateDataProxy()
    {
  
        // If no proxy required to access resource
        // use Proxy.NO_PROXY
        noProxy.add(Proxy.NO_PROXY);
  
        // Creating  InetSocketAddress, and
        // secure.connection.com doesn't exist 443 is an
        // https port
        InetSocketAddress inetSocketAddress
            = new InetSocketAddress("secure.connection.com",
                                    443);
  
        // Now creating http proxy
        Proxy proxy
            = new Proxy(Proxy.Type.HTTP, inetSocketAddress);
  
        // Finally adding proxy into proxy list
        proxies.add(proxy);
    }
  
    // Method 1 of this class
    //@Override
    public List<Proxy> select(URI uri)
    {
        if (uri.getPath().startsWith("/confidential")) {
            // If URI path starts with '/confidential' then
            // use proxy server
            return proxies;
        }
  
        // If url don't start with '/confidential' then
        //  no need in proxy
        return noProxy;
    }
  
    // Method 2 of this class
    // @Override
    public void connectFailed(URI arg0, SocketAddress arg1,
                              IOException arg2)
    {
        // Properly handle connection failing
    }
}
