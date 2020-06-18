package cn.bynow.tempest.web.modular.system.mapper;

import cn.bynow.tempest.web.modular.system.model.Dict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 字典表
 * 
 * @author bynow
 * @date 2020-06-19 02:07:41
 */
@Mapper
public interface DictMapper{

    //查询实例
    Dict selectByPrimaryKey(Integer id);

    //根据参数查询列表
    List<Dict> selectByParams(Dict entity);

    void insertSelective(Dict entity);

    void updateByPrimaryKeySelective(Dict entity);

    void deleteByPrimaryKey(Integer id);
	
}
