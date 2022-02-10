package TP2_sockets;

public class Somme extends TraitRequete {
    int x, y;

    public Somme (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public Object execute() {
        return new Integer(x+y);
    }
}
