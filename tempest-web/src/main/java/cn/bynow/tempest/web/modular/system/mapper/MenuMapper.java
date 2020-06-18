package cn.bynow.tempest.web.modular.system.mapper;

import cn.bynow.tempest.web.modular.system.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 菜单表
 * 
 * @author bynow
 * @date 2020-06-19 01:10:51
 */
@Mapper
public interface MenuMapper{

    //查询实例
    Menu selectByPrimaryKey(Long id);

    //根据参数查询列表
    List<Menu> selectByParams(Menu entity);

    void insertSelective(Menu entity);

    void updateByPrimaryKeySelective(Menu entity);

    void deleteByPrimaryKey(Long id);
	
}
