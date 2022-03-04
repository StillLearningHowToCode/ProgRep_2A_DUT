package TP3_RMI.Calculateur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Naming.rebind ("hello", new HelloImpl());
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+ port +"/calculateur", new CalculateurImpl());
            System.out.println("Server Calculateur prêt !");
        } catch (Exception e) {
            System.out.println("Server Calculateur échec " + e);
        }
    }
}