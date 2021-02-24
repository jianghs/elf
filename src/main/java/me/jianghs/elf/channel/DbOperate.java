package me.jianghs.elf.channel;

/**
 * @className: DbOperate
 * @description:
 * @author: jianghs430
 * @createDate: 2021/2/23 16:13
 * @version: 1.0
 */
public class DbOperate implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("开始自动关闭");
    }
}
