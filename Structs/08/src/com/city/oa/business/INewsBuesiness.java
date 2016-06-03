package com.city.oa.business;


import java.io.File;

import com.city.oa.value.NewsValue;

public interface INewsBuesiness {
	public void add(NewsValue nv) throws Exception;
	
	public void add(NewsValue nv, File photo, String fileName, String contentType) throws Exception;
	
	public NewsValue getNews(int no) throws Exception;
}
