/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatUnidireccional;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author DANIC
 */
class Client {
    int port;
    String address;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    
    public Client(int port, String address){
        this.port=port;
        this.address= address;
        
    }
    
   public void initSocket(){
    try {
        socket=new Socket(address,port);
        dos=new DataOutputStream(socket.getOutputStream());

        dos.writeUTF("hola k hace :D");
    while(true);
       } catch (UnknownHostException e) {
        System.out.println("error en el servidor");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("error de conexion");
        e.printStackTrace();
}

}
    
    public static void main(String arrg[]){
       Client client=new Client(1024, "127.0.0.1");
       client.initSocket();
    }
}
