package cn.edu.ctbu.sbadmin.blog.conrtoller;


import cn.edu.ctbu.sbadmin.blog.domain.ContentDO;
import cn.edu.ctbu.sbadmin.blog.service.ContentService;
import cn.edu.ctbu.sbadmin.common.utils.DateUtils;
import cn.edu.ctbu.sbadmin.common.utils.PageUtils;
import cn.edu.ctbu.sbadmin.common.utils.Query;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create @ ctbu
 * Description:
 * User: minttang
 * Date: 2019-05-13
 * Time: 17:12
 */
@RequestMapping({"/","/blog"})
@Controller
public class BlogController {

    @Autowired
    ContentService bContentService;

    @GetMapping()
    String blog() {
        return "blog/index/index";
    }

    @ResponseBody
    @GetMapping("/open/list")
    public PageUtils opentList(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<ContentDO> bContentList = bContentService.list(query);
        int total = bContentService.count(query);
        PageUtils pageUtils = new PageUtils(bContentList, total);
        return pageUtils;
    }
    @GetMapping("/open/post/{cid}")
    String post(@PathVariable("cid") Long cid, Model model) {
        ContentDO bContentDO = bContentService.get(cid);
        model.addAttribute("bContent", bContentDO);
        model.addAttribute("gtmModified", DateUtils.format(bContentDO.getGtmModified()));
        return "blog/index/post";
    }

    @GetMapping("/open/page/{categories}")
    String about(@PathVariable("categories") String categories, Model model) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("categories", categories);
        ContentDO bContentDO =null;
        if(bContentService.list(map).size()>0){
            bContentDO = bContentService.list(map).get(0);
        }
        model.addAttribute("bContent", bContentDO);
        return "blog/index/post";
    }

//    @RequestMapping({"/","/blog/index"})    //设置blog界面为默认界面
//    @RequestMapping({"/blog/index"})
//    public String Index(){
//
//
//
//        return "/blog/index";
//    }
//
//    @RequestMapping("/blog/bContent/detail")
//    public String Detail(){
//
//
//
//        return "/blog/bContent/detail";
//    }


}
