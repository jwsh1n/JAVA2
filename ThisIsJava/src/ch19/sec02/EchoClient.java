package ch19.sec02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.20.21.93", 50055);
            System.out.println("클라이언트 연결 성공");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("메시지를 입력하세요 (종료하려면 'q' 입력): ");
                String sendMessage = scanner.nextLine();

                if ("q".equalsIgnoreCase(sendMessage)) {
                    break; // Exit the loop if 'q' is entered
                }

                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeUTF(sendMessage);
                dos.flush();
                System.out.println("클라이언트 데이터 보냄: " + sendMessage);

                DataInputStream dis = new DataInputStream(socket.getInputStream());
                String receiveMessage = dis.readUTF();
                System.out.println("클라이언트 데이터 받음: " + receiveMessage);
            }

            socket.close();
            System.out.println("클라이언트 연결 끊음");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}