package ch19.sec02;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Group {

    public static void main(String[] args) { 
        final String SERVER_IP = "172.20.21.93";  
        final int SERVER_PORT = 50059;          

                try { 
                    Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                    
                    System.out.println("서버에 연결되었습니다.");
                    System.out.println("종료 입력시 종료됨~"); 
                    InputStream inputStream = socket.getInputStream();
                    OutputStream outputStream = socket.getOutputStream();
 
                    Scanner scanner = new Scanner(System.in);
 
                    Thread receiveThread = new Thread(() -> {
                        try {
                            while (true) {
                                byte[] buffer = new byte[1024];
                                int bytesRead = inputStream.read(buffer);
                                String receivedMessage = new String(buffer, 0, bytesRead);
                                System.out.println("상대방: " + receivedMessage);

                                if (receivedMessage.equals("q")) {
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    receiveThread.start();
 
                    while (true) {
                        String sendMessage = scanner.nextLine();
                        outputStream.write(sendMessage.getBytes());

                        if (sendMessage.equals("종료")) {
                            break;
                        }
                    }
 
                    receiveThread.join();
                    socket.close();

                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }