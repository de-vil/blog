package cn.edu.ctbu.sbadmin.blog.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "blog_content")
public class BlogDO implements Serializable {

    /**
     * 主键 自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Long id;

    private String title;

    //最近修改人id
    private Long modified;
    //内容
    private String content;

    //标签
    private String tags;
    //分类
    private String categories;
    //
    private Integer hits;
    //评论数量

    //作者
    private String author;
    //创建时间

    private Date gtmCreate;
    //修改时间

    private Date gtmModified;
}
