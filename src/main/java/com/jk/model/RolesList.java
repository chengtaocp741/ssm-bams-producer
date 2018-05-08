/** 
 * <pre>项目名称:ssm-bams 
 * 文件名称:RolesList.java 
 * 包名:com.jk.model 
 * 创建日期:2018年3月8日下午3:07:11 
 * Copyright (c) 2018,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** 
 * <pre>项目名称：ssm-bams    
 * 类名称：RolesList    
 * 类描述：    
 * 创建人：朱义龙    
 * 创建时间：2018年3月8日 下午3:07:11    
 * 修改人：朱义龙    
 * 修改时间：2018年3月8日 下午3:07:11    
 * 修改备注：       
 * @version </pre>    
 */
public class RolesList implements Serializable {


	private static final long serialVersionUID = 3929676936187120415L;
	private Set<Role> roles =new HashSet<Role>();
	
	
	private List<Role> list=new ArrayList<Role>();


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public List<Role> getList() {
		return list;
	}


	public void setList(List<Role> list) {
		this.list = list;
	}
	
	
	
}
