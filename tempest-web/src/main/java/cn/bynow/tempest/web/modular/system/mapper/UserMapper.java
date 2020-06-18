package cn.bynow.tempest.web.modular.system.mapper;

import cn.bynow.tempest.web.modular.system.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 管理员表
 * 
 * @author bynow
 * @date 2020-06-18 20:05:28
 */
@Mapper
public interface UserMapper{

    //查询实例
    User selectByPrimaryKey(Integer id);

    //根据参数查询列表
    List<User> selectByParams(User entity);

    void insertSelective(User entity);

    void updateByPrimaryKeySelective(User entity);

    void deleteByPrimaryKey(Integer id);
	
}
