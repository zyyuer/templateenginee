package cn.tangue.templateenginee.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CustomFilter());
        registration.setName("customFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(10);
        return registration;
    }
}
