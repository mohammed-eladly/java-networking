package edu.demo.network.socket.example2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
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

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str = "", str2 = "";

            while(!str.equals("stop")) {

                str = dataInputStream.readUTF();

                System.out.println("client says: " + str);

                str2 = bufferedReader.readLine();

                dataOutputStream.writeUTF(str2);
                dataOutputStream.flush();
            }
            dataInputStream.close();
            dataOutputStream.close();

            socket.close();
            serverSocket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}