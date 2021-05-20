package com.lzy.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 * MyBatis Plus Generator 配置执行类示例
 * </p>
 *
 * @author
 * @since
 */
public class MyBatisPlusGenerator {


private static String module="";
        private static String packages = "com.example.demo";
        private static String url = "jdbc:mysql://localhost:3306/movie?serverTimezone=Asia/Shanghai&useSSL=false";
        private static String driverName = "com.mysql.cj.jdbc.Driver";
        private static String user = "root";
        private static String password = "0408myhMYH+";
        private static String author = "Ma Yuhong";




        public static void main(String[] args) {
                /*
        使用提示
         */
            System.out.println("***************************************************************" +
                    "\nmybatis-plus自动生成器，将自动生成连接数据库中的所有表对应的xml、entity、mapper、service接口与实现类、controller。" +
                    "\n模块名输入有2种情况：" +
                    "\n①如果输入的是表的前缀（例如：表名tb_test，模块名输入tb时，会自动去掉表的前缀tb_，生成的文件为TestMapper.xml、Test.java" +
                    "、TestMapper.java、TestService.java/TestServiceImpl.java、TestController.java）" +
                    "\n②如果输入的是其它内容，比如xxx，非数据库中表的前缀，则不去前缀输出" +
                    "\n***************************************************************");
            // 代码生成器
            AutoGenerator autoGenerator = new AutoGenerator();

            // 全局配置
            GlobalConfig globalConfig = new GlobalConfig();
            String projectPath = System.getProperty("user.dir");
            //当前项目名
            String projectName =module;

            globalConfig.setOutputDir(projectPath + projectName + "/src/main/java");
            globalConfig.setAuthor(author);
            globalConfig.setOpen(false);
            globalConfig.setIdType(IdType.AUTO);//主键id自增
            globalConfig.setServiceName("%sService");//去掉Service接口名前缀I
            autoGenerator.setGlobalConfig(globalConfig);

            // 数据源配置 需配置
            DataSourceConfig dataSourceConfig = new DataSourceConfig();

            //数据库连接配置
            dataSourceConfig.setUrl(url);
            // dataSourceConfig.setSchemaName("public");
            dataSourceConfig.setDriverName(driverName);
            dataSourceConfig.setUsername(user);
            dataSourceConfig.setPassword(password);
            autoGenerator.setDataSource(dataSourceConfig);

            // 生成包配置
            PackageConfig packageConfig = new PackageConfig();
            packageConfig.setParent(packages);
            autoGenerator.setPackageInfo(packageConfig);

            // 自定义配置
            InjectionConfig injectionConfig = new InjectionConfig() {
                @Override
                public void initMap() {
                    // to do nothing
                }
            };

            // 如果模板引擎是 freemarker
            String templatePath = "/templates/mapper.xml.ftl";

            // 自定义输出配置
            List<FileOutConfig> focList = new ArrayList<>();

            // 自定义配置会被优先输出
            focList.add(new FileOutConfig(templatePath) {
                @Override
                public String outputFile(TableInfo tableInfo) {

                    // 自定义输出文件名
                    return projectPath + projectName + "/src/main/resources/mapper/"
                            + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                }
            });

            injectionConfig.setFileOutConfigList(focList);
            autoGenerator.setCfg(injectionConfig);

            // 配置模板
            TemplateConfig templateConfig = new TemplateConfig();

            // 配置自定义输出模板
            //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
            // templateConfig.setEntity("templates/entity-test.java");
            // templateConfig.setService("templates/service.java");
            // templateConfig.setController("templates/controller.java");

            templateConfig.setXml(null);
            autoGenerator.setTemplate(templateConfig);

            // 策略配置
            StrategyConfig strategyConfig = new StrategyConfig();
            strategyConfig.setNaming(NamingStrategy.underline_to_camel);//表名映射到实体策略，带下划线的转成驼峰
            strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//列名映射到类型属性策略，带下划线的转成驼峰
            // strategyConfig.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
            strategyConfig.setEntityLombokModel(true);//实体类使用lombok
//        strategyConfig.setRestControllerStyle(true);
            // strategyConfig.setSuperControllerClass("com.baomidou.ant.common.BaseController");

            // 如果 setInclude() //设置表名不加参数, 会自动查找所有表
            // 如需要制定单个表, 需填写参数如: strategyConfig.setInclude("user_info);
            strategyConfig.setInclude();
            // strategyConfig.setSuperEntityColumns("id");
//        strategyConfig.setControllerMappingHyphenStyle(true);

            //自动将数据库中表名为 user_info 格式的转为 UserInfo 命名
            strategyConfig.setTablePrefix(packageConfig.getModuleName() + "_");//表名映射到实体名称去掉前缀
            strategyConfig.setEntityBooleanColumnRemoveIsPrefix(true);// Boolean类型字段是否移除is前缀处理
            autoGenerator.setStrategy(strategyConfig);
            autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
            System.out.println("===================== MyBatis Plus Generator ==================");

            autoGenerator.execute();

            System.out.println("================= MyBatis Plus Generator Execute Complete ==================");

        }
}