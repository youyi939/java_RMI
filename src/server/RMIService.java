package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/2/8 下午4:14
 */
public interface RMIService extends Remote {
    public String sayHello(String msg)throws RemoteException;
}
