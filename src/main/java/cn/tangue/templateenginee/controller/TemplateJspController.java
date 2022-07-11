package cn.tangue.templateenginee.controller;

import cn.tangue.templateenginee.model.ArticleVO;
import cn.tangue.templateenginee.service.ArticleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

//https://localhost:8888/template/jsp
@Controller
@RequestMapping("/template")

public class TemplateJspController {
    @Resource
    private ArticleService articleService;
    @Value("${server.servlet.context-path}")
    private String contextPath;

    @GetMapping("/jsp")
    public String index(String name, Model model) {
        List<ArticleVO> articleVOS = articleService.getAll();
        model.addAttribute("contextPath", contextPath);
        model.addAttribute("articles", articleVOS);
        return "jsptemp";
    }
}
