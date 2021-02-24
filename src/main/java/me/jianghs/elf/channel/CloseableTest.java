package me.jianghs.elf.channel;

/**
 * @className: CloseableTest
 * @description:
 * @author: jianghs430
 * @createDate: 2021/2/23 16:12
 * @version: 1.0
 */
public class CloseableTest {

    public static void main(String[] args) {
        try(DbOperate dbOperate = new DbOperate()) {
            System.out.println("开始数据库操作");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
