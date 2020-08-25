package com.yc.C85S3Plgyblog.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C85S3Plgyblog.bean.Article;
import com.yc.C85S3Plgyblog.dao.ArticleMapper;

@Service
public class ArticleBiz {

	@Resource
	private ArticleMapper aMapper;

	public int create(Article art) {
		return aMapper.insert(art);
	}

}
