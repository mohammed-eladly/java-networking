package edu.demo.network.datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * Name : DatagramSender
 * <p>
 * Description :
 * <p>
 * Date : 30/05/2021
 * <p>
 * Create by : Mohammed ElAdly
 * <p>
 * Mail : mohammed.eladly@afaqy.com
 */
public class DatagramSender {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();

            InetAddress ip = InetAddress.getByName("127.0.0.1");

            String message = "Hello World";

            DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(StandardCharsets.UTF_8),
                    message.length(), ip, 3000);

            datagramSocket.send(datagramPacket);
            datagramSocket.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}