package com.city.oa.action;

import java.io.InputStream;
import java.sql.Blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.oa.business.INewsBuesiness;
import com.city.oa.value.NewsValue;

@Controller("newsPhotoShowAction")
@Scope("prototype")
public class NewsPhotoShowAction {

	private INewsBuesiness nb = null;
	private NewsValue nv = null;
	private int id = 0;
	private String fileName = null;
	private String contentType = null;

	@Autowired
	public void setNb(INewsBuesiness nb) {
		this.nb = nb;
	}

	public NewsValue getNv() {
		return nv;
	}

	public void setNv(NewsValue nv) {
		this.nv = nv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public InputStream getInputStream() throws Exception {

		nv = nb.getNews(id);
		Blob photo = nv.getPhoto();
		fileName = nv.getPhotoFileName();
		contentType = nv.getPhotoContentType();

		return photo.getBinaryStream();

	}

	public String show() throws Exception {
		return "show";
	}
}
