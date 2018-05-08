/** 
 * <pre>椤圭洰鍚嶇О:ssm-bams 
 * 鏂囦欢鍚嶇О:TreeService.java 
 * 鍖呭悕:com.jk.service 
 * 鍒涘缓鏃ユ湡:2018骞�鏈�鏃ヤ笅鍗�:39:04 
 * Copyright (c) 2018,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jk.model.Tree;
import com.jk.model.User;

public interface TreeService {

	List<Tree> selectTreeList(Tree t) throws Exception;

	/** <pre>selectTreeById(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午1:51:28    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午1:51:28    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	Tree selectTreeById(String id);

	/** <pre>addTree(新增)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午1:58:52    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午1:58:52    
	 * 修改备注： 
	 * @param tree
	 * @return</pre>    
	 */
	int addTree(Tree tree);

	/** <pre>deleteTreeById(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月8日 下午2:19:32    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月8日 下午2:19:32    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	int deleteTreeById(String id);

	/** <pre>queryRoleTree(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午3:49:34    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午3:49:34    
	 * 修改备注： 
	 * @param roleId
	 * @return</pre>    
	 */
	List<Tree> queryRoleTree(String roleId);

	/** <pre>deleteroletree(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午4:04:46    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午4:04:46    
	 * 修改备注： 
	 * @param roleId
	 * @return</pre>    
	 */
	int deleteroletree(String roleId);

	/** <pre>addRoleTree(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午4:10:23    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午4:10:23    
	 * 修改备注： 
	 * @param tree
	 * @return</pre>    
	 */
	int addRoleTree(Tree tree);

	/** <pre>getRoleTreeList(这里用一句话描述这个方法的作用)   
	 * 创建人：程涛 792043917@qq.com
	 * 创建时间：2018年3月9日 下午8:43:46    
	 * 修改人：程涛 792043917@qq.com
	 * 修改时间：2018年3月9日 下午8:43:46    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	Set<Map<String, Object>> getRoleTreeList(User user);

}
