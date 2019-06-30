package cn.edu.ctbu.sbadmin.blog.webapi;


import cn.edu.ctbu.sbadmin.blog.dao.BlogDAO;
import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;

import cn.edu.ctbu.sbadmin.blog.service.impl.BlogUrlServiceImpl;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;
import cn.edu.ctbu.sbadmin.common.utils.MQueryHelper;
import cn.edu.ctbu.sbadmin.common.utils.PageUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webapi/blogs")
@Slf4j
public class BlogUrlRestController {

    @Autowired
    private BlogUrlServiceImpl blogUrlServiceImpl;

    @GetMapping("/menu")
    public List<BlogDO> getAll(){
        List<BlogDO> blogList = blogUrlServiceImpl.findAll();
        return blogList;
    }
/*    public PageUtils list(@RequestParam("where") String where,
                          @RequestParam("pageSize") Integer pageSize,
                          @RequestParam("pageIndex") Integer pageIndex,
                          @RequestParam("sort") String sort,
                          @RequestParam("direct") String direct
    ) throws Exception {
        MQuery mQuery = MQueryHelper.GenQuery(where,pageSize,pageIndex,sort,direct);

        List<BlogDO> blogDOList = blogUrlServiceImpl.listView(mQuery);

        int total = blogUrlServiceImpl.countView(mQuery);

        PageUtils pageUtils = new PageUtils(blogDOList, total);

        return pageUtils;
    }*/

}
