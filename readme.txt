                学生请假平台
技术栈：springboot  dubbo  zookeeper  mybatis  redis

开发进度：
    2022.5.21 16:40  完成mysql中的表设计
    2022.5.21 16:45  搭建配置开发环境

项目技术点
1. 使用zookeeper作为负载均衡的组件。
2. 使用redis实现分布式session。
3. 使用redis实现分布式锁。
4. 使用redis做请假表的缓存。
5. 使用rabbitmq异步流量削峰。

难点
1.springboot访问jsp文件   (consumer2为例子)
(1)配置pom文件
(2)创建webapp 并且设定为web目录 还有arf
(3)再configuration中设置working directory $MODULE_WORKING_DIR$

