package TP2_sockets;
import java.io.*;

public class ProduitVecteur extends TraitRequete {
    // Déclaration-construction des deux vecteurs
    double [] v1;
    double [] v2;
    double x,y;

    ProduitVecteur ( double [] v1,  double [] v2) {
        this.v1 = v1;

        this.v2 = v2;
    }

    public Object execute() {

        //Test affichage variables





        // On exige l'introduction d'un entier entre 0 et 10
        /*while (n < 1 || n > nMax) {
            System.out.print("Quelle taille pour vos vecteurs [entre 1 et " + nMax + "] ? ");
        }*/

        // Calcul du produit scalaire
        double somme = 0.0;
        for (int i = 0; i < v1.length; i++) {
            somme += v1[i] * v2[i];
        }

        return new Double (somme);

        //System.out.println("Le produit scalaire de v1 par v2 vaut " + somme);

    }
}