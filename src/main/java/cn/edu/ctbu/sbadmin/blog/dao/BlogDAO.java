package cn.edu.ctbu.sbadmin.blog.dao;

import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.common.core.MyMapper;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogDAO extends MyMapper<BlogDO> {
    /**
     * 查询视图
     * @param mQuery
     * @return
     */
    public List<BlogDO> listView(MQuery mQuery);

    /**
     * 查询计数
     * @param mQuery
     * @return
     */
    public int countView(MQuery mQuery);


    public List<BlogDO> findAll();
}
