package me.jianghs.elf.socket.多路复用;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @className: Test
 * @description:
 * @author: jianghs430
 * @createDate: 2021/3/4 15:48
 * @version: 1.0
 */
public class ChannelServerTest {

    public static Logger logger = LoggerFactory.getLogger(ChannelServerTest.class);

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 可以通过通道绑定
        serverSocketChannel.bind(new InetSocketAddress("localhost", 8888));
        // 通道accept
        SocketChannel socketChannel = serverSocketChannel.accept();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int length = socketChannel.read(byteBuffer);
        while(length != -1) {
            String str = new String(byteBuffer.array());
            System.out.println(str);
            byteBuffer.flip();
            length = socketChannel.read(byteBuffer);
        }
        socketChannel.close();
        serverSocketChannel.close();
    }
}
