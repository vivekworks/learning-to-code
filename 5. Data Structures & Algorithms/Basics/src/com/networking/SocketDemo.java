package com.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo {
    SocketDemo() throws IOException {
        try (Socket whoisSocket = new Socket("www.internic.net", 80)) {
            System.out.print("Gets socket...");
            InputStream in = whoisSocket.getInputStream();
            OutputStream out = whoisSocket.getOutputStream();
            System.out.print("Gets streams...");
            byte[] site = "OraclePressBooks.com".getBytes();
            out.write(site);
            int a;
            while ((a = in.read()) != -1) {
                System.out.print(a);
            }
        }
    }
}