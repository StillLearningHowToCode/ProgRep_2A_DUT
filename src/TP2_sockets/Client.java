package TP2_sockets;

// Client
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] argv) {
        try{
            Socket emission = new Socket(argv[0], Integer.parseInt(argv[1]));
            // System.out.flush();

            ObjectOutputStream out =
                    new ObjectOutputStream(emission.getOutputStream());
            ObjectInputStream in =
                    new ObjectInputStream(emission.getInputStream());

            System.out.println("--- Connexion établie ---");

            // Demande de la date
            System.out.println("Demande de la date ");
            out.writeObject(new Date());
            out.flush();
            System.out.println(in.readObject());
            System.out.flush();

            // Lancer le calcul du carré
            System.out.println("Calcul du carré ");
            System.out.flush();
            out.writeObject(new Carre(2));
            out.flush();

            // Résultat du carré
            System.out.println("Résultat du carré ");
            System.out.flush();
            System.out.println(in.readObject());

            emission.close();
            out.flush();
        } catch( IOException e) {
            System.out.println("Erreur d'entree sortie " +e );

        } catch(ClassNotFoundException e2) {
            System.out.println(e2);
        }
    }
}
