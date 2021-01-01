# mybatis-plus-generator

#### 介绍
mybatis-plus代码生成器（SpringBoot）

#### 软件架构
软件架构说明
SpringBoot、mybatis-plus

#### 使用说明

1.运行com.lzy.generator.MyBatisPlusGenerator#main()方法

2.说明：
mybatis-plus自动生成器，将自动生成连接数据库中的所有表对应的xml、entity、mapper、service接口与实现类、controller。

模块名输入有2种情况：

①如果输入的是表的前缀（例如：数据库中表名tb_test，模块名输入tb时，会自动去掉表的前缀tb_，生成的文件为TestMapper.xml、Test.java、TestMapper.java、TestService.java/TestServiceImpl.java、TestController.java）

②如果输入的是其它内容，比如xxx，非数据库中表的前缀，则不去前缀输出


#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request

