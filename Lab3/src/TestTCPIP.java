import java.net.*;

public class TestTCPIP
{
    //test TCP/IP application layer protocols for www.dit.ie.


    //for testing the protocol
    public static void TestProtocol(String url)
    {
        try {
            URL linko = new URL(url);
            System.out.println(linko.getProtocol() + " is supported.");

        }
        catch (Exception a)
        {
            System.out.println(url + " is not supported.");
        }
    }
    public static void main(String[] args)
    {

        TestProtocol("http://www.dit.ie"); //http is supported
        TestProtocol("https://www.dit.ie"); //https is supported
        TestProtocol("ftp://dit.ie"); //ftp is supported
        TestProtocol("mailto:buchita.gitchamnan@mydit.ie"); //mailto is supported
    }

}
