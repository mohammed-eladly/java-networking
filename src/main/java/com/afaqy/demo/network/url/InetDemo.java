package com.afaqy.demo.network.url;

import java.net.InetAddress;

public class InetDemo {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.youm7.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}  