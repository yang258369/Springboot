package vip.xjdai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 配置druid必须加的注解，如果不加，访问页面打不开，filter和servlet、listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用
@MapperScan("vip.xjdai.demo.mapper")
@SpringBootApplication
public class SpringbootDruidApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootDruidApplication.class, args);
    }

}
