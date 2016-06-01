package com.city.oa.value;

import java.util.Set;

public class CategoryValue {
	private int gno = 0;
	private String gname = null;
	private Set<InfoValue> infos = null;
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Set<InfoValue> getInfos() {
		return infos;
	}
	public void setInfos(Set<InfoValue> infos) {
		this.infos = infos;
	}
	

}
