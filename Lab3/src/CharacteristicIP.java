import java.net.*;

public class CharacteristicIP
{
    //find the characteristics of IP
    public static void main(String[] args)
    {
        try {
            //create an add from user input
            InetAddress add = InetAddress.getByName(args[0]);

            //Site local Address is  equivalent to private IP add in IPv4
            //The add space reserved for these addresses, which is only routed within an organisation and not on public internet
            //ie 10.0.0.0/8
            //172.16.0.0/12
            //192.168.0.0/16
            if (add.isSiteLocalAddress())
            {
                System.out.println(add+" is the local network");
            }

            //loopback is an add that sends outgoing signals back to the same computer for testing
            //ie 127.0.0.1
            //and pinging this add will always return a reply unless the firewall prevents it.
            if (add.isLoopbackAddress())
            {
                System.out.println(add+ " is loopback add");
            }

            //range from 244.0.0.0 through 239.255.255.255
            if (add.isMulticastAddress())
            {
                System.out.println(add + " is the multicast add");
            }
            else
            {
                //a unicast add is an add that identifies a unique node on a network.
                //refers to a single sender or single receiver.
                System.out.println(add + " is a unicast add");
            }
        }
        catch (UnknownHostException a)
        {
            System.out.println("Could not resolve " + args[0]);
        }
    }
}
