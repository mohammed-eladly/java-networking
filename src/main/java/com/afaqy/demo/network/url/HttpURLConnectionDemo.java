package com.afaqy.demo.network.url;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {

    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "https://www.youm7.com/Section/%D8%A3%D8%AE%D8%A8%D8%A7%D8%B1-%D8%B9%D8%A7%D8%AC%D9%84%D8%A9/65/1");

            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

            for(int i = 1; i <= 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
            huc.disconnect();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}    
