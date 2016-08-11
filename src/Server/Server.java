package Server;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main (String args[]){
		
	}
	
	void serverSide() throws IOException{
		
		ServerSocket ss =new ServerSocket(12345);
		
		//This line will block
		Socket s = ss.accept();
		//Now we have connection to the client.
		
		//BufferedInputStream r = new BufferedReader(new InputStreamReader(s.getInputStream(), arg1));
	}
	
}
