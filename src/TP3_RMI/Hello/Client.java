package TP3_RMI.Hello;

import java.rmi.Naming;

public class Client {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Pour obtenir une référence sur l'objet distant à partir de son nom,
            // il faut utiliser la méthode statique lookup() de la classe Naming. 
            // Cette méthode attend en paramètre une URL indiquant le nom qui référence l'objet distant.
            HelloInterface obj = (HelloInterface) Naming.lookup("rmi://localhost:port/Hello");
            System.out.println(obj.echo());
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e);
        }
    }
}
