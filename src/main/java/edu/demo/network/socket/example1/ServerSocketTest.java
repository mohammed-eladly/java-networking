package edu.demo.network.socket.example1;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Name : ServerSocketTest
 * <p>
 * Description :
 * <p>
 * Date : 30/05/2021
 * <p>
 * Create by : Mohammed ElAdly
 * <p>
 * Mail : mohammed.eladly@afaqy.com
 */
public class ServerSocketTest {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            Socket socket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            System.out.println("Received Message: " + dataInputStream.readUTF());

            socket.close();
            serverSocket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}