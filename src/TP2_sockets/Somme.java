package TP2_sockets;

public class Somme extends TraitRequete {
    int x, y;

    public Somme (int n) {
        this.x=x;
        this.y=y;
    }

    public Object execute() {
        return new Integer(x+y);
    }
}
