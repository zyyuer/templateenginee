package cn.tangue.templateenginee.service;

import cn.tangue.templateenginee.mapper.ArticleMapper;
import cn.tangue.templateenginee.model.Article;
import cn.tangue.templateenginee.model.ArticleVO;
import cn.tangue.templateenginee.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private Mapper dozerMapper;

    @Override
    public void saveArticle(ArticleVO article) {
        Article articlePo = dozerMapper.map(article, Article.class);
        articleMapper.insert(articlePo);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleMapper.delete(id);
    }

    @Override
    public void updateArticle(ArticleVO article) {
        Article articlePo = dozerMapper.map(article, Article.class);
        articleMapper.update(articlePo);
    }

    @Override
    public ArticleVO getArticle(Integer id) {
        Article articlePo = articleMapper.selectById(id);
        ArticleVO articleVO = dozerMapper.map(articlePo, ArticleVO.class);
        return articleVO;
    }

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articlesPo = articleMapper.selectAll();
        List<ArticleVO> articleVOS = DozerUtils.mapList(articlesPo, ArticleVO.class);
        return articleVOS;
    }
}
