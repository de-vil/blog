package cn.edu.ctbu.sbadmin.blog.service.impl;

import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.common.utils.MQuery;
import cn.edu.ctbu.sbadmin.common.utils.MQueryHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceImplTest {

    @Autowired
    BlogServiceImpl blogServiceImpl;

    @Test
    public void listView()throws Exception {
        MQuery mQuery = MQueryHelper.GenQuery("",10,0,"","");
        List<BlogDO> blogDOList=blogServiceImpl.listView(mQuery);
        System.out.println(blogDOList);
    }
}