package de.tuberlin.sbe.prog1winf.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Ingo Weber, David Bermbach
 * This is a very simple server class, that just writes inputs to System.out. It stops after 10 inputs.
 */
public class SimpleServer extends Thread{
	
	public void run() {
//		try (ServerSocket server = new ServerSocket(8082);) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(8082);
			Socket client = server.accept();

			int i;
			int j = 0;
			while (j < 10 && (i = client.getInputStream().read()) != -1) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				j++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
