package TP3_RMI.DegreDeux;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class DegreImpl extends UnicastRemoteObject implements DegreInterface {
    public DegreImpl() throws RemoteException {
        super();
    }

    @Override
    public double degre2(int a, int b, int c) throws RemoteException {
        return (32)*(5/9.);
    }
}