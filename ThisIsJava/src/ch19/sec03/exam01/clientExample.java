package ch19.sec03.exam01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientExample {
	public static void main(String[] arg) {
		try {
			Socket socket = new Socket("localhost", 50001);

			System.out.println("[클라이언트] 연결 성공");

			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {

		} catch (IOException e) {
		}
	}

}
