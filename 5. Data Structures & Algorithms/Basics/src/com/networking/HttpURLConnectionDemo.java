package com.networking;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Map;

public class HttpURLConnectionDemo {
    HttpURLConnectionDemo() throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("10.177.38.133",80);
        Proxy proxyAddress = new Proxy(Proxy.Type.HTTP,inetSocketAddress);
        URL url = new URL("https://www.google.com");
        HttpURLConnection urlc = (HttpURLConnection) url.openConnection(proxyAddress);
        System.out.println(urlc.getRequestMethod());
        System.out.println(urlc.getResponseCode());
        System.out.println(urlc.getResponseMessage());
        Map<String, List<String>> headerFields =  urlc.getHeaderFields();
        for(Map.Entry val :headerFields.entrySet()){
            System.out.println(val.getKey()+" : "+val.getValue());
        }
    }
}
