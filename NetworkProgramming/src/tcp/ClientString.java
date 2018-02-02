package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientString {
	public static void main(String arg[]) {
		Socket socket;
		String str = "initialize";
		try {
			socket = new Socket("localhost",1111);
		
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

		    pw.println(str);

		    while ((str = br.readLine()) != null) {
		      System.out.println(str);
		      pw.println("bye");

		      if (str.equals("bye"))
		        break;
		    }

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
