package cn.edu.ctbu.sbadmin.blog.dao;


import java.util.List;
import java.util.Map;
import cn.edu.ctbu.sbadmin.blog.domain.ContentDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContentDAO {

    ContentDO get(Long cid);

    List<ContentDO> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(ContentDO content);

    int update(ContentDO content);

    int remove(Long cid);

    int batchRemove(Long[] cids);
}
