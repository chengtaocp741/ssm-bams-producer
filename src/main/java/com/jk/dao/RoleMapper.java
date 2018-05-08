package com.jk.dao;

import java.util.List;
import java.util.Map;

import com.jk.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

	/** <pre>roles(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午7:10:36    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午7:10:36    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Role> roles();

	/** <pre>deleteRole(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午7:52:36    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午7:52:36    
	 * 修改备注： 
	 * @param userId
	 * @return</pre>    
	 */
	int deleteRole(Integer userId);

	/** <pre>addRole(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午7:52:41    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午7:52:41    
	 * 修改备注： 
	 * @param role
	 * @return</pre>    
	 */
	int addRole(Role role);

	/** <pre>queryCount(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 上午11:42:53    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 上午11:42:53    
	 * 修改备注： 
	 * @return</pre>    
	 */
	long queryCount();

	/** <pre>queryRole(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 上午11:54:27    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 上午11:54:27    
	 * 修改备注： 
	 * @param map
	 * @return</pre>    
	 */
	List<Role> queryRole(Map<String, Object> map);
}