
package udpclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;

public class UDPClient extends Calculator {
    
    
    public static void main(String[] args) {
    
        Calculator obj =  new Calculator();
    
        try {
            DatagramSocket sc = new DatagramSocket();
            byte[] message;           
            message =  "Hello form udp client".getBytes();
            
            InetSocketAddress ep = new InetSocketAddress("127.0.0.1",700);
            
            DatagramPacket p = new DatagramPacket(message, message.length,ep);
            
            sc.send(p);
            
            message =  new byte[128];
            
            p = new DatagramPacket(message, message.length ,ep);
            
            sc.receive(p);
            
            System.out.println(new String(p.getData(),0,p.getLength()));
       
            
        } catch (SocketException ex) {
          System.out.println("Eror in conection "+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
