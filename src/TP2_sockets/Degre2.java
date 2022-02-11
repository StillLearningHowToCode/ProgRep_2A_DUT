package TP2_sockets;

public class Degre2 extends TraitRequete {
    int a, b, c;

    Degre2 (int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Object execute() {
        // tant que a est nul, demander une valeur a l'utilisateur
        if (a == 0.0) {
            //System.out.println("Erreur ! Entrez une valeur non nulle pour a.");
            return ("Erreur ! Entrez une valeur non nulle pour a.");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0.0) {
            //System.out.println("Pas de solutions reelles");
            return ("Pas de solutions reelles");
        } else if (delta > 0.0) {
            //System.out.println("Deux solutions : " + (-b - Math.sqrt(delta)) / (2.0 * a) + " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
            return ("Deux solutions : " + (-b - Math.sqrt(delta)) / (2.0 * a) + " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
        } else {
            //System.out.println("Une solution unique : " + -b / (2.0 * a));
            return ("Une solution unique : " + -b / (2.0 * a));
        }
    }
}