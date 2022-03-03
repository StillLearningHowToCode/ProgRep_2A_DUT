package TP3_RMI.Hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
    public HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String echo() throws RemoteException {
        return "Hello World";
    }
}
