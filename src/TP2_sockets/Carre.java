package TP2_sockets;

// Class carré
public class Carre extends TraitRequete {
    int n;

    public Carre (int n) {
        this.n =n;
    }
    public Object execute() {
        return new Integer(n*n);
    }
}
