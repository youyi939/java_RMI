package server;

import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/2/7 下午12:47
 */
public class RMIRegistryServer {
    public static void main(String[] args) throws Exception{

        LocateRegistry.createRegistry(3001);
        System.out.println("RMI 注册服务器启动完毕");
        //阻塞主线程，使用RMI注册服务器保持运行
        new Scanner(System.in).next();

    }
}
