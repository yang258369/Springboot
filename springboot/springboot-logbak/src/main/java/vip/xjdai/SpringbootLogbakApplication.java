package vip.xjdai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("vip.xjdai.mybatis")
public class SpringbootLogbakApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootLogbakApplication.class, args);
    }

}
