/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatUnidireccional;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DANIC
 */
public class Server {
    int port;
    ServerSocket server;
    Socket socket;
    DataInputStream dis;
    BufferedInputStream bis;
    
    public void powerUp(){
        try {
            server= new ServerSocket(port);
            socket = server.accept();
            dis= new DataInputStream(socket.getInputStream());
            while(true){    
                String data = dis.readUTF();
                System.out.println(data);
            }
        } catch     (IOException e) {
            System.out.println("no hay nada we");
            e.printStackTrace();
        }
    }
    
    public Server(int port){
        this.port= port;
        powerUp();
    }
    public static void main(String arrg[]){
        
        new Server(1024);

}
}



