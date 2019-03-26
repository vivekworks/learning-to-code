package com.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    InetAddressDemo() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        /*InetAddress address1 = InetAddress.getByName("JARUNACH-IN");
        System.out.println(address1);
        InetAddress address2 = InetAddress.getByName("SHAA-IN");
        System.out.println(address2);*/
        InetAddress address3 = InetAddress.getByName("ALKALYAN-IN");
        System.out.println(address3);
        InetAddress[] address4 = InetAddress.getAllByName("www.google.com");
        for(InetAddress addr :address4)
            System.out.println(addr);
    }
}
