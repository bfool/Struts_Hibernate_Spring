package com.city.oa.action;

public class HomeMainAction 
{
	private String id=null;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String tomain() throws Exception
	{
		
		System.out.println(id);
		
		return "tomain";
	}

}
