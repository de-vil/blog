package cn.edu.ctbu.sbadmin.blog.webapi;

import cn.edu.ctbu.sbadmin.blog.domain.BlogDO;
import cn.edu.ctbu.sbadmin.blog.service.impl.BlogUrlServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogUrlRestControllerTest {

    @Autowired
    BlogUrlServiceImpl blogUrlServiceImpl;

    @Test
    public void getAll() {
        List<BlogDO> blogList = blogUrlServiceImpl.findAll();

        System.out.println(blogList);
    }
}