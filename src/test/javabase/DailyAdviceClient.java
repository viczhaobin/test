package test.javabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DailyAdviceClient {

	public void go() {
		try {
			Socket s = new Socket("172.0.0.1",4242);
			
			InputStreamReader streamReder = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReder);
			
			String advice = reader.readLine();
			System.out.println("Today you shold"+advice);
			
			reader.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
}
