package TP3_RMI.DegreDeux;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class DegreImpl extends UnicastRemoteObject implements DegreInterface {
    public DegreImpl() throws RemoteException {
        super();
    }

    @Override
    public String degre2(int a, int b, int c) throws RemoteException {
        // tant que a est nul, demander une valeur a l'utilisateur
        if (a == 0) {
            //System.out.println("Erreur ! Entrez une valeur non nulle pour a.");
            return ("Erreur ! Entrez une valeur non nulle pour a.");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            //System.out.println("Pas de solutions reelles");
            return ("Pas de solutions reelles");
        } else if (delta > 0) {
            //System.out.println("Deux solutions : " + (-b - Math.sqrt(delta)) / (2.0 * a) + " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
            return ("Deux solutions : " + -(-b - Math.sqrt(delta)) / (2.0 * a) + " et " + -(-b + Math.sqrt(delta)) / (2.0 * a));
        } else {
            //System.out.println("Une solution unique : " + -b / (2.0 * a));
            return ("Une solution unique : " + -b / (2.0 * a));
        }
    }
}