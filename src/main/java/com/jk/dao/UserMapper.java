package com.jk.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jk.model.User;

public interface UserMapper {
 
	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月7日 下午1:02:00    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月7日 下午1:02:00    
	 * 修改备注： 
	 * @param page
	 * @param rows
	 * @param user 
	 * @return</pre>    
	 */
	List<User> queryUser(Map<String, Object> map);

	/** <pre>queryCount(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月7日 下午1:02:27    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月7日 下午1:02:27    
	 * 修改备注： 
	 * @param user 
	 * @return</pre>    
	 */
	long queryCount(User user);

	/** <pre>deleteUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月7日 下午4:42:23    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月7日 下午4:42:23    
	 * 修改备注： 
	 * @param id</pre>    
	 */
	void deleteUser(String id);

	/** <pre>addUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月7日 下午5:24:59    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月7日 下午5:24:59    
	 * 修改备注： 
	 * @param user</pre>    
	 * @return 
	 */
	int addUser(User user);

	/** <pre>queryUserById(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午4:10:51    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午4:10:51    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	User queryUserById(String id);

	/** <pre>updateUser(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午4:24:40    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午4:24:40    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	int updateUser(User user);

	/** <pre>getResourcesRoleList(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午6:51:55    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午6:51:55    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	List<Map<String, Object>> getResourcesRoleList(User user);

	/** <pre>login(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午7:05:56    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午7:05:56    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	User login(User user);

	
}