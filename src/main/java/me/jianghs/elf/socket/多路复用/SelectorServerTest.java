package me.jianghs.elf.socket.多路复用;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @className: Test
 * @description:
 * @author: jianghs430
 * @createDate: 2021/3/4 15:48
 * @version: 1.0
 */
public class SelectorServerTest {

    public static Logger logger = LoggerFactory.getLogger(SelectorServerTest.class);

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        // 可以通过通道绑定
        serverSocketChannel.bind(new InetSocketAddress("localhost", 8888));
        ServerSocket serverSocket = serverSocketChannel.socket();

        Selector selector = Selector.open();
        SelectionKey selectionKey = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        logger.info("selector:{}", selector);
        logger.info("selectionKey:{}", selectionKey);
    }
}
