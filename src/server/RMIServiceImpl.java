package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/2/8 下午4:15
 */
public class RMIServiceImpl extends UnicastRemoteObject implements RMIService{

    public RMIServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String msg) throws RemoteException {
        
        return "hello！"+msg;
    }


    public static void main(String[] args) throws Exception{
        RMIService rmiService = new RMIServiceImpl();
        Naming.bind("rmi://localhost:3001/helloService",rmiService);
        System.out.println("RMIServiceImpl 注册完毕");
    }

}
