package cn.tangue.templateenginee.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
//注解方式或者采用配置bean方式，后者更灵活设置优先级什么的
//@WebFilter(filterName = "customFilter", urlPatterns = {"/*"})
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化");
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前----doFilter方法之前过滤请求");
        //对request、response进行一些预处理
        //比如设置请求编码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //放行链路 直接传给下一个过滤器
        chain.doFilter(request, response);
        log.info("customFilter 请求处理之后----doFilter方法之后处理响应");
    }

    @Override
    public void destroy() {
        log.info("filter 销毁");
    }
}
