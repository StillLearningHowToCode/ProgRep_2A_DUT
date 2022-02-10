package TP1_sockets;
// Client.java
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String argv[]) throws Exception {
        /*Le client se connecte au site donné en premier argument
        et sur un numéro de port donné en deuxième argument*/
        Socket emission = new Socket(argv[0], Integer.parseInt(argv[1]));

        // Impression du numéro de socket
        System.out.println("SOCKET = " + emission );

        // Impression du numéro de port
        System.out.println("Socket de connexion:" + emission.getLocalPort());

        // Création du flux entrant
        BufferedReader in = new BufferedReader(
        new InputStreamReader(emission.getInputStream()) );

        // Création du flux sortant
        PrintWriter out = new PrintWriter( new BufferedWriter(
        new OutputStreamWriter(emission.getOutputStream())), true);

        // Envoi de la chaîne Hello_World
        String str = "Hello_World";
        out.println(str);

        // Lecture du message echo (Hello_World)
        str = in.readLine();
        System.out.println(str);

        // Fermeture des flux sockets
        out.close();
        in.close();
        emission.close();
    }
}