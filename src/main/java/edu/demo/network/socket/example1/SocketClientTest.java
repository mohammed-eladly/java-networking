package edu.demo.network.socket.example1;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Name : SocketClientTest
 * <p>
 * Description :
 * <p>
 * Date : 30/05/2021
 * <p>
 * Create by : Mohammed ElAdly
 * <p>
 * Mail : mohammed.eladly@afaqy.com
 */
public class SocketClientTest {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("Hello Server!");
            dataOutputStream.flush();
            dataOutputStream.close();

            socket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}