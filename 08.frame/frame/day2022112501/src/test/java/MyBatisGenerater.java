import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class MyBatisGenerater {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        System.out.println(URLDecoder.decode(Thread.currentThread().getContextClassLoader().getResource("mybatisGenerateConfig.xml").getPath(),"utf-8"));
        File configFile = new File(URLDecoder.decode(Thread.currentThread().getContextClassLoader().getResource("mybatisGenerateConfig.xml").getPath(),"utf-8"));
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
