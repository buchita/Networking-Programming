import java.net.*;


//ip span checker to a given ip
public class CheckSpam
{
    public static void main(String[] args) throws Exception
    {
        //spam
        //String ip = "2.0.0.127"; //ip is reversed 127.0.0.2
        //String website = ".sbl.spamhaus.org"; //www.spamhaus.org.sbl/

        //google non spam
        String ip = "74.125.90.67";
        String website = ".th.gooogle.co";

        String q;

        try {
            q = ip + website;
            InetAddress.getByName(q);
            System.out.println(ip+ " is a known spammer.");
        }
        catch (Exception a)
        {
            System.out.println(ip + " is a legit website boi");
        }
    }

}

