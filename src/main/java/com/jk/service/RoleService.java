/** 
 * <pre>项目名称:ssm-bams 
 * 文件名称:RoleService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年3月8日下午5:15:27 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import com.jk.model.Role;

/** 
 * <pre>项目名称：ssm-bams    
 * 类名称：RoleService    
 * 类描述：    
 * 创建人：程涛 792043917@qq.com
 * 创建时间：2018年3月8日 下午5:15:27    
 * 修改人：程涛 792043917@qq.com   
 * 修改时间：2018年3月8日 下午5:15:27    
 * 修改备注：       
 * @version </pre>    
 */
public interface RoleService {

	/** <pre>roles(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午7:05:45    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午7:05:45    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Role> roles()throws Exception;

	/** <pre>deleteRole(修改之先删除)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午7:47:11    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午7:47:11    
	 * 修改备注： 
	 * @param userId</pre>    
	 * @return 
	 */
	int deleteRole(Integer userId)throws Exception;

	/** <pre>addRole(增加权限)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午7:50:09    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午7:50:09    
	 * 修改备注： 
	 * @param role
	 * @return</pre>    
	 */
	int addRole(Role role);

	/** <pre>queryCount(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 上午11:42:07    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 上午11:42:07    
	 * 修改备注： 
	 * @return</pre>    
	 */
	long queryCount()throws Exception;

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 上午11:46:58    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 上午11:46:58    
	 * 修改备注： 
	 * @param page
	 * @param rows
	 * @return</pre>    
	 */
	List<Role> queryRole(Integer page, Integer rows)throws Exception;

}
