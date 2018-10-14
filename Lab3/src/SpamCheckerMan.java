import java.net.*;
import java.rmi.UnknownHostException;
import java.util.*;

//reading in the ip from the user
public class SpamCheckerMan
{
    //declare the spam website
    public static final String spamboi = "sbl.spamhaus.org";

    //function for figuring our if its spam website or not passing the string of ip from the user
   private static boolean isSpam(String arg)
   {
       try
       {
           //getting the actual ip not the String ip
           InetAddress add = InetAddress.getByName(arg);

           //converting the ip to bytes
           //returning as an object using the ip
           byte[] a = add.getAddress();

           String process = spamboi;


           for (byte octet: a)
           {
               //assigning the bytes into an int
               int unsignedByte = octet<0? octet+256: octet;

               //stick the ip and the url of the spamboi together
               process = unsignedByte + "." + process;
           }
           //getting the ip of the given name
           InetAddress.getByName(process);

           return true;
       }
       catch (java.net.UnknownHostException ex)
       {
           return false;
       }
   }


    public static void main(String[] args)
    {
        for (String arg : args)
        {
            if (isSpam(arg))
            {
                System.out.println(arg + " is a SPAMboi");

            }
            else
            {
                System.out.println(arg + " is NOT a spamboi");
            }
        }

    }
}
