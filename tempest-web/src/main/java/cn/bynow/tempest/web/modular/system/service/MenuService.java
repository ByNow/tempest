package cn.bynow.tempest.web.modular.system.service;

import cn.bynow.tempest.web.modular.system.model.Menu;

import java.util.List;

/**
 * 菜单表
 *
 * @author bynow
 * @date 2020-06-19 01:10:51
 */
public interface MenuService {

    //获取列表数据
    List<Menu> getData(Menu entity);

    //获取实例数据
    Menu getInfo(Long id);

    //新增
    void saveMenu(Menu entity);

    //修改
    void updateMenu(Menu entity);


}
