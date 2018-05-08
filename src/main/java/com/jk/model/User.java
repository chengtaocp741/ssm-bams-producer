package com.jk.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4947930214632202178L;

	private Integer id;

    private String name;

    private Integer age;
    
    private String loginname;
    
    private String pwd;
    
    
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date briday;

    private String userday;
    
    private Set<String> resources  = new HashSet<String>();
    
    private Set<Role> roles=new HashSet<Role>();
    
    
    
    public Set<String> getResources() {
		return resources;
	}

	public void setResources(Set<String> resources) {
		this.resources = resources;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getUserday() {
		return userday;
	}

	public void setUserday(String userday) {
		this.userday = userday;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBriday() {
        return briday;
    }

    public void setBriday(Date briday) {
        this.briday = briday;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", loginname=" + loginname + ", pwd=" + pwd
				+ ", briday=" + briday + ", userday=" + userday + ", resources=" + resources + ", roles=" + roles + "]";
	}



	
    
}