package cn.tangue.templateenginee.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//自定义tomcat配置类 高手
//@Configuration
public class TomcatCustomizer2 {/*
    @Bean
    public ConfigurableServletWebServerFactory configurableServletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(new MyTomcatConnectionCustomizer());
        return factory;
    }


    static class MyTomcatConnectionCustomizer implements TomcatConnectorCustomizer {

        public MyTomcatConnectionCustomizer() {
        }

        @Override
        public void customize(Connector connector) {
            connector.setPort(Integer.parseInt("8888"));
            connector.setProperty("maxConnections", "8192");
            connector.setProperty("acceptorThreadCount", "100");
            connector.setProperty("minSpareThreads", "10");
            connector.setProperty("maxThreads", "200");
        }
    }*/
}
