import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Arrays;
class Main{
  public static void main(String args[])throws UnknownHostException{
    try{

    InetAddress ia = InetAddress.getLocalHost();//.getByName("www.adit.ac.in");
    System.out.println("\nLocalHost Info : "+ia);

    System.out.println("\nHost Name : "+ia.getHostName());

    System.out.println("\nIP Address : "+ia.getHostAddress());

    System.out.println("\nHashCode : "+ia.hashCode());

    System.out.println("\nAddress Reachable : "+ia.isReachable(1));

    System.out.println("\nIP Address for given URL is : "+ia.getByName("www.facebook.com"));

    byte b[] = new byte[]{(byte)31,(byte)13,(byte)79,(byte)35};
    System.out.println("\nEntered IP Address : "+ia.getByAddress(b));

    byte[] ipAddr = new byte[] { 127, 0, 0, 1 };
    InetAddress addr = InetAddress.getByAddress(ipAddr);
    System.out.println("\nEntered IP Address : "+Arrays.toString(addr.getAddress()));


    InetAddress[] address = InetAddress.getAllByName("java.sun.com");
    System.out.println("\nAll IP Address for given host : ");
    for(int i=0; i<address.length; i++){
      System.out.println(address[i]);
    }

    System.out.println("\nLoop Back Address : "+ia.getLoopbackAddress());

    System.out.println("\nCanonical Host Name : "+ia.getCanonicalHostName());

    System.out.println("\nIs InetAddress in Wildcard Address : "+ia.isAnyLocalAddress());

    System.out.println("\nIs InetAddress is Link Local Address : "+ia.isLinkLocalAddress());

  }
  catch(UnknownHostException e){
      e.printStackTrace();
    }
  catch(IOException e){
      e.printStackTrace();
    }
  }
}
