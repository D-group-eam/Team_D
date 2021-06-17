package com.seol.webpageHaleMaven.dao;

import com.seol.webpageHaleMaven.entity.Role;

public interface RoleDao {
	
	public Role findRoleByName(String theRoleName);
	

}
