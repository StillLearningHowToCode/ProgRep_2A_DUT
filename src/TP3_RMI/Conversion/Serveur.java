package TP3_RMI.Conversion;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            // Naming.rebind ("hello", new HelloImpl());
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+ port +"/conversion", new ConvImpl());
            System.out.println("Server Conversion prêt !");
        } catch (Exception e) {
            System.out.println("Server Conversion échec " + e);
        }
    }
}