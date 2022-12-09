package vip.epss.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// 需要读取配置文件的相关属性值赋值给 Person的具体对象 person
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Double salary;
    //允许自动注入， 需要传概念Setter和Getter， 也可以使用lombok

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
