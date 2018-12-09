import java.rmi.*;

public interface RemoteInterface extends Remote{

	public double doCalc(double vari) throws RemoteException;
}