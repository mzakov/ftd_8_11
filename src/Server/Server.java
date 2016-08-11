package Server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main (String args[]){
	
		try
		(	
				ServerSocket ss =new ServerSocket(12345);
				Socket s = ss.accept();
				//waits here
				InputStream in = s.getInputStream();
				Reader base = new InputStreamReader(in);
				BufferedReader r = new BufferedReader(base);
		){
			String result = r.readLine();
			System.out.println(result);
			
		}catch(IOException e){
			
		}
		
	}
	

	
}
