package cn.tangue.templateenginee.config;

import cn.tangue.templateenginee.model.ArticleVO;
import cn.tangue.templateenginee.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DBLoadSysConfig implements CommandLineRunner {
    @Resource
    private ArticleService articleService;
    private ArticleVO articleVO;

    @Override
    public void run(String... args) throws Exception {
        ArticleVO article = articleService.getArticle(17);
        articleVO = article;
    }

    public ArticleVO getArticleVO() {
        return articleVO;
    }
}
