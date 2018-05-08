package com.jk.dao;

import java.util.List;
import java.util.Map;

import com.jk.model.Tree;
import com.jk.model.User;

public interface TreeMapper {
  

	List<Tree> selectTreeList(Tree t) throws Exception;

	/** <pre>selectTreeById(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午1:52:06    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午1:52:06    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	Tree selectTreeById(String id);

	/** <pre>addTree(新增)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午1:59:25    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午1:59:25    
	 * 修改备注： 
	 * @param tree
	 * @return</pre>    
	 */
	int addTree(Tree tree);

	/** <pre>deleteTreeById(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午2:19:53    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午2:19:53    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	int deleteTreeById(String id);

	/** <pre>queryRoleTree(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午3:51:09    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午3:51:09    
	 * 修改备注： 
	 * @param roleId
	 * @return</pre>    
	 */
	List<Tree> queryRoleTree(String roleId);

	/** <pre>deleteroletree(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午4:05:14    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午4:05:14    
	 * 修改备注： 
	 * @param roleId
	 * @return</pre>    
	 */
	int deleteroletree(String roleId);

	/** <pre>addRoleTree(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午4:10:52    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午4:10:52    
	 * 修改备注： 
	 * @param tree
	 * @return</pre>    
	 */
	int addRoleTree(Tree tree);

	/** <pre>getRoleTreeList(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午8:44:39    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午8:44:39    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	List<Map<String, Object>> getRoleTreeList(User user);
}