package com.city.oa.action;

import com.city.oa.business.IUserBusiness;
import com.city.oa.business.impl.UserBusinessImpl;
import com.city.oa.value.UserValue;

public class UserAddAction {
	private UserValue uv = null;

	public UserValue getUv() {
		return uv;
	}

	public void setUv(UserValue uv) {
		this.uv = uv;
	}

	public String add() throws Exception {
		IUserBusiness ub = new UserBusinessImpl();
		ub.add(uv);
		return "main";

	}
}
