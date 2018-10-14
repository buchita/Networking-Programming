//find the ip of the local machine

import java.net.*;

public class localIP
{
	public static void main (String[] args)
	{
		try
		{
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		}
		catch(Exception ex)
		{
			System.out.println("Cant find the local machines address");
		}
	}	
}