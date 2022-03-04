package TP3_RMI.CalculateurInterface;

import java.rmi.Remote;

public interface CalculateurInterface extends Remote {
    public double add(double a, double b) throws java.rmi.RemoteException;
    public double sub(double a, double b) throws java.rmi.RemoteException;
    public double mul(double a, double b) throws java.rmi.RemoteException;
    public double div(double a, double b) throws java.rmi.RemoteException;
}
