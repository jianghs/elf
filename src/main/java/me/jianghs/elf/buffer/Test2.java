package me.jianghs.elf.buffer;

import java.nio.*;

/**
 * @className: Test
 * @description:
 * @author: jianghs430
 * @createDate: 2021/2/23 13:58
 * @version: 1.0
 */
public class Test2 {

    public static void main(String[] args) {
        byte[] bytes = new byte[] {1, 2, 3, 4};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        byteBuffer.position(2);
        System.out.println("bytebuffer=" + byteBuffer.capacity());
        System.out.println("bytebuffer=" + byteBuffer.limit());
        System.out.println("bytebuffer=" + byteBuffer.position());
    }

}
