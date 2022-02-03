package TD1;
// Serveur.java
import java.io.*;
import java.net.*;

public class Serveur {
    public static void main(String argv[]) throws Exception {
        // Le serveur crée une socket d'écoute sur le port indiqué comme premier argument
        ServerSocket ecoute = new ServerSocket(Integer.parseInt(argv[0]));

        // Imprimer le numéro de port
        System.out.println("\n Le serveur reçoit sur le port : " + ecoute.getLocalPort());

        // Le serveur est prêt à recevoir des requets du client
        System.out.println(">>> Serveur prêt!! ");

        // Boucle permettant la connexion de plusieurs clients
        while (true) {
            // Le serveur crée une socket d'échange sock_com
            Socket soc_com = ecoute.accept();

            // Impression de l'adresse du numéro de port
            System.out.println(" " + soc_com.getInetAddress());

            // Le client qui s'est connecté est connu par getInetAddress et getHostName
            InetAddress origin = soc_com.getInetAddress();
            System.out.println("Connection venant de: " + origin.getHostName());

            // Création du flux in qui permet de lire par ligne.
            BufferedReader in = new BufferedReader(
            new InputStreamReader(soc_com.getInputStream())
            );

            // Création du flux out qui possède toutes les opérations print classiques.
            PrintWriter out = new PrintWriter( new BufferedWriter(
            new OutputStreamWriter(soc_com.getOutputStream())), true);

            String str = in.readLine(); // lecture du message
            System.out.println("Message reçu = " + str);
            out.println(str); // renvoi du message reçu écho

            in.close();
            out.close();
            soc_com.close();
        }
    }
}
