package com.jk.service;

import java.util.List;

import com.jk.model.User;

public interface UserService {

	
	List<User> queryUser(Integer page, Integer rows, User user);

	long queryCount(User user);

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月7日 下午4:40:15    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月7日 下午4:40:15    
	 * 修改备注： 
	 * @param string</pre>    
	 */
	void deleteUser(String string);

	/** <pre>addUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月7日 下午5:24:15    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月7日 下午5:24:15    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void addUser(User user);

	/** <pre>queryUserById(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午4:10:14    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午4:10:14    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	User queryUserById(String id);

	/** <pre>updateUser(修改)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午4:24:06    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午4:24:06    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	int updateUser(User user);

	/** <pre>getgetResourcesRoleList()   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午6:47:42    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午6:47:42    
	 * 修改备注： 
	 * @param u
	 * @return</pre>    
	 */
	User getResourcesRoleList(User u)throws Exception;

	/** <pre>login(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午6:59:46    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午6:59:46    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	User login(User user);
}
