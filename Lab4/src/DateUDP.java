/*
 Modify the program “Construct a Date by talking to time.nist.gov”, see lecture-03
slides. In class we have done it using TCP/IP and now you have to modify it and get
time by using UDP protocol. The server IP and port number is same
 */
import java.net.*;
import java.io.*;
import java.lang.String;

public class DateUDP
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress add  = InetAddress.getByName("time.nist.gov");
            DatagramSocket socket = new DatagramSocket( 13, add);
            byte data[] = new byte[100];
            DatagramPacket recievePacket = new DatagramPacket(data, data.length);
            socket.setSoTimeout(15000);


        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }




}
