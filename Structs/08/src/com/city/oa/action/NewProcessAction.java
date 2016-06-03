package com.city.oa.action;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.oa.business.INewsBuesiness;
import com.city.oa.value.NewsValue;

@Controller("newProcessAction")
@Scope("prototype")
public class NewProcessAction {
	
	private INewsBuesiness nb = null;
	private NewsValue nv = null;
	
	private File photo = null;
	private String photoFileName = null;
	private String photoContentType = null;
	
	public NewsValue getNv() {
		return nv;
	}
	
	public void setNv(NewsValue nv) {
		this.nv = nv;
	}
	
	@Autowired
	public void setNb(INewsBuesiness nb) {
		this.nb = nb;
	}
	
	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String add() throws Exception {
		if(photoFileName == null || photoFileName.equals("")) {
			nb.add(nv);
		} else {
			nb.add(nv, photo, photoFileName, photoContentType);
		}
		return "tomain";
	}
}
