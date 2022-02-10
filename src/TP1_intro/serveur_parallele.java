package TP1_intro;
// serveur_parallele
import java.io.*;
import java.net.*;

public class serveur_parallele {

    public static void main(String[] argv) throws IOException
    {
        ServerSocket ecoute = null;
        try {
            ecoute = new ServerSocket(Integer.parseInt(argv[0]));
        }
        catch(IOException e) {
            System.err.println("Impossible d'ecouter sur le port indique");

            System.exit(1);
        }

        // Acceptation de socket client
        Socket client = null;
        while(true){
            try{
                client = ecoute.accept();

                // Creation d'un fils par thread
                Thread fils = new Thread (new Application (client));
                System.out.println(" Thread " + fils.getName() + "cree");

                // Lancement du fils
                fils.start();
            }

            catch(IOException e)
            {
                System.err.println("Erreur de création de fils ");
                System.exit(1);
            }
        }
    }
}