package TP1_intro;
import java.io.*;
import java.net.*;

class Application implements Runnable {
    Socket sock_com;

    Application(Socket sock_com) throws SocketException {
        this.sock_com = sock_com;
    }

    public void run() {
        try {
            System.out.println("Adresse socket" + sock_com.getInetAddress());
            System.out.println("Connexion venant de " + sock_com.getInetAddress().getHostName());

            // Creation des flux
            BufferedReader in = new BufferedReader(new InputStreamReader(sock_com.getInputStream()));

            String str;
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock_com.getOutputStream())),true);
            // Echange entre serveur et client
            str = in.readLine(); // lecture du message
            System.out.println("Message reçu = " + str);
            out.println(str); // renvoi du message reçu écho

            in.close();
            out.close();
            sock_com.close();
        } catch (IOException e) {
            System.out.println("Erreur E/S");
        }
    }
}