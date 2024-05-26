package com.lee.project.Night;

public class Night {

	
	private String m_name;
	private String m_img_url;
	private int m_view;
	private String m_url;
	private String m_level;

	private String i_url;
	private String i_time;
	private String i_servings;
	private String i_level;

	private String i_url1;
	private String i_ingredient;
	private String i_ingredient_dose;

	private int s_no;
	private String s_url;
	private String s_seq;
	private String s_img;
	
	private String pageNO;
	

	public String getPageNO() {
		return pageNO;
	}

	public void setPageNO(String pageNO) {
		this.pageNO = pageNO;
	}

	public Night() {
		// TODO Auto-generated constructor stub
	}

	public Night(String m_name, String m_img_url, int m_view, String m_url,String m_level) {
		super();
		this.m_name = m_name;
		this.m_img_url = m_img_url;
		this.m_view = m_view;
		this.m_url = m_url;
		this.m_level = m_level;
	}

	public Night(String i_url, String i_time, String i_servings, String i_level) {
		super();
		this.i_url = i_url;
		this.i_time = i_time;
		this.i_servings = i_servings;
		this.i_level = i_level;
	}

	public Night(String i_url1, String i_ingredient, String i_ingredient_dose) {
		super();
		this.i_url1 = i_url1;
		this.i_ingredient = i_ingredient;
		this.i_ingredient_dose = i_ingredient_dose;
	}

	public Night(int s_no, String s_url, String s_seq, String s_img) {
		super();
		this.s_no = s_no;
		this.s_url = s_url;
		this.s_seq = s_seq;
		this.s_img = s_img;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_img_url() {
		return m_img_url;
	}

	public String getM_level() {
		return m_level;
	}

	public void setM_level(String m_level) {
		this.m_level = m_level;
	}

	public void setM_img_url(String m_img_url) {
		this.m_img_url = m_img_url;
	}

	public int getM_view() {
		return m_view;
	}

	public void setM_view(int m_view) {
		this.m_view = m_view;
	}

	public String getM_url() {
		return m_url;
	}

	public void setM_url(String m_url) {
		this.m_url = m_url;
	}

	public String getI_url() {
		return i_url;
	}

	public void setI_url(String i_url) {
		this.i_url = i_url;
	}

	public String getI_time() {
		return i_time;
	}

	public void setI_time(String i_time) {
		this.i_time = i_time;
	}

	public String getI_servings() {
		return i_servings;
	}

	public void setI_servings(String i_servings) {
		this.i_servings = i_servings;
	}

	public String getI_level() {
		return i_level;
	}

	public void setI_level(String i_level) {
		this.i_level = i_level;
	}

	public String getI_url1() {
		return i_url1;
	}

	public void setI_url1(String i_url1) {
		this.i_url1 = i_url1;
	}

	public String getI_ingredient() {
		return i_ingredient;
	}

	public void setI_ingredient(String i_ingredient) {
		this.i_ingredient = i_ingredient;
	}

	public String getI_ingredient_dose() {
		return i_ingredient_dose;
	}

	public void setI_ingredient_dose(String i_ingredient_dose) {
		this.i_ingredient_dose = i_ingredient_dose;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getS_url() {
		return s_url;
	}

	public void setS_url(String s_url) {
		this.s_url = s_url;
	}

	public String getS_seq() {
		return s_seq;
	}

	public void setS_seq(String s_seq) {
		this.s_seq = s_seq;
	}

	public String getS_img() {
		return s_img;
	}

	public void setS_img(String s_img) {
		this.s_img = s_img;
	}

}
