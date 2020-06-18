package cn.bynow.tempest.web.modular.system.service.impl;

import cn.bynow.tempest.web.modular.system.service.UserService;
import cn.bynow.tempest.web.modular.system.mapper.UserMapper;
import cn.bynow.tempest.web.modular.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;






@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getInfo(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<User> getData(User entity){
		return userMapper.selectByParams(entity);
	}

	
	@Override
	public void saveUser(User entity){
			userMapper.insertSelective(entity);
	}
	
	@Override
	public void updateUser(User entity){
		userMapper.updateByPrimaryKeySelective(entity);
	}

	
}
