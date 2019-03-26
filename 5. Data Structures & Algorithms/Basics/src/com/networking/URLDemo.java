package com.networking;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLDemo {
    URLDemo() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https","www.oracle.com","index.html");
        System.out.println(url.getProtocol());
        System.out.println(url.toURI());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getPort());
        System.out.println(url.getHost());
        System.out.println(url.toExternalForm());
        System.out.println(url.getFile());
    }
}
