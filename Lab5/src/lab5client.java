

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class lab5client
{
    public static void main(String[] args) {

        try {
            String op_str;


            do {
                System.out.print("\n\n\n\n\n");
                System.out.print("*****************MENU*****************\n");
                System.out.print("1 Addition\n");
                System.out.print("2 Square Root\n");
                System.out.print("3 Power\n");
                System.out.print("0 Exit\n");
                System.out.print("**************************************\n");
                System.out.print("\n\n");



                //creates and connects to a server
                Socket client = new Socket( "localhost",5000 );
                System.out.println("Client is connected to Server");
                ObjectOutputStream out = new ObjectOutputStream( client.getOutputStream() );
                ObjectInputStream in = new ObjectInputStream( client.getInputStream() );



                Scanner input = new Scanner(System.in);
                System.out.print("Enter the option\n");

                //convert string to int
                op_str = input.nextLine();
                //int option = Integer.parseInt(op_str);

                out.writeObject(op_str);


                //initialised the ints
                double num1;
                double num2;
                double sum;

                switch (op_str)
                {
                    case "1":
                    {
                        System.out.print("-----------------------1-----------------------\n");

                        System.out.print("Enter num1\n");
                        num1 = input.nextDouble();
                      /*  num1 = Double.parseDouble(num);*/
                        //System.out.print(num1);

                        System.out.print("\nEnter num2\n");
                        num2 = input.nextDouble();
                        /*num2 = Double.parseDouble(num_2);*/
                        //System.out.print(num2);

                        //send back to server
                        out.writeObject(num1);
                        out.writeObject(num2);


                        sum = (Double)in.readObject();
                        System.out.print("\nSum: "+sum+"\n");

                        client.close();
                        break;

                    }
                    case "2":
                    {
                        System.out.print("-----------------------2-----------------------\n");
                        System.out.print("Enter num1\n");
                        num1 = input.nextDouble();

                        out.writeObject(num1);

                        sum = (double)in.readObject();


                        System.out.print("Data from Server: sqrt= "+sum+"\n");
                        client.close();
                        break;

                    }
                    case "3":
                    {
                        System.out.print("-----------------------3-----------------------\n");

                        System.out.print("Enter num1\n");
                        num1 = input.nextDouble();
                        /*  num1 = Double.parseDouble(num);*/
                        //System.out.print(num1);

                        System.out.print("\nEnter num2\n");
                        num2 = input.nextDouble();
                        /*num2 = Double.parseDouble(num_2);*/
                        //System.out.print(num2);

                        //send back to server
                        out.writeObject(num1);
                        out.writeObject(num2);


                        sum = (Double)in.readObject();

                        System.out.print("\nSum: "+sum+"\n");

                        client.close();
                        break;


                    }
                    case "0":
                    {
                        System.out.print("Exiting the program");
                        System.exit(0);
                        client.close();
                        break;
                    }
                    default:
                    {
                        System.out.print("Enter num 0-3");
                        break;
                    }

                }

            }while (op_str!="4");



        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
