package com.lee.project.User;

public class User{

	private String u_name;
	private String u_password;
	private String u_email;

	private String u_m_name;
	private String u_m_img_url;
	private String u_m_view;
	private String u_m_url;
	
	private String pageNO;
	
	

	

	
	//관리자
	private String m_name;
	private String m_password;
	
	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getPageNO() {
		return pageNO;
	}

	public void setPageNO(String pageNO) {
		this.pageNO = pageNO;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String u_name, String u_password, String u_email) {
		super();
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_email = u_email;
	}

	public User(String u_name, String u_m_name, String u_m_img_url, String u_m_view, String u_m_url) {
		super();
		this.u_name = u_name;
		this.u_m_name = u_m_name;
		this.u_m_img_url = u_m_img_url;
		this.u_m_view = u_m_view;
		this.u_m_url = u_m_url;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_m_name() {
		return u_m_name;
	}

	public void setU_m_name(String u_m_name) {
		this.u_m_name = u_m_name;
	}

	public String getU_m_img_url() {
		return u_m_img_url;
	}

	public void setU_m_img_url(String u_m_img_url) {
		this.u_m_img_url = u_m_img_url;
	}

	public String getU_m_view() {
		return u_m_view;
	}

	public void setU_m_view(String u_m_view) {
		this.u_m_view = u_m_view;
	}

	public String getU_m_url() {
		return u_m_url;
	}

	public void setU_m_url(String u_m_url) {
		this.u_m_url = u_m_url;
	}

}
