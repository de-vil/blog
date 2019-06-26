package cn.edu.ctbu.sbadmin.blog.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create @ ctbu
 * Description:
 * User: minttang
 * Date: 2019-05-13
 * Time: 17:12
 */
@Controller
public class BlogController {


//    @RequestMapping({"/","/blog/index"})    //设置blog界面为默认界面
    @RequestMapping({"/blog/index"})

    public String Index(){



        return "/blog/index";
    }

    @RequestMapping("/blog/detail")
    public String Detail(){



        return "/blog/detail";
    }


}
