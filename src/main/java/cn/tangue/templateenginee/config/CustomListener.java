package cn.tangue.templateenginee.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Slf4j
@WebListener
public class CustomListener implements ServletContextListener,
        ServletRequestListener,
        HttpSessionListener,
        ServletRequestAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //比如在应用启动时候把数据加载到内存中
        log.info("==============context创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //比如在应用结束时候清理一些无效数据如磁盘数据等
        log.info("==============context销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("----------------attributeAdded");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("----------------attributeRemoved");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("----------------attributeReplaced");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info(" ++++++++++++++++++request监听器：销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info(" ++++++++++++++++++request监听器：创建");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("----------------session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("----------------session销毁");
    }
}
