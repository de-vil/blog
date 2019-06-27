package cn.edu.ctbu.sbadmin.blog.conrtoller;

import cn.edu.ctbu.sbadmin.common.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController extends BaseController {

    @RequestMapping("/blog/blog/list")
    @RequiresPermissions("blog:blog:list")
    public String list(){
        return "blog/blog/list";
    }

    @RequestMapping("/blog/blog/edit")
    @RequiresPermissions("blog:blog:edit")
    public String edit(){
        return "blog/blog/edit";
    }

}
