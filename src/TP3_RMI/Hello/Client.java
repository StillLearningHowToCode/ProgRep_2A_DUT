package TP3_RMI.Hello;

import java.rmi.Naming;

public class Client {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            HelloInterface obj = (HelloInterface) Naming.lookup("rmi://localhost:port/hello");
            System.out.println(obj.echo());
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e);
        }
    }
}
