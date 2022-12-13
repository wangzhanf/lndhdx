package vip.epss;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MpGenerator {

    private static final String URL = "jdbc:mysql://localhost:3331/ele_se?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "111111";
    private static final String PACKAGE_NAME = "vip.epss";
    private static final String AUTHOR_NAME = "wangzhanf";
    private static final String OUTDIR_JAVA = "C:\\myfloder\\授课资料\\辽宁理工职业大学\\code\\09.frameAdvance\\FinalProject\\mpGenerator\\src\\main\\java";
    private static final String OUTDIR_XML = "C:\\myfloder\\授课资料\\辽宁理工职业大学\\code\\09.frameAdvance\\FinalProject\\mpGenerator\\src\\main\\resources\\mapper";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author(AUTHOR_NAME) // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(OUTDIR_JAVA) // 指定输出目录
                            .disableOpenDir();    // 禁止打开输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // 设置包名
                            .entity("domain")         //设置实体类包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, OUTDIR_XML)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("admin","business","info","food","ordermap") // 设置需要生成的表名
//                    builder.addInclude("admin") // 设置需要生成的表名
                            .controllerBuilder()   //这里写controllerBuilder，表示将开始controller配置
                            .enableRestStyle();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}