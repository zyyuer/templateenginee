package cn.tangue.templateenginee.controller;

import cn.tangue.templateenginee.config.DBLoadSysConfig;
import cn.tangue.templateenginee.config.event.MyEvent;
import cn.tangue.templateenginee.model.ArticleVO;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//spring boot里面的纯servlet
@WebServlet(name = "firstServlet", urlPatterns = "/firstServlet")
public class SpringBootServlet extends HttpServlet {
    @Resource
    private ApplicationContext applicationContext;
    @Resource
    private DBLoadSysConfig dbLoadSysConfig;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //发布自定义事件测试
        applicationContext.publishEvent(new MyEvent("事件测试"));
        //去runner程序初始化的数据信息
        ArticleVO articleVO = dbLoadSysConfig.getArticleVO();
        System.out.println(articleVO);

        resp.getWriter().append("a servlet use spring boot");
    }
}
