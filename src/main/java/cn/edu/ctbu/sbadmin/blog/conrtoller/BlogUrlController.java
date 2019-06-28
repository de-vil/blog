package cn.edu.ctbu.sbadmin.blog.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogUrlController {

    @RequestMapping({"/","/blog/index"})
    public String Index(){
        return "/blog/index";
    }

    @RequestMapping("/blog/detail1")
    public String Detail1(){
        return "/blog/detail1";
    }

    @RequestMapping("/blog/detail2")
    public String Detail2(){
        return "/blog/detail2";
    }


    @RequestMapping("/blog/detail3")
    public String Detail3(){
        return "/blog/detail3";
    }



}
