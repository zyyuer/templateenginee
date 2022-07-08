package cn.tangue.templateenginee.controller;

import cn.tangue.templateenginee.model.Article;
import cn.tangue.templateenginee.model.ArticleVO;
import cn.tangue.templateenginee.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/template")
public class TemplateThymeleafController {
    @Resource
    private ArticleService articleService;

    @GetMapping("/thymeleaf")
    //@RequestParam来自url中的？name1=yuer
    //http://localhost:8888/template/thymeleaf?name1=yeuer
    public String index(@RequestParam String name1,
                        HttpServletRequest request,
                        Model model) {
        List<ArticleVO> articleVOS = articleService.getAll();
        model.addAttribute("articles", articleVOS);

        request.setAttribute("name2", "curry");
        request.getSession().setAttribute("name3", "james");
        request.getServletContext().setAttribute("name4", "jordan");

        //模版名称，实际的目录为：resources/templates/thymeleaftemp.html
        return "thymeleaftemp";
    }
}
