package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramDemo {
    static int serverPort = 9999;
    static int clientPort = 9998;
    static int bufferSize = 1024;
    static DatagramSocket ds;
    static byte[] buffer = new byte[bufferSize];

    DatagramDemo(int option) throws IOException {
        if (option == 1) {
            ds = new DatagramSocket(serverPort);
            TheServer();
        }
        else {
            ds = new DatagramSocket(clientPort);
            TheClient();
        }
    }

    static void TheServer() throws IOException {
        int pos=0;
        while(true){
            int c = System.in.read();
            switch (c){
                case -1:
                    System.out.println("Server quits");
                    ds.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    ds.send(new DatagramPacket(buffer,pos, InetAddress.getLocalHost(),clientPort));
                    pos=0;
                    break;
                    default:buffer[pos++]=(byte)c;
            }
        }
    }

    static void TheClient() throws IOException{
        while(true){
            DatagramPacket p = new DatagramPacket(buffer,buffer.length);
            ds.receive(p);
            System.out.println(new String(p.getData(),0,p.getLength()));
        }
    }
}
