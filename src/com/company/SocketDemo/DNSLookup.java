package com.company.SocketDemo;
import java.net.*;
/**
 * Created by blin on 2015/1/9.
 */
public class DNSLookup {
    private static void usage()


    {
        System.out.println("usage: java DnsLookup <ip>");
        System.out.println("or:java DnsLookup <hostname>");
        System.exit(0);
    }
    public static void main(String[] args)


    {
        if(args.length!=1)
            usage();
        String host=args[0];


        try {
            InetAddress addr = InetAddress.getByName(host);
            String ip = addr.getHostAddress();
            String hostname = addr.getHostName();
            System.out.println("ip:" +ip +"\nhost: " +hostname);
        } catch(UnknownHostException e)


        {System.out.println(host +" unknown...");}
    }

}
