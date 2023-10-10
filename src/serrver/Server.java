package serrver;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try{
            ServerSocket serversocket= new ServerSocket(12345);
            Socket socket=serversocket.accept();
            System.out.println("La connection est etablie");

            socket.close();
            serversocket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
