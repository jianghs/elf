package me.jianghs.elf.socket.多路复用;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @className: ClientTest
 * @description:
 * @author: jianghs430
 * @createDate: 2021/3/4 15:55
 * @version: 1.0
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8888 );
        String text = "张三你好";

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(text.getBytes());
        outputStream.close();
        socket.close();
    }
}
