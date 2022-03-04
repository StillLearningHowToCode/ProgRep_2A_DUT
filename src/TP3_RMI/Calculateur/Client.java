package TP3_RMI.Calculateur;
import TP3_RMI.CalculateurInterface.CalculateurInterface;

import java.rmi.Naming;

public class Client {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Pour obtenir une référence sur l'objet distant à partir de son nom,
            // il faut utiliser la méthode statique lookup() de la classe Naming.
            // Cette méthode attend en paramètre une URL indiquant le nom qui référence l'objet distant.
            CalculateurInterface obj = (CalculateurInterface) Naming.lookup("rmi://localhost:"+ port +"/calculateur");
            System.out.println("Addition :");
            System.out.println(obj.add(2,5));
            System.out.println("Soustraction :");
            System.out.println(obj.sub(2,5));
            System.out.println("Multiplication :");
            System.out.println(obj.mul(2,5));
            System.out.println("Division :");
            System.out.println(obj.div(2,5));
        } catch (Exception e) {
            System.out.println("Calculateur Client exception: " + e);
        }
    }
}
