package com.jk.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.dao.TreeMapper;
import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.service.TreeService;


@Service("treeService")
public class TreeServiceImpl implements TreeService {

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#selectTreeList(com.jk.model.Tree)    
	 */
	@Resource
	private TreeMapper treeDao;
	
	public List<Tree> selectTreeList(Tree t) throws Exception {
		List<Tree> list =treeDao.selectTreeList(t);
		
		
		
		return list;
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#selectTreeById(java.lang.String)    
	 */
	public Tree selectTreeById(String id) {
		return treeDao.selectTreeById(id) ;
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#addTree(com.jk.model.Tree)    
	 */
	public int addTree(Tree tree) {
	
		return treeDao.addTree(tree);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#deleteTreeById(java.lang.String)    
	 */
	public int deleteTreeById(String id) {
		return treeDao.deleteTreeById(id);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#queryRoleTree(java.lang.String)    
	 */
	public List<Tree> queryRoleTree(String roleId) {
		return treeDao.queryRoleTree(roleId);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#deleteroletree(java.lang.String)    
	 */
	public int deleteroletree(String roleId) {
		return treeDao.deleteroletree(roleId);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#addRoleTree(com.jk.model.Tree)    
	 */
	public int addRoleTree(Tree tree) {
		return treeDao.addRoleTree(tree);
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#getRoleTreeList(com.jk.model.User)    
	 */
	public Set<Map<String, Object>> getRoleTreeList(User user) {
		//定义list集合接受查询的参数
				List<Map<String,Object>> list =new ArrayList<Map<String,Object>>();
				
				list = treeDao.getRoleTreeList(user);
				
				 Set<Map<String,Object>> obj =new HashSet<Map<String,Object>>();
				 
				 for (Map<String, Object> map : list) {
					obj.add(map);
				}
				return obj;
	}

}
