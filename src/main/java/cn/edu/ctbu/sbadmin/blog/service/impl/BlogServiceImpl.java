package cn.edu.ctbu.sbadmin.blog.service.impl;


import cn.edu.ctbu.sbadmin.blog.dao.BlogDAO;
import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.blog.service.BlogService;
import cn.edu.ctbu.sbadmin.common.core.AbstractService;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlogServiceImpl extends AbstractService<BlogDO> implements BlogService {

    @Autowired
    BlogDAO blogDAO;

    /**
     * 通用查询，返回视图
     *
     * @param mQuery
     * @return
     */
    public List<BlogDO> listView(MQuery mQuery) {
        return blogDAO.listView(mQuery);
    }

    /**
     * 通用查询，返回数量
     *
     * @param mQuery
     * @return
     */
    public int countView(MQuery mQuery) {
        return blogDAO.countView(mQuery);
    }



    public List<BlogDO> findAll(){


        List<BlogDO> blogDOList= blogDAO.findAll();
        return blogDOList;

    }
}
