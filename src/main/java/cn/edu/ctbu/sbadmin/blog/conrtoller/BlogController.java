package cn.edu.ctbu.sbadmin.blog.conrtoller;

import cn.edu.ctbu.sbadmin.common.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController extends BaseController {

    @RequestMapping("/blog/backstage/list")
    @RequiresPermissions("blog:backstage:list")
    public String list(){
        return "blog/backstage/list";
    }

    @RequestMapping("/blog/backstage/edit")
    @RequiresPermissions("blog:backstage:edit")
    public String edit(){
        return "blog/backstage/edit";
    }

}
