package TP3_RMI.DegreDeux;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Naming.rebind ("hello", new HelloImpl());
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+ port +"/degre", new DegreImpl());
            System.out.println("Server Degré2 prêt !");
        } catch (Exception e) {
            System.out.println("Server Degré2 échec " + e);
        }
    }
}