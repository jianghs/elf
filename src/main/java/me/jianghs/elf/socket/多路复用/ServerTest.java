package me.jianghs.elf.socket.多路复用;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @className: Test
 * @description:
 * @author: jianghs430
 * @createDate: 2021/3/4 15:48
 * @version: 1.0
 */
public class ServerTest {

    public static Logger logger = LoggerFactory.getLogger(ServerTest.class);

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        logger.info("通道是否阻塞{}", serverSocketChannel.isBlocking());

        // 可以通过通道绑定
        serverSocketChannel.bind(new InetSocketAddress("localhost", 8888));
        ServerSocket serverSocket = serverSocketChannel.socket();
//        serverSocket.bind(new InetSocketAddress("localhost", 8888));
        logger.info("Server启动成功:{}", System.currentTimeMillis());

        Socket socket = serverSocket.accept();
        logger.info("Server接收成功:{}", System.currentTimeMillis());

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        char[] charArr = new char[1024];
        int length = inputStreamReader.read(charArr);
        while (length != -1) {
            String str = new String(charArr, 0, length);
            System.out.println(str);
            length = inputStreamReader.read(charArr);
        }

        inputStreamReader.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        serverSocketChannel.close();
    }
}
