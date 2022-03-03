package TP3_RMI.Hello;

// Interface de Hello
import java.rmi.*;

/* Remote Interface HelloInterface pour l'application Hello */
public interface HelloInterface extends Remote {
    public String echo () throws RemoteException;
}