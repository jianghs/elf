package me.jianghs.elf.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @className: Server
 * @description:
 * @author: jianghs430
 * @createDate: 2021/3/1 10:28
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8777);
        // 此处有阻塞性
        Socket socket = serverSocket.accept();
        InputStream ins = socket.getInputStream();
        // 此处有阻塞性
        ins.read(new byte[1024]);

        InputStreamReader inputStreamReader = new InputStreamReader(ins);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String getString = "";
        while (!"".equals(getString = bufferedReader.readLine())) {
            System.out.println(getString);
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
        outputStream.write("<html><body><a href='http://www.baidu.com'>welcome!</a></body></html>".getBytes());

        outputStream.flush();
        bufferedReader.close();
        inputStreamReader.close();
        ins.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
