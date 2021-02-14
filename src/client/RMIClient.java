package client;

import server.RMIService;
import server.RMIServiceImpl;

import java.rmi.Naming;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/2/7 下午12:50
 */
public class RMIClient {
    public static void main(String[] args) throws Exception{
        RMIService service = (RMIService) Naming.lookup("rmi://localhost:3001/helloService");
        String info = service.sayHello("ken");
        System.out.println(info);

    }
}
