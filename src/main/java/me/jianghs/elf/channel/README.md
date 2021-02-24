# channel

通道是数据传输。

Channel 是 Closeable 的子接口，Closeable 是 AutoCloseable的子接口。


Channel下11个子接口。

- AutoClosable
    - Closeable
        - Channel
            - NetworkChannel(I)：网络通道
                - MulticastChannel(I)：支持IP多播
            - AsynchronousChannel(I)：支持异步IO
                - AsynchronousByteChannel(I)  支持异步IO,操作单位为字节
            - ReadableByteChannel(I)：将通道数据读入buffer
                - ByteChannel(I)：融合read和write  
                    - SeekableByteChannel(I):字节通道中可以维护位置
                - ScatteringByteChannel(I)：将通道数据读入多个buffer
            - WriteableByteChannel(I)
                - ByteChannel(I)  
                    - SeekableByteChannel(I)
                - GatheringByteChannel(I)：将多个缓冲区数据写入通道
            - InterruptibleChannel(I)：通道可以以异步的方式中断或者关闭
                - AbstractInterruptibleChannel(C)
                    - FileChannel(C):操作文件，永远阻塞
            