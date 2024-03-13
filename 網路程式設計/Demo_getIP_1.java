package demo_1130306_getIP;

import java.net.*;

public class Demo_1130306_getIP_1{
    public static void main(String[] args){
        try{
            InetAddress client = InetAddress.getLocalHost();
            System.out.println(client);
            InetAddress server = InetAddress.getByName("tw.yahoo.com");
            System.out.println(server);
        }catch(UnknownHostException e){
            System.err.println("Error");
        }
    }
}