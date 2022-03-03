package TP3_RMI.Conversion;

import java.rmi.Remote;
import java.rmi.RemoteException;

/* Remote Interface ConvInterface pour l'application Conversion */
public interface ConvInterface extends Remote {
    String echo () throws RemoteException;
}