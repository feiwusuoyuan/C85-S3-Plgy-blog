package com.yc.C85S3Plgyblog.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C85S3Plgyblog.bean.Comment;
import com.yc.C85S3Plgyblog.dao.CommentMapper;

@Service
public class CommentBiz {

	@Resource
	private CommentMapper cMapper;
	public Comment create(Comment comm) {
		cMapper.insert(comm);
		return comm;
	}

}
