//is it ipv4 or ipv6

import java.net.*;

public class ipTest
{
	public static void main(String[] args)
	{
		try
		{
			InetAddress ia = InetAddress.getByName(args[0]);
			byte[] address = ia.getAddress();

			if(address.length == 4)
			{
				System.out.println("IPv4 address");
			}
			else if(address.length == 16)
			{
				System.out.println("IPv6 address");	
			}
		}
		catch(Exception ex)
		{
			System.out.println("cant find the add");
		}
	}
}