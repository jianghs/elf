package me.jianghs.elf.channel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @className: FileChannelTest
 * @description:
 * @author: jianghs430
 * @createDate: 2021/2/24 10:45
 * @version: 1.0
 */
public class FileChannelTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\project\\elf\\file\\123.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileChannel = fileOutputStream.getChannel();
        String msg = "你好123HEllo";
        ByteBuffer byteBuffer = ByteBuffer.wrap(msg.getBytes());

        fileChannel.write(byteBuffer);
        fileChannel.close();
        fileOutputStream.close();
    }
}
