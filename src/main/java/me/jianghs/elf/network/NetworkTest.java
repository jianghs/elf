package me.jianghs.elf.network;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Objects;

/**
 * @className: NetworkTest
 * @description:
 * @author: jianghs430
 * @createDate: 2021/2/24 16:40
 * @version: 1.0
 */
public class NetworkTest {

    private static final Logger logger = LoggerFactory.getLogger(NetworkTest.class);

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();

        while (networkInterface.hasMoreElements()) {
            NetworkInterface eachNetworkInterface = networkInterface.nextElement();
            logger.info("-----------start-----------");
            logger.info("网络设备名称：{}", eachNetworkInterface.getName());
            logger.info("网络设备显示名称：{}", eachNetworkInterface.getDisplayName());
            logger.info("网络设备接口索引：{}", eachNetworkInterface.getIndex());
            logger.info("是否开启：{}", eachNetworkInterface.isUp());
            logger.info("是否回调：{}", eachNetworkInterface.isLoopback());
            logger.info("获取最大传输单元：{}", eachNetworkInterface.getMTU());
            logger.info("是否虚拟子接口：{}", eachNetworkInterface.isVirtual());
            byte[] bytes = eachNetworkInterface.getHardwareAddress();
            String mac = "";
            if (Objects.nonNull(bytes) && bytes.length != 0) {
                for(byte item : bytes) {
                    String a = item + "";
                    mac += a;
                }
            }
            logger.info("MAC地址：{}", mac);
            Enumeration<InetAddress> ips = eachNetworkInterface.getInetAddresses();
            while(ips.hasMoreElements()) {
                InetAddress inetAddress = ips.nextElement();
                logger.info("完全限定域名：{}", inetAddress.getCanonicalHostName());
                logger.info("主机名：{}", inetAddress.getHostName());
                logger.info("IP字符串：{}", inetAddress.getHostAddress());

                byte[] addresses = inetAddress.getAddress();
                String ip = "";
                if (Objects.nonNull(addresses) && addresses.length != 0) {
                    for(byte item : addresses) {
                        String a = item + "";
                        ip += a;
                    }
                }
                logger.info("原始IP：{}", ip);
            }

            logger.info("-----------end-----------");
            logger.info("");
        }
    }
}
