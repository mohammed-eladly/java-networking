package com.afaqy.demo.network.datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Name : DatagramReceiver
 * <p>
 * Description :
 * <p>
 * Date : 30/05/2021
 * <p>
 * Create by : Mohammed ElAdly
 * <p>
 * Mail : mohammed.eladly@afaqy.com
 */
public class DatagramReceiver {

    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);

            byte[] buf = new byte[1024];

            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);

            String str = new String(dp.getData(), 0, dp.getLength());

            System.out.println("Received Message:");
            System.out.println(str);

            ds.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}