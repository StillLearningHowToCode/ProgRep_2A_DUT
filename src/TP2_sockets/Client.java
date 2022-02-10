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

            System.out.println("--------------");

            // Lancer le calcul du carré
            System.out.println("Calcul du carré ");
            System.out.flush();
            out.writeObject(new Carre(2));
            out.flush();

            // Résultat du carré
            System.out.println("Résultat du carré ");
            System.out.flush();
            System.out.println(in.readObject());

            System.out.println("--------------");

            // Lancer le calcul de la somme
            System.out.println("Calcul de la somme ");
            System.out.flush();
            out.writeObject(new Somme(2,4));
            out.flush();

            // Résultat de la somme
            System.out.println("Résultat de la somme ");
            System.out.flush();
            System.out.println(in.readObject());

            System.out.println("--------------");

            // Lancer le calcul de la facto
            System.out.println("Calcul de la facto ");
            System.out.flush();

            out.writeObject(new Facto(4));
            out.flush();

            // Résultat de la somme
            System.out.println("Résultat de la facto ");
            System.out.flush();
            System.out.println(in.readObject());

            System.out.println("--------------");

            // Lancer le calcul de la facto
            System.out.println("Calcul du degre 2 ");
            System.out.flush();

            out.writeObject(new Degre2(10,5,6));
            out.flush();

            // Résultat de la somme
            System.out.println("Résultat du degre 2 ");
            System.out.flush();
            System.out.println(in.readObject());

            // ---------------------------------------

            emission.close();
            out.flush();
        } catch( IOException e) {
            System.out.println("Erreur d'entree sortie " +e );

        } catch(ClassNotFoundException e2) {
            System.out.println(e2);
        }
    }
}
