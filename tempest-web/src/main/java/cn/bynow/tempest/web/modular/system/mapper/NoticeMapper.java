package cn.bynow.tempest.web.modular.system.mapper;

import cn.bynow.tempest.web.modular.system.model.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 通知表
 * 
 * @author bynow
 * @date 2020-06-19 02:06:18
 */
@Mapper
public interface NoticeMapper{

    //查询实例
    Notice selectByPrimaryKey(Integer id);

    //根据参数查询列表
    List<Notice> selectByParams(Notice entity);

    void insertSelective(Notice entity);

    void updateByPrimaryKeySelective(Notice entity);

    void deleteByPrimaryKey(Integer id);
	
}
