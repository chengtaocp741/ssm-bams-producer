package com.jk.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.UserMapper;
import com.jk.model.Role;
import com.jk.model.User;
import com.jk.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userDao;

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#queryUser(java.lang.Integer, java.lang.Integer)    
	 */
	public List<User> queryUser(Integer page, Integer rows,User user) {
	Map<String,Object> map =new HashMap<String,Object>();
		page = (page-1)*rows;
		map.put("page", page);
		map.put("rows", rows);
		map.put("user", user);
		 List<User> list =	userDao.queryUser(map);
		return list;
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#queryCount()    
	 */
	public long queryCount(User user) {
		return userDao.queryCount(user);

	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#queryUser(java.lang.String)    
	 */
	public void deleteUser(String id) {
		
		userDao.deleteUser(id);
		
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#addUser(com.jk.model.User)    
	 */
	public void addUser(User user) {
		int i = userDao.addUser(user);
		System.out.println("新增了用户"+i);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#queryUserById(java.lang.String)    
	 */
	public User queryUserById(String id) {
		return userDao.queryUserById(id);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#updateUser(com.jk.model.User)    
	 */
	public int updateUser(User user) {
		
		return userDao.updateUser(user);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#getgetResourcesRoleList(com.jk.model.User)    
	 */
	public User getResourcesRoleList(User user) {

		//定义新的集合接收数据库查询到数据
		Set<Role> roles =new HashSet<Role>();
		
		//查询数据库返回数据
		List<Map<String,Object>> listMap =userDao.getResourcesRoleList(user);
		
		//把查询结果循环,利用set集合特性去重
		for (Map<String, Object> map : listMap) {
			Role r =new Role();
			r.setName(map.get("name").toString());
			r.setId(map.get("roleId").toString());
			roles.add(r);
		}
		user.setRoles(roles);
		return user;
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.UserService#login(com.jk.model.User)    
	 */
	public User login(User user) {
		
		
		return userDao.login(user);
	}


	
	
	
	
}
