package TP3_RMI.Calculateur;

import TP3_RMI.CalculateurInterface.CalculateurInterface;
import TP3_RMI.Conversion.ConvInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalculateurImpl extends UnicastRemoteObject implements CalculateurInterface {
    public CalculateurImpl() throws RemoteException {
        super();
    }

    public double add(double a, double b) throws java.rmi.RemoteException {
       return (a+b);
    }

    public double sub(double a, double b) throws java.rmi.RemoteException {
        return (a-b);
    }

    public double mul(double a, double b) throws java.rmi.RemoteException {
        return (a*b);
    }

    public double div(double a, double b) throws java.rmi.RemoteException {
        return (a/b);
    }
}
