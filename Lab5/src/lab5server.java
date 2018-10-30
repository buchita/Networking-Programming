/*1. Write a TCP Client Server Application that will perform the below operation.
a) Client Send integer 1 to server and Server ask the client to send two number
and perform Addition. Server also return the result to client. The client prints the
output on screen.
b) Client Send integer 2 to server and Server ask the client to send one number
and calculate the square root of that number. Server also return the result to client.
The client prints the output on screen.
c) Client Send integer 3 to server and Server ask the client to send two number and
calculate the power of that number. Server also return the result to client. The client
prints the output on screen.
d) Client Send integer 0 to server and Server send 0 to client and shutdown.The
Client also terminate after receiving 0.

 */
import java.io.*;
import java.net.*;


public class lab5server {

    public static void main(String[] args) throws IOException {

       try
       {
           String op_str;

           do {

               //create a server
               ServerSocket server = new ServerSocket( 5000, 10 ); // create ServerSocket
               System.out.println("\nServer is Running on port 5000\n");

               //wait for client request
               Socket connection = server.accept();

               //for read and write the input/output to stream
               ObjectOutputStream out = new ObjectOutputStream( connection.getOutputStream() );
               ObjectInputStream in = new ObjectInputStream( connection.getInputStream() );
               op_str = (String) in.readObject();
               //int option;

               //String op_str = ( String ) in.readObject();
               //option = Integer.parseInt(op_str);

               double sum = 0;
               double num1;
               double num2;

               switch (op_str)
               {
                   case "1":
                   {
                       //read in 2 ints
                       num1 = (double)in.readObject();
                       num2 = (double)in.readObject();

                       //do some addition

                       sum = num1+num2;
                       System.out.print("\nData from Client: "+num1+ " + "+ num2+"\n");
                       out.writeObject(sum);

                       server.close();
                       break;
                   }
                   case "2":
                   {
                       num1 = (double)in.readObject();

                       //do square root
                       sum = Math.sqrt(num1);

                       System.out.print("\nData from Client: Square root of "+num1+"\n");

                       out.writeObject(sum);

                       server.close();
                       break;

                   }
                   case "3":
                   {
                       //read in 2 ints
                       num1 = (double)in.readObject();
                       num2 = (double)in.readObject();

                       sum = Math.pow(num1,num2);

                       System.out.print("\nData from Client: "+num1+ " pow "+ num2+"\n");

                       out.writeObject(sum);

                       server.close();
                       break;

                   }
                   case "0":
                   {
                       System.exit(0);
                       server.close();
                       break;
                   }

               }
           }while (op_str != "4");

       }
        catch (Exception ex) {
            System.err.println(ex);

        }
    }
}
