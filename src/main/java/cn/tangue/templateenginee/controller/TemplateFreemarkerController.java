package cn.tangue.templateenginee.controller;

import cn.tangue.templateenginee.exception.CustomException;
import cn.tangue.templateenginee.exception.CustomExceptionType;
import cn.tangue.templateenginee.exception.ModelView;
import cn.tangue.templateenginee.model.ArticleVO;
import cn.tangue.templateenginee.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/template")
public class TemplateFreemarkerController {
    @Resource
    private ArticleService articleService;

    @GetMapping("/freemarker")
    @ModelView
    public String index(Model model) {
        //制造异常测试
        if (1 == 1) {
            throw new CustomException(CustomExceptionType.SYSTEM_ERROR);
        }
        List<ArticleVO> articlesVO = articleService.getAll();
        model.addAttribute("articles", articlesVO);
        return "freemarkertemp"; //到配置文件中找到后缀以及所在路径的模板
    }
    //https://localhost:8888/template/freemarker
}
