package cn.bynow.tempest.web.modular.system.mapper;

import cn.bynow.tempest.web.modular.system.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 部门表
 * 
 * @author bynow
 * @date 2020-06-19 02:06:50
 */
@Mapper
public interface DeptMapper{

    //查询实例
    Dept selectByPrimaryKey(Integer id);

    //根据参数查询列表
    List<Dept> selectByParams(Dept entity);

    void insertSelective(Dept entity);

    void updateByPrimaryKeySelective(Dept entity);

    void deleteByPrimaryKey(Integer id);
	
}
