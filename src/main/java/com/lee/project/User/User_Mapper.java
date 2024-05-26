package com.lee.project.User;

import java.util.List;

public interface User_Mapper {

	
	public abstract List<User> Login_User(User u);
	public abstract int join_User(User u);
	public abstract int book_Mark(User u);
	
	
	public abstract List<User> book_Mark_Page(User u);
	public abstract List<User> book_Mark_Page_number(User u);
	
	public abstract int book_Mark_Count(User u);
	public abstract int delete_book_mark(User u);
	
	
	
	
	public abstract int search_history(User u);
	public abstract List<User> search_history_Page(User u);
	public abstract List<User> search_history_Page_number(User u);
	public abstract int search_history_Count(User u);
	public abstract int delete_search_history(User u);
	public abstract int delete_all_search_history(User u);
	
	
	
	public abstract String Find_ID(User u);
	public abstract String Find_Password(User u);
	
	
	//관리자
	public abstract String Login_Manager(User u);
	
	
	
}
