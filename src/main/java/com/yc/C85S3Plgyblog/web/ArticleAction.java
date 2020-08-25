package com.yc.C85S3Plgyblog.web;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.yc.C85S3Plgyblog.bean.Article;
import com.yc.C85S3Plgyblog.bean.User;
import com.yc.C85S3Plgyblog.biz.ArticleBiz;
import com.yc.C85S3Plgyblog.dao.ArticleMapper;
import com.yc.C85S3Plgyblog.util.Utils;

@RestController
public class ArticleAction {

	@Resource
	private ArticleBiz abiz;
	
	@Resource
	private ArticleMapper amapper;


	/*@GetMapping("toAddArticle")
	public String toAddArticle() {
		return "addArticle";
	}*/

	@GetMapping("article")
	public ModelAndView article(int id, ModelAndView mav) {
		mav.addObject("article", amapper.selectById(id));
		mav.setViewName("article");
		return mav;
	}
	
	
	@GetMapping("toAddArticle")
	public ModelAndView toAddArticle(ModelAndView mav) {
		mav.setViewName("addArticle");
		return mav;
	}

	@PostMapping("addArticle.do")
	public ModelAndView addArticle(@Valid Article a, Errors errors, ModelAndView mav,
			@SessionAttribute("loginedUser") User user) {
		// ModelAndView = Model + View
		if (errors.hasErrors()) {
			mav.addObject("errors", Utils.asMap(errors));
			mav.addObject("article", a);
			mav.setViewName("addArticle");
		} else {
			a.setAuthor(user.getName());
			abiz.create(a);
			// a.id ==> 有值 ==> 数据库的自增列 ==> MyBatis ==> @Options
			mav.setViewName("redirect:article?id=" + a.getId());
		}
		return mav;
	}

}
