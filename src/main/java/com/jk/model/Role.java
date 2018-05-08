package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable{
    private static final long serialVersionUID = 484056763405323909L;

	private String id;

    private String name;

    private String description;

    private Date createtime;

    private Date updatetime;

    private Integer seq;
    
    
    private Integer userId;
    
    private String roleId;
    
    

    public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + ", seq=" + seq + ", userId=" + userId + ", roleId=" + roleId + "]";
	}
    
    
}