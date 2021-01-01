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


#### 码云特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5.  码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
