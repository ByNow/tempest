package cn.bynow.tempest.web.modular.system.service.impl;

import cn.bynow.tempest.web.modular.system.service.MenuService;
import cn.bynow.tempest.web.modular.system.mapper.MenuMapper;
import cn.bynow.tempest.web.modular.system.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author bynow
 * @date 2020-06-18 20:05:28
 */

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Menu getInfo(Long id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Menu> getData(Menu entity) {
        return menuMapper.selectByParams(entity);
    }


    @Override
    public void saveMenu(Menu entity) {
        menuMapper.insertSelective(entity);
    }

    @Override
    public void updateMenu(Menu entity) {
        menuMapper.updateByPrimaryKeySelective(entity);
    }


}
