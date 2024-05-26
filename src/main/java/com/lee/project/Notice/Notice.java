package com.lee.project.Notice;

public class Notice {
	private int notice_no;
	private String userName;
	private String title;
	private String contents;
	private String whenPost;
	private String noticeImgUrl;
	private int notice_view;
	
	
	//관리자 공지
	private int m_no;
	private String m_name;
	private String m_title;
	private String m_contents;
	private String m_date;
	private int m_view;
	
	
	
	
	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_title() {
		return m_title;
	}

	public void setM_title(String m_title) {
		this.m_title = m_title;
	}

	public String getM_contents() {
		return m_contents;
	}

	public void setM_contents(String m_contents) {
		this.m_contents = m_contents;
	}

	public String getM_date() {
		return m_date;
	}

	public void setM_date(String m_date) {
		this.m_date = m_date;
	}

	public int getM_view() {
		return m_view;
	}

	public void setM_view(int m_view) {
		this.m_view = m_view;
	}

	public Notice(int m_no, String m_name, String m_title, String m_contents, String m_date, int m_view) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_title = m_title;
		this.m_contents = m_contents;
		this.m_date = m_date;
		this.m_view = m_view;
	}

	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(int notice_no, String userName, String title, String contents, String whenPost, String noticeImgUrl,int notice_view) {
		super();
		this.notice_no = notice_no;
		this.userName = userName;
		this.title = title;
		this.contents = contents;
		this.whenPost = whenPost;
		this.noticeImgUrl = noticeImgUrl;
		this.notice_view = notice_view;
	}

	public int getNotice_view() {
		return notice_view;
	}

	public void setNotice_view(int notice_view) {
		this.notice_view = notice_view;
	}

	public int getNotice_no() {
		return notice_no;
	}

	public void setNotice_no(int notice_no) {
		this.notice_no = notice_no;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWhenPost() {
		return whenPost;
	}

	public void setWhenPost(String whenPost) {
		this.whenPost = whenPost;
	}

	public String getNoticeImgUrl() {
		return noticeImgUrl;
	}

	public void setNoticeImgUrl(String noticeImgUrl) {
		this.noticeImgUrl = noticeImgUrl;
	}

	
	
	

	
}
