package cn.tangue.templateenginee.controller;

import cn.tangue.templateenginee.exception.AjaxResponse;
import cn.tangue.templateenginee.model.ArticleVO;
import cn.tangue.templateenginee.service.ArticleService;
import cn.tangue.templateenginee.service.ExceptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/rest")
public class ArticleRestController {
    @Resource
    private ArticleService articleService;
    @Resource
    private ExceptionService exceptionService;

    @GetMapping("/articles/{id}")
    public ArticleVO getArticle(@PathVariable("id") Integer id) {
        //service dao control 转化成自定义异常抛出给全局异常处理器
        //controller调用service ，service中产生异常抛出给 全局异常处理器
        if (id == 1) {
            exceptionService.systemBizError();
        } else {
            exceptionService.userBizError(-1);
        }

        ArticleVO articleVo = articleService.getArticle(id);
        log.info("Article:" + articleVo);
        return articleVo;
    }

    @GetMapping("/articles")
    public List<ArticleVO> getAll() {
        List<ArticleVO> listsVO = articleService.getAll();
        log.info("Article:" + listsVO);
        return listsVO;
    }

    @PostMapping("/articles")
    public AjaxResponse saveArticle(@Valid @RequestBody ArticleVO articleVO) {
        articleService.saveArticle(articleVO);
        log.info("saveArticle:" + articleVO);
        return AjaxResponse.success();
    }

    @PutMapping("/articles")
    public @ResponseBody
    AjaxResponse updateArticle(@RequestBody ArticleVO articleVO) {
        articleService.updateArticle(articleVO);
        log.info("updateArticle:" + articleVO);
        return AjaxResponse.success();
    }

    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Integer id) {
        articleService.deleteArticle(id);
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }

}
