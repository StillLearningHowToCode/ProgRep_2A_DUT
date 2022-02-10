package TP2_sockets;
import java.io.*;
import java.net.*;
import java.util.*;

class Application extends Thread {
    Socket client;
    Application (Socket client ) throws SocketException {
        this.client = client;
    }
    public void run() {
        try {
            ObjectInputStream in =
                    new ObjectInputStream(client.getInputStream());
            ObjectOutputStream out =
                    new ObjectOutputStream(client.getOutputStream());
            while(true) {
                out.writeObject(traiteRequete(in.readObject()));
                out.flush();}
        } catch(EOFException e3) {// Fin de fichier normale
            try{
                client.close();
            } catch( IOException e) { }
        } catch(IOException e) {
            System.out.println("Erreur d'entree sortie " +e );
        } catch(ClassNotFoundException e2) {
            System.out.println(e2); // Le type de l'objet demandé est inconuu
        }

    }
    private Object traiteRequete(Object requete) {
        if (requete instanceof Date )
            return new java.util.Date();
        else if (requete instanceof Carre)
            return ((Carre)requete ).execute();
        else if (requete instanceof Somme )
            return ((Somme)requete).execute();
        else return null;
    }
}
