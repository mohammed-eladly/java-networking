package com.afaqy.demo.network.socket.example2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
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

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str = "", str2 = "";
            while(!str.equals("stop")) {
                str = bufferedReader.readLine();

                dataOutputStream.writeUTF(str);

                dataOutputStream.flush();
                str2 = dataInputStream.readUTF();

                System.out.println("Server says: " + str2);
            }
            dataInputStream.close();
            dataOutputStream.flush();
            dataOutputStream.close();

            socket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}