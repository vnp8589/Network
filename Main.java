import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Arrays;
class Main{
  public static void main(String args[])throws UnknownHostException{
    try{

    InetAddress ia = InetAddress.getLocalHost();//.getByName("www.adit.ac.in");
    System.out.println(ia);

    System.out.println(ia.getHostName());

    System.out.println(ia.getHostAddress());

    System.out.println(ia.hashCode());

    System.out.println(ia.isReachable(1));

    System.out.println(ia.getByName("www.facebook.com"));

    byte b[] = new byte[]{(byte)31,(byte)13,(byte)79,(byte)35};
    System.out.println(ia.getByAddress(b));

    byte[] ipAddr = new byte[] { 127, 0, 0, 1 };
    InetAddress addr = InetAddress.getByAddress(ipAddr);
    System.out.println(Arrays.toString(addr.getAddress()));


    InetAddress[] address = InetAddress.getAllByName("java.sun.com");
    for(int i=0; i<address.length; i++){
      System.out.println(address[i]);
    }

    System.out.println(ia.getLoopbackAddress());

    System.out.println(ia.getCanonicalHostName());

    System.out.println(ia.isAnyLocalAddress());

    System.out.println(ia.isLinkLocalAddress());

  }
  catch(UnknownHostException e){
      e.printStackTrace();
    }
  catch(IOException e){
      e.printStackTrace();
    }
  }
}
