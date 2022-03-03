package TP3_RMI.Conversion;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConvImpl extends UnicastRemoteObject implements ConvInterface {
    public ConvImpl() throws RemoteException {
        super();
    }

    @Override
    public String echo() throws RemoteException {
        return "Conversion :";
    }
}
