# SpringBatchDemo

一个简单的SpringBatch例程。
前期准备MySQL数据库。用如下语句新建库：
```
create database spring_batch_example;
create user 'userName'@'localhost' identified by 'password';
grant all on spring_batch_example.* to 'userName'@'localhost';
```
在applicationContext.xml例设置库名，用户名和密码。
使用下面的命令创建 PRODUCT 表:
```
CREATE TABLE PRODUCT (
    ID INT NOT NULL,
    NAME VARCHAR(128) NOT NULL,
    DESCRIPTION VARCHAR(128),
    QUANTITY INT,
    PRIMARY KEY(ID)
);
```

本例程演示了将产品数量从CSV文件中读取出来,然后批量导入MySQL数据库中。
