package cn.tangue.templateenginee;

import cn.tangue.templateenginee.config.event.MyListener1;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "cn.tangue.templateenginee.mapper")
@ServletComponentScan //让springboot能扫描到servlet组件
public class TemplateengineeApplication {

    public static void main(String[] args) {
        //注册自定义监听器写代码注册自定义监听器方式1
        ConfigurableApplicationContext context = SpringApplication.run(TemplateengineeApplication.class, args);
        context.addApplicationListener(new MyListener1());
    }

}
