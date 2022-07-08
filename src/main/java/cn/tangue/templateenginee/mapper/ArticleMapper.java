package cn.tangue.templateenginee.mapper;

import cn.tangue.templateenginee.model.Article;

import java.util.List;

public interface ArticleMapper {
    void insert(Article article);

    void delete(Integer id);

    void update(Article article);

    Article selectById(Integer id);

    List<Article> selectAll();
}
