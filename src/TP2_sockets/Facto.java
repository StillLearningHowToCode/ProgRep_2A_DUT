package TP2_sockets;

public class Facto extends TraitRequete {
     int n;

     Facto (int n) {
        this.n = n;
    }

    public Object execute() {
         // System.out.println(n);
        int f = 1;
        for (int i=1; i<=n; i++)  f=f*i;
       //  System.out.println(f);
        return new Integer (f);
    }
}
