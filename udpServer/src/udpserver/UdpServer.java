package udpserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CatalinRosu
 */
public class UdpServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (DatagramSocket dServer = new DatagramSocket(700);)
        {
            byte[] buff = new byte[128];
            
            DatagramPacket p = new DatagramPacket(buff, buff.length);
            
            System.out.println("listening....");
            
            dServer.receive(p);            
            
            String message = new String(p.getData(), 0 ,p.getLength());   
            System.out.println(message);
            
            String responce =  "hello ftom java server";
            buff = responce.getBytes();
            p = new DatagramPacket(buff, buff.length,p.getAddress(),p.getPort());
            
            System.out.println("seding...");
            dServer.send(p);
           
        } 
        
        
        catch (SocketException ex) {
        System.out.print("Error in connection "+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(UdpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
