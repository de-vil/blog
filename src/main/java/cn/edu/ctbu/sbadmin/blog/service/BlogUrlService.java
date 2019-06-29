package cn.edu.ctbu.sbadmin.blog.service;

import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;

import java.util.List;

public interface BlogUrlService {

    public List<BlogDO> findAll();
}
