package com.okstudy.shop.domain.article;

import java.util.List;

public interface ArticleDAO {
	void create(ArticleVO articleVO) throws Exception;

    ArticleVO read(Integer articleNo) throws Exception;

    void update(ArticleVO articleVO) throws Exception;

    void delete(Integer articleNo) throws Exception;

    List<ArticleVO> articleList() throws Exception;
}
