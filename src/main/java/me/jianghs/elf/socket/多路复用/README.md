# I/O 多路复用
如果不使用，创建多个线程，每个线程对应一个通道，如果使用，则是一个线程对应多个通道。

目的：以更小的线程去操作更多的通道。每注册1023个通道就会创建1个线程。

## Selector\SelectionKey\SelectableChannel
Selector: 选择器，抽象类

SelectionKey:是一个标识，代表SelectableChannel已经向Selector注册了。

SelectableChannel：只有SelectableChannel类才具有register(Selector sel, int ops)方法，该方法作用是将当前的SelectableChannel注册到指定的选择器。

### SelectableChannel

当SelectableChannel在选择器注册后，通道在注销之前会一直处于注册状态。

注销通道需通过SelectableChannel.cancel()显式注销。

### ServerSocketChannel

阻塞模式下，没有客户端连接，服务端会一直处于阻塞状态。

非阻塞模式下，如果没有客户端连接，服务端会报异常。