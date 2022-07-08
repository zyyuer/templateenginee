package cn.tangue.templateenginee.service;

import cn.tangue.templateenginee.model.ArticleVO;

import java.util.List;

public interface ArticleService {
    void saveArticle(ArticleVO article);

    void deleteArticle(Integer id);

    void updateArticle(ArticleVO article);

    ArticleVO getArticle(Integer id);

    List<ArticleVO> getAll();
}
