package cn.edu.ctbu.sbadmin.blog.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogUrlController {

    @RequestMapping({"/","/blog/index"})
    public String Index(){
        return "/blog/index";
    }

    @RequestMapping("/blog/detail")
    public String Detail(){
        return "/blog/detail";
    }
}
