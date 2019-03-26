package com.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    URLConnectionDemo() throws IOException {
        /**
         * Get the Proxy Details by going through the details from below link which is also added below
         * https://superuser.com/questions/346372/how-do-i-know-what-proxy-server-im-using
         *
         *
         * The auto proxy detection system works by downloading a file called wpad.dat from the host wpad. First confirm
         * this host exists from a command prompt:
         *
         * ping wpad
         *
         * If it doesn't exist, you may have to put the correct DNS suffix. In the same command prompt, type
         *
         * ipconfig /all
         *
         * You should see a Primary DNS Suffix and a DNS Suffix Search List
         *
         * Try appending each of these with a . to wpad:
         *
         * ping wpad.<primary dns suffix>
         *
         * If any of these work, then in your browser enter http://wpad.<suffix>/wpad.dat. This will download the proxy
         * auto configuration file you can open in notepad.exe
         *
         * Toward the bottom of this file, you should see a line saying
         *
         * PROXY <host:port>;
         *
         * It might be repeated if you have multiple proxies available. The host and port are what you need.
         *
         * If this file doesn't exist, then either there is no proxy server, or the proxy server is being provided by dhcp
         * (note that this would only work with IE, so if firefox can surf, this is not the method being used). If you don't
         * have access to the dhcp server to see what it is sending, the easiest way would be to open a site in ie,
         * then go to a command prompt. Type
         *
         * netstat -ban
         *
         * This will provide a list of connections made with the process id of each process. Go to Task Manager, and select
         * View/Select Columns and enable PID (Process Identifier). Look for the PID of iexplore.exe in the list returned by
         * netstat -ban This will reveal the proxy ip and port.
         */
        InetSocketAddress insAddress = new InetSocketAddress("10.177.38.133",80);//Get the proxy server details from above steps ==> www-proxy-idc.in.oracle.com:80 - 10.177.38.133
        Proxy proxy = new Proxy(Proxy.Type.HTTP,insAddress);
        URL url = new URL("http://www.internic.net");
        URLConnection urlc = url.openConnection(proxy);
        System.out.println("Content Length : "+urlc.getContentLength());
        System.out.println("Date : "+urlc.getDate());
        System.out.println("Last Modified Date : "+urlc.getLastModified());
        System.out.println("Expiration : "+urlc.getExpiration());
        System.out.println("Content Length Long : "+urlc.getContentLengthLong());
        InputStream is = urlc.getInputStream();
        int c;
        while((c=is.read()) != -1){
            System.out.print((char)c);
        }
        System.out.println();
    }
}
