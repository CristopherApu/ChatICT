package utils;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpService {
	private static ServerSocket sersock = null;
	private Socket sock = null;

	public TcpService(){}
	public TcpService(Socket socket){
		sock = socket;
	}
	public TcpService(int port){
		try{
			if(sersock == null)
				sersock =  new ServerSocket(port);
		}catch (Exception e) {e.printStackTrace();}
	}
	
	public Socket acceptConnection(){
		Socket socket = null;
		try{
//			closeConnection();
			if(sersock != null)
				socket = sersock.accept();
		}catch (Exception e) {e.printStackTrace();}
		return socket;
	}
	public void closeConnection(){
		try{
			if(sock != null){
				if(!sock.isClosed())
					sock.close();
				sock = null;
			}
		}catch (Exception e) {e.printStackTrace();}
	}
	public void sendObject(Object object){
		try{
			if(sock != null){
				ObjectOutputStream oos = new ObjectOutputStream(sock.getOutputStream());
				oos.writeObject(object);
			}
		}catch (Exception e) {e.printStackTrace();}
	}
	public Object recibeObject(){
		Object object=null;
		try{
			if(sock != null){
				ObjectInputStream ois = new ObjectInputStream(sock.getInputStream());
				object = ois.readObject();
			}
		}catch (Exception e) {e.printStackTrace();}
		return object;
	}
	public void openConnection(String ip, int port){
		try{ 
			if(sock == null)
				sock = new Socket(ip, port);
		}catch (Exception e) {e.printStackTrace();}
	}

}