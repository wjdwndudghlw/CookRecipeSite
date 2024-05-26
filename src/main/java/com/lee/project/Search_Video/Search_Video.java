package com.lee.project.Search_Video;

public class Search_Video {

	private String pageType;
	
	private String m_name;
	private String m_url;
	private String m_iframe;
	private int m_view;
	


	public Search_Video(String m_name, String m_url, String m_iframe, int m_view) {
		super();
		this.m_name = m_name;
		this.m_url = m_url;
		this.m_iframe = m_iframe;
		this.m_view = m_view;
	}

	public Search_Video() {
		// TODO Auto-generated constructor stub
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_url() {
		return m_url;
	}

	public void setM_url(String m_url) {
		this.m_url = m_url;
	}

	public String getM_iframe() {
		return m_iframe;
	}

	public void setM_iframe(String m_iframe) {
		this.m_iframe = m_iframe;
	}

	public int getM_view() {
		return m_view;
	}

	public void setM_view(int m_view) {
		this.m_view = m_view;
	}
	

	
	
}
