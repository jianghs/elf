package me.jianghs.elf.buffer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.*;

/**
 * @className: Test
 * @description:
 * @author: jianghs430
 * @createDate: 2021/2/23 13:58
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        byte[] bytes = new byte[] {1, 2, 3};
        short[] shorts = new short[] {1, 2, 3};
        int[] ints = new int[] {1, 2, 3};
        long[] longs = new long[] {1, 2, 3};
        float[] floats = new float[] {1, 2, 3};
        double[] doubles = new double[] {1, 2, 3, 4, 5};
        char[] chars = new char[] {'1', '2', '3', '4'};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        ShortBuffer shortBuffer = ShortBuffer.wrap(shorts);
        IntBuffer intBuffer = IntBuffer.wrap(ints);
        LongBuffer longBuffer = LongBuffer.wrap(longs);
        FloatBuffer floatBuffer = FloatBuffer.wrap(floats);
        DoubleBuffer doubleBuffer = DoubleBuffer.wrap(doubles);
        CharBuffer charBuffer = CharBuffer.wrap(chars);

        System.out.println("bytebuffer=" + byteBuffer.getClass().getName());
        System.out.println("shortBuffer=" + shortBuffer.getClass().getName());
        System.out.println("intBuffer=" + intBuffer.getClass().getName());
        System.out.println("longBuffer=" + longBuffer.getClass().getName());
        System.out.println("floatBuffer=" + floatBuffer.getClass().getName());
        System.out.println("doubleBuffer=" + doubleBuffer.getClass().getName());
        System.out.println("charBuffer=" + charBuffer.getClass().getName());

        System.out.println("bytebuffer=" + byteBuffer.capacity());
        System.out.println("shortBuffer=" + shortBuffer.capacity());
        System.out.println("intBuffer=" + intBuffer.capacity());
        System.out.println("longBuffer=" + longBuffer.capacity());
        System.out.println("floatBuffer=" + floatBuffer.capacity());
        System.out.println("doubleBuffer=" + doubleBuffer.capacity());
        System.out.println("charBuffer=" + charBuffer.capacity());


    }

}
