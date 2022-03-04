package TP3_RMI.DegreDeux;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DegreInterface extends Remote {
    //    String echo () throws RemoteException;
    public String degre2(int a, int b, int c) throws RemoteException;
}
