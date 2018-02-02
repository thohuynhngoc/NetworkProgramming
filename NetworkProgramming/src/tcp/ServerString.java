package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		try {
			ServerSocket servSocket = new ServerSocket(1111);
		    System.out.println("Waiting for a connection on " + 1111);
			Socket fromClientSocket = servSocket.accept();
		    PrintWriter pw = new PrintWriter(fromClientSocket.getOutputStream(), true);

		    BufferedReader br = new BufferedReader(new InputStreamReader(fromClientSocket.getInputStream()));

		    while ((str = br.readLine()) != null) {
		      System.out.println("The message: " + str);

		      if (str.equals("bye")) {
		        pw.println("bye");
		        break;
		      } else {
		        str = "Server returns " + str;
		        pw.println(str);
		      }
		    }
		    pw.close();
		    br.close();
		} catch (IOException e) {
			System.err.println(" Connection Error: " + e);
		}
	}

}
