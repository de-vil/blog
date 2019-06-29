package cn.edu.ctbu.sbadmin.blog.dao;

import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogUrlDAO extends JpaRepository<BlogDO,Long> {

    public List<BlogDO> findAll();
}
