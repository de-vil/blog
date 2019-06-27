package cn.edu.ctbu.sbadmin.blog.webapi;

import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.blog.service.impl.BlogServiceImpl;
import cn.edu.ctbu.sbadmin.common.controller.BaseController;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;
import cn.edu.ctbu.sbadmin.common.utils.MQueryHelper;
import cn.edu.ctbu.sbadmin.common.utils.PageUtils;
import cn.edu.ctbu.sbadmin.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("webapi/blog/blog")
@Slf4j
public class BlogRestController extends BaseController {
    @Autowired
    BlogServiceImpl blogServiceImpl;

    @RequestMapping("/getByPage")
    @RequiresPermissions("blog:blog:list")
    public PageUtils list(@RequestParam("where") String where,
                          @RequestParam("pageSize") Integer pageSize,
                          @RequestParam("pageIndex") Integer pageIndex,
                          @RequestParam("sort") String sort,
                          @RequestParam("direct") String direct
    ) throws Exception {
        MQuery mQuery = MQueryHelper.GenQuery(where,pageSize,pageIndex,sort,direct);

        List<BlogDO> blogDOList = blogServiceImpl.listView(mQuery);

        int total = blogServiceImpl.countView(mQuery);

        PageUtils pageUtils = new PageUtils(blogDOList, total);

        return pageUtils;
    }

    @RequestMapping("/get")
    @RequiresPermissions("blog:blog:list")
    public R get(Long id) throws Exception{
        MQuery mQuery = MQueryHelper.GenQuery("blog_content.id="+id+"^:=",10,0,"","");
        List<BlogDO> blogDOList=blogServiceImpl.listView(mQuery);
        if (blogDOList.size()>0) {
            return R.ok("data", blogDOList.get(0));
        }
        return R.error(-1, "出错，找不到数据！");
    }

    /**
     * 保存数据
     *
     * @param blogDO
     * @return
     */
    @RequestMapping("/save")
    @RequiresPermissions("blog:blog:add")
    public R save(BlogDO blogDO) {

        if (blogServiceImpl.save(blogDO) > 0) {
            return R.ok("data", blogDO);
        }
        return R.error();
    }

    /**
     * 更新数据
     *
     * @param blogDO
     * @return
     */
    @RequestMapping("/update")
    @RequiresPermissions("blog:blog:edit")
    public R update(BlogDO blogDO) {

        if (blogServiceImpl.update(blogDO) > 0) {
            return R.ok("data", blogDO);
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    @RequiresPermissions("blog:blog:remove")
    public R batchDelete(@RequestParam("ids[]") Long[] ids) {
        List<BlogDO> blogDOS = blogServiceImpl.findByIds(ids);
        if (blogDOS.size() > 0) {
            for (BlogDO blogDO : blogDOS) {
                blogServiceImpl.delete(blogDO.getId());
            }
        }
        return R.ok();
    }
}
