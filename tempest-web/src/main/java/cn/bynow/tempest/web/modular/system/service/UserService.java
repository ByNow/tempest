package cn.bynow.tempest.web.modular.system.service;

import cn.bynow.tempest.web.modular.system.model.User;
import java.util.List;

/**
 * 管理员表
 *
 * @author bynow
 * @date 2020-06-18 20:05:28
 */
public interface UserService {

    //获取列表数据
    List<User> getData(User entity);

    //获取实例数据
	User getInfo(Integer id);

    //新增
    void saveUser(User entity);

    //修改
    void updateUser(User entity);


}
