package TP3_RMI.Conversion;
import java.rmi.Naming;

public class Client {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Pour obtenir une référence sur l'objet distant à partir de son nom,
            // il faut utiliser la méthode statique lookup() de la classe Naming.
            // Cette méthode attend en paramètre une URL indiquant le nom qui référence l'objet distant.
            ConvInterface obj = (ConvInterface) Naming.lookup("rmi://localhost:"+ port +"/conversion");
            System.out.println(obj.fahr2Celsius(30));
            System.out.println(obj.celsius2Far(35));
        } catch (Exception e) {
            System.out.println("Conversion Client exception: " + e);
        }
    }
}
