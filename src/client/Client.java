package client;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try{

            Socket socket=new Socket("localhost",12345);


            socket.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
