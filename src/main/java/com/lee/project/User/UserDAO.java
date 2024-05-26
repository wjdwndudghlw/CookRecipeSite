package com.lee.project.User;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {

	private static final UserDAO uDAO = new UserDAO();

	
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}

	public static UserDAO getDdao() {
		return uDAO;
	}
	
	
	
	/** 메일 HOST **/
	private static final String HOST = "smtp.naver.com";
	/** 메일 PORT **/
	private static final String PORT = "587";
	/** 메일 ID **/
	private static final String MAIL_ID = "wjdwndudghlw@naver.com";
	/** 메일 PW **/
	private static final String MAIL_PW = "vte1749100asd@";
	
	
	
	
	@Autowired
	private SqlSession ss;
	// sqlsessionTemplate
	// sqlsession의 하위 클래스
	// (public class SqlsessionTemplate implements Sqlsession)의 구조
	// 자동연결 / 자동해제
	// 자동 commit
	
	public int Login_User(User u,HttpServletRequest req) { 
		try {
			List<User> result = ss.getMapper(User_Mapper.class).Login_User(u);
			if (result.size() != 0) {
				System.out.println(result);
				System.out.println("로그인 성공");
				return 1;   
			 }
			else {
				System.out.println("아이디 불일치");
				return -1; 
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 베이스 오류");
			return -2;  
		}
	}
	public int Join_User(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			int result = ss.getMapper(User_Mapper.class).join_User(u);
			if (result == 1) {
				System.out.println("회원가입 성공");
				return 1;   
			 }
			else {
				System.out.println("이미 존재하는 아이디입니다");
				return -1; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int book_Mark(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			System.out.println(req.getAttribute("u_m_name"));
			int result = ss.getMapper(User_Mapper.class).book_Mark(u);
			if (result == 1) {
				System.out.println("즐겨찾기 성공");
				return 1;   
			}
			else {
				System.out.println("즐겨찾기 실패");
				return -1; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void book_Mark_Page(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			List<User> book_Mark = ss.getMapper(User_Mapper.class).book_Mark_Page(u);
			int book_mark_Count = ss.getMapper(User_Mapper.class).book_Mark_Count(u);
			req.setAttribute("book_Marks",book_Mark);
			req.setAttribute("book_mark_Count",book_mark_Count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void book_Mark_Page_number(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {			
			List<User> book_Mark = ss.getMapper(User_Mapper.class).book_Mark_Page_number(u);
			int book_mark_Count = ss.getMapper(User_Mapper.class).book_Mark_Count(u);
			req.setAttribute("book_Marks",book_Mark);
			req.setAttribute("book_mark_Count",book_mark_Count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int delete_book_mark(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
		    int result=   ss.getMapper(User_Mapper.class).delete_book_mark(u);
		    if (result ==1) {
				return 1;
			}
		    else {
		    	return -1;
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	

	public void search_history_Page(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			List<User> search_historys = ss.getMapper(User_Mapper.class).search_history_Page(u);
			int search_history_Count = ss.getMapper(User_Mapper.class).search_history_Count(u);
			req.setAttribute("search_historys",search_historys);
			req.setAttribute("search_history_Count",search_history_Count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void search_history_Page_number(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			List<User> search_historys = ss.getMapper(User_Mapper.class).search_history_Page_number(u);
			int search_history_Count = ss.getMapper(User_Mapper.class).search_history_Count(u);
			req.setAttribute("search_historys",search_historys);
			req.setAttribute("search_history_Count",search_history_Count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int delete_search_history(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			int result=   ss.getMapper(User_Mapper.class).delete_search_history(u);
			if (result ==1) {
				return 1;
			}
			else {
				return -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int delete_all_search_history(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			int result=   ss.getMapper(User_Mapper.class).delete_all_search_history(u);
			if (result ==1) {
				return 1;
			}
			else {
				return -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	//아이디 찾기
	public String Find_ID(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			String ID = (ss.getMapper(User_Mapper.class).Find_ID(u));
			//System.out.println(ID);
			return ID;
		} catch (Exception e) {
			e.printStackTrace();
			return "실패";
		}
	}
	
	//비밀번호 찾기
	public String Find_Password(User u,HttpServletRequest req,HttpServletResponse res) { 
		try {
			String password = ss.getMapper(User_Mapper.class).Find_Password(u);
             return password;
		} catch (Exception e) {
			e.printStackTrace();
			 return "실패";
		}
	}
	
	
	public static void sendNotiMail(String subejct, String body) {
		try {
			System.out.println("성공");
			InternetAddress[] receiverList = new InternetAddress[2];
			receiverList[0] = new InternetAddress(MAIL_ID);
			receiverList[1] = new InternetAddress(MAIL_ID);
			
			// SMTP 발송 Properties 설정
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.host", UserDAO.HOST);
			props.put("mail.smtp.port", UserDAO.PORT);
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.ssl.trust", UserDAO.HOST);
			props.put("mail.smtp.auth", "true");
			
			// SMTP Session 생성
			Session mailSession = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication(UserDAO.MAIL_ID, UserDAO.MAIL_PW);
				}
			});
			
			// Mail 조립
			Message mimeMessage = new MimeMessage(mailSession);
			mimeMessage.setFrom(new InternetAddress(UserDAO.MAIL_ID));
			mimeMessage.setRecipients(Message.RecipientType.TO, receiverList);
            		// 메일 제목
			mimeMessage.setSubject(subejct);
            		// 메일 본문 (.setText를 사용하면 단순 텍스트 전달 가능)
			mimeMessage.setContent(body, "text/html; charset=UTF-8");
			
			// Mail 발송
			Transport.send(mimeMessage);
			
		} catch(Exception e) {
			Logger.getLogger(UserDAO.class).error("메일 발송 오류!!");
		}
	}
	
	
	
	public String  Login_Manager(User u,HttpServletRequest req) {
		try {
			return ss.getMapper(User_Mapper.class).Login_Manager(u);	
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
