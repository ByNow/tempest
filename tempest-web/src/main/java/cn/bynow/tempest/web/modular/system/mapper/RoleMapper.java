package cn.bynow.tempest.web.modular.system.mapper;

import cn.bynow.tempest.web.modular.system.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 角色表
 * 
 * @author bynow
 * @date 2020-06-19 02:04:19
 */
@Mapper
public interface RoleMapper{

    //查询实例
    Role selectByPrimaryKey(Integer id);

    //根据参数查询列表
    List<Role> selectByParams(Role entity);

    void insertSelective(Role entity);

    void updateByPrimaryKeySelective(Role entity);

    void deleteByPrimaryKey(Integer id);
	
}
