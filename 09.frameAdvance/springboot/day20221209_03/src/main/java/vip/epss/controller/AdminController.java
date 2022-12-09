package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.epss.domain.Person;

@RestController
@RequestMapping("admins")
public class AdminController {

    //获取配置文件中的内容, 通过@Value赋值到  成员属性 ,需要使用spEL表达式 ,格式要兼容
    @Value("${username}")
    private String uname;
    //获取数组的单一元素
    @Value("${hobby[1]}")
    private String hobby;
    //获取对象的单一属性
    @Value("${server.servlet.encoding.charset}")
    private String encode;

    //获取整个配置文件  ，整个配置文件默认都会被IOC收录，都被封装在Environment对象，通过自动注入@Autowired引用，通过  getProperty获得具体的key对应的value
    @Autowired   //
    private Environment environment;

    //获取配置文件中的部分片段 ，将片段封装为实体类， setter和getter自动注入

    @Autowired   //手工设置能够被IOC收录
    private Person person;


//    @Value("${hobby}")
//    private String[] hobbys;

    @GetMapping
    public String test01(){
        System.out.println(this.uname + this.hobby + this.encode + this.environment.getProperty("username"));
//        for (String  s:hobbys
//             ) {
//            System.out.println(s);
//        }

        System.out.println(person);
        return this.uname + this.hobby + this.encode +  this.environment.getProperty("username");
    }
}
