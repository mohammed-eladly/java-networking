package com.afaqy.demo.network.url;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Name : URLTest
 * <p>
 * Description :
 * <p>
 * Date : 30/05/2021
 * <p>
 * Create by : Mohammed ElAdly
 * <p>
 * Mail : mohammed.eladly@afaqy.com
 */
public class URLTest {

    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "https://www.youm7.com/Section/%D8%A3%D8%AE%D8%A8%D8%A7%D8%B1-%D8%B9%D8%A7%D8%AC%D9%84%D8%A9/65/1");

            System.out.println("Url:" + url);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());

            System.out.println("====================================\n");

            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}