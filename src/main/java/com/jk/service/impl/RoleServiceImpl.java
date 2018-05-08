/** 
 * <pre>项目名称:ssm-bams 
 * 文件名称:RoleServiceImpl.java 
 * 包名:com.jk.service.impl 
 * 创建日期:2018年3月8日下午5:15:55 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.dao.RoleMapper;
import com.jk.model.Role;
import com.jk.model.User;
import com.jk.service.RoleService;

/** 
 * <pre>项目名称：ssm-bams    
 * 类名称：RoleServiceImpl    
 * 类描述：    
 * 创建人：程涛 792043917@qq.com
 * 创建时间：2018年3月8日 下午5:15:55    
 * 修改人：程涛 792043917@qq.com   
 * 修改时间：2018年3月8日 下午5:15:55    
 * 修改备注：       
 * @version </pre>    
 */

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	
	@Resource
	private RoleMapper roleDao;

	/* (non-Javadoc)    
	 * @see com.jk.service.RoleService#roles()    
	 */
	public List<Role> roles() throws Exception {
		return roleDao.roles();
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.RoleService#deleteRole(java.lang.Integer)    
	 */
	public int deleteRole(Integer userId) throws Exception {
		
		return roleDao.deleteRole(userId);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.RoleService#addRole(java.lang.String)    
	 */
	public int addRole(Role role) {
		return roleDao.addRole(role);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.RoleService#queryCount()    
	 */
	public long queryCount() {
		
		return  roleDao.queryCount();
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.RoleService#queryUser(java.lang.Integer, java.lang.Integer)    
	 */
	public List<Role> queryRole(Integer page, Integer rows) throws Exception {
		Map<String,Object> map =new HashMap<String,Object>();
		page = (page-1)*rows;
		map.put("page", page);
		map.put("rows", rows);
		 List<Role> list =	roleDao.queryRole(map);
		return list;
	}
}
