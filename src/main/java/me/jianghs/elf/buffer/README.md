# Buffer
缓冲区是将数据打包。

本质是使用数组保存。

1. capacity:容量，元素数量，不能为负数，不能更改。
1. limit：设置此缓冲区的限制，代表第一个不应该读取或写入元素的index，不能为负，不能大于capacity。
1. position:下一个要读取或写入的元素的index，不能为负，不能大于limit
1. mark:调用reset方法时，会将position位置重置为mark。不能为负数，不能大于position。

## 直接缓冲区 和 中间缓冲区

1. 直接缓冲区，直接内核与硬盘交互。
1. 中间缓冲区，由JVM创建。