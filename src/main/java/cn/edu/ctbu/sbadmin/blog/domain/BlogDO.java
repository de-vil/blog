package cn.edu.ctbu.sbadmin.blog.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "blog_content")
public class BlogDO{

    /**
     * 主键 自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Long id;

    private String title;
    //
    private String slug;
    //创建人id
    private Long created;
    //最近修改人id
    private Long modified;
    //内容
    private String content;
    //类型
    private String type;
    //标签
    private String tags;
    //分类
    private String categories;
    //
    private Integer hits;
    //评论数量
    private Integer commentsNum;
    //开启评论
    private Integer allowComment;
    //允许ping
    private Integer allowPing;
    //允许反馈
    private Integer allowFeed;
    //状态
    private Integer status;
    //作者
    private String author;
    //创建时间
    @Column(name = "gtm_create")
    private Date gtmCreate;
    //修改时间
    @Column(name = "gtm_modified")
    private Date gtmModified;
}
