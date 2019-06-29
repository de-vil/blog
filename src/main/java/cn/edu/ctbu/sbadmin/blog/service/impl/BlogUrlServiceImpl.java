package cn.edu.ctbu.sbadmin.blog.service.impl;


import cn.edu.ctbu.sbadmin.blog.dao.BlogUrlDAO;
import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.blog.service.BlogService;
import cn.edu.ctbu.sbadmin.blog.service.BlogUrlService;
import cn.edu.ctbu.sbadmin.common.core.AbstractService;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlogUrlServiceImpl implements BlogUrlService {

    @Autowired
    BlogUrlDAO blogUrlDAO;



    public List<BlogDO> findAll(){


        List<BlogDO> blogDOList= blogUrlDAO.findAll();
        return blogDOList;

    }
}
