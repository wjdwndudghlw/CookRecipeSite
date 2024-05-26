package com.lee.project.Notice;

public class Comment {
	private int comment_no;
	private int comment_bno;
	private String comment_writer;
	private String comment_content;
	private String comment_wdate;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(int comment_no, int comment_bno, String comment_writer, String comment_content,
			String comment_wdate) {
		super();
		this.comment_no = comment_no;
		this.comment_bno = comment_bno;
		this.comment_writer = comment_writer;
		this.comment_content = comment_content;
		this.comment_wdate = comment_wdate;
	}

	public int getComment_no() {
		return comment_no;
	}

	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}

	public int getComment_bno() {
		return comment_bno;
	}

	public void setComment_bno(int comment_bno) {
		this.comment_bno = comment_bno;
	}

	public String getComment_writer() {
		return comment_writer;
	}

	public void setComment_writer(String comment_writer) {
		this.comment_writer = comment_writer;
	}

	public String getComment_content() {
		return comment_content;
	}

	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

	public String getComment_wdate() {
		return comment_wdate;
	}

	public void setComment_wdate(String comment_wdate) {
		this.comment_wdate = comment_wdate;
	}
	
	
	
	
}
