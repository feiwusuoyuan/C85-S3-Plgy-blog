package com.yc.C85S3Plgyblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {
	@GetMapping("/")
       public String index() {
    	   return "index";
       }
}
