package TP3_RMI.DegreDeux;
import java.rmi.Naming;

public class Client {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Pour obtenir une référence sur l'objet distant à partir de son nom,
            // il faut utiliser la méthode statique lookup() de la classe Naming.
            // Cette méthode attend en paramètre une URL indiquant le nom qui référence l'objet distant.
            DegreInterface obj = (DegreInterface) Naming.lookup("rmi://localhost:"+ port +"/degre");
            System.out.println(obj.degre2(30,20,3));
        } catch (Exception e) {
            System.out.println("Degré2 Client exception: " + e);
        }
    }
}

