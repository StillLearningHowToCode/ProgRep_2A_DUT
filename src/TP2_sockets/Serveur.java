package TP2_sockets;

import java.io.*;
import java.net.*;
import java.util.*;
public class Serveur {
    public static void main(String argv[])throws IOException {
        ServerSocket ecoute = new ServerSocket(Integer.parseInt(argv[0]));
        System.out.println("Le serveur reçoit sur le port: " + ecoute.getLocalPort());
        while(true)
            new Application(ecoute.accept()).start();
    }
}