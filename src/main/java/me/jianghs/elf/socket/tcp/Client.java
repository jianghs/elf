package me.jianghs.elf.socket.tcp;

import java.io.IOException;
import java.net.Socket;

/**
 * @className: Client
 * @description:
 * @author: jianghs430
 * @createDate: 2021/3/1 10:30
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端连接准备...");
        Socket socket = new Socket("localhost", 8777);
        System.out.println("客户端连接结束...");
        socket.close();
    }
}
