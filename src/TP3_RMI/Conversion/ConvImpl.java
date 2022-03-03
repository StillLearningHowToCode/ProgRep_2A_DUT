package TP3_RMI.Conversion;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConvImpl extends UnicastRemoteObject implements ConvInterface {
    public ConvImpl() throws RemoteException {
        super();
    }

    @Override
    public double fahr2Celsius(double f) throws RemoteException {
        return (f-32)*(5/9.);
    }

    @Override
    public double celsius2Far(double c) throws RemoteException {
        return (c*9/5.)+32;
    }
}
