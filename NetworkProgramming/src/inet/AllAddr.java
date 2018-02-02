package inet;

import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AllAddr {
	public static void main(String[] args) {
//		try {
//			InetAddress[] addresses = InetAddress.getAllByName("www.microsoft.com");
//			for(int i = 0; i < addresses.length; i++) {
//				System.out.println(addresses[i]);
//			} 
//		} catch (UnknownHostException ex) {
//			System.out.println("Could not find www.microsoft.com");
//		}

		try {
			//InetAddress addresses = InetAddress.getByName("104.124.227.184");
			String str = "172.217.27.14";
			InetAddress addresses = InetAddress.getByName(str);
			
			System.out.println(addresses.getHostName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
}
