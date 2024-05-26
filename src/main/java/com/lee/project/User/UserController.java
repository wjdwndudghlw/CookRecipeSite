package com.lee.project.User;

import java.io.PrintWriter;
import java.util.List;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.HomeController;
import com.lee.project.HomeDAO;
import com.lee.project.Search_Video.Search_Video;



@Controller
public class UserController {

	@Autowired
	private UserDAO uDAO;

	public UserController() {
	}

	public UserDAO getuDAO() {
		return uDAO;
	}

	public void setuDAO(UserDAO uDAO) {
		this.uDAO = uDAO;
	}
	
	HomeController hcon;

	@RequestMapping(value = "/Login_User", method = RequestMethod.POST)
	public void Login_User(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("로그인");
			HttpSession session = req.getSession();
			String userID = null;
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			if (session.getAttribute("userID") != null) {
				userID = (String) session.getAttribute("userID");
			}
			if (userID != null) {
				System.out.println(userID);
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('이미 로그인이 되어있습니다')");
				script.println("location.href='http://localhost/project/Main'");
				script.println("</script>");
				script.flush();
			}
			
			if (u.getU_name().isEmpty() || u.getU_password().isEmpty()) {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('입력이 안된 사항이 있습니다')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}
			int result = uDAO.Login_User(u, req);
			if (result == 1) {
				session.setAttribute("userID", u.getU_name());
				PrintWriter script = res.getWriter();
				script.println("<script >");
				script.println("location.href='http://localhost/project/Main'");
				script.println("</script>");
				script.flush();
			} else if (result == -1) {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('존재 하지 않는 아이디입니다')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			} else if (result == -2) {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('데이터베이스 오류가 발생했습니다')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/Join_User", method = RequestMethod.POST)
	public void Join_User(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("회원가입");
			HttpSession session = req.getSession();
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			System.out.println(u.getU_name());
			int result = uDAO.Join_User(u, req, res);
			if (result == 1) {
				PrintWriter script = res.getWriter();
				session.setAttribute("userID", u.getU_name());
				script.println("<script>");
				script.println("alert('회원가입 성공')");
				script.println("location.href='http://localhost/project/Main'");
				script.println("</script>");
				script.flush();
			} else {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('이미 존재하는 아이디입니다')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/logoutAction", method = RequestMethod.GET)
	public String logoutAction(HttpServletRequest req) {
		return "Login/logoutAction";
	}

	@RequestMapping(value = "/book_Mark", method = RequestMethod.GET)
	public void book_Mark(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println(u.getU_m_name());
			System.out.println(u.getU_m_img_url());
			System.out.println(u.getU_m_view());
			System.out.println(u.getU_m_url());
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			int result = uDAO.book_Mark(u, req, res);
			if (result == 1) {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('즐쳐찾기 완료')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			} else {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('이미 즐겨찾기 한 레시피입니다')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/book_Mark_Page", method = RequestMethod.GET)
	public String book_Mark_Page(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("u.get:"+u.getU_name());
			System.out.println("req:"+req.getAttribute("u_name"));
			uDAO.book_Mark_Page(u, req, res);
			req.setAttribute("cp", "Login/book_Mark.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/book_Mark_Page_number", method = RequestMethod.GET)
	public String book_Mark_Page_number(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			uDAO.book_Mark_Page_number(u, req, res);
			req.setAttribute("cp", "Login/book_Mark.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/delete_book_mark", method = RequestMethod.GET)
	public void delete_book_mark(User u, HttpServletRequest req, HttpServletResponse res) {
		try {

			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			int result=uDAO.delete_book_mark(u, req, res);
			if (result ==1) {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('즐겨찾기 삭제완료')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}
			else {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('즐겨찾기 삭제실패')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	@RequestMapping(value = "/search_history_Page", method = RequestMethod.GET)
	public String search_history_Page(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			uDAO.search_history_Page(u, req, res);
			req.setAttribute("cp", "Login/Search_history.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	@RequestMapping(value = "/search_history_Page_number", method = RequestMethod.GET)
	public String search_history_number(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			uDAO.search_history_Page_number(u, req, res);
			req.setAttribute("cp", "Login/Search_history.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	@RequestMapping(value = "/delete_search_history", method = RequestMethod.GET)
	public void delete_search_history(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			int result=uDAO.delete_search_history(u, req, res);
			if (result ==1) {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('검색기록 삭제완료')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}
			else {
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('검색기록 삭제실패')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/delete_all_search_history", method = RequestMethod.GET)
	public void delete_all_search_history(User u, HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			uDAO.delete_all_search_history(u, req, res);
	
				PrintWriter script = res.getWriter();
				script.println("<script>");
				script.println("alert('검색기록 전부 삭제완료')");
				script.println("history.back()");
				script.println("</script>");	
				script.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/Find_ID_Password", method = RequestMethod.GET)
	public String Find_ID_Password(User u,HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setAttribute("cp","Login/find_id_password.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	@RequestMapping(value = "/Find_ID", method = RequestMethod.GET)
	public String Find_ID(User u,HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter script = res.getWriter();
			String ID=uDAO.Find_ID(u, req, res);
			System.out.println("controller id:"+ID);
			if (ID != null) {
				String subject="회원 아이디";
				String body=ID;
				script.println("<script>");
				script.println("alert('아이디 전송완료! 이메일을 확인해 주세요')");
				script.println("</script>");
				script.flush();
	            UserDAO.sendNotiMail(subject, body);	
	            req.setAttribute("cp","Login/login_signUp.jsp");
			}
			else {
				script.println("<script>");
				script.println("alert('없는 계정입니다 비밀번호를 다시 입력해주세요')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
				req.setAttribute("cp","Login/find_id_password.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	@RequestMapping(value = "/Find_Password", method = RequestMethod.GET)
	public String Find_Password(User u,HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter script = res.getWriter();
			String password=uDAO.Find_Password(u, req, res);
			if (password != null) {
				String subject="회원 비밀번호";
				String body=password;
				script.println("<script>");
				script.println("alert('비밀번호 전송완료! 이메일을 확인해 주세요')");
				script.println("</script>");
				script.flush();
	            UserDAO.sendNotiMail(subject, body);	
	            req.setAttribute("cp","Login/login_signUp.jsp");
			}
			else {
				script.println("<script>");
				script.println("alert('없는 계정입니다 비밀번호를 다시 입력해주세요')");
				script.println("history.back()");
				script.println("</script>");
				script.flush();
				req.setAttribute("cp","Login/find_id_password.jsp");
			}
			req.setAttribute("cp","Login/find_id_password.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	

	// 관리자 홈페이지
	@RequestMapping(value = "/Manager", method = RequestMethod.GET)
	public String Manager(User u,HttpServletRequest req,HttpServletResponse res) {
		try {
			req.setAttribute("cp", "Manager.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	// 관리자 홈페이지 로그인
	@RequestMapping(value = "/Login_Manager", method = RequestMethod.POST)
	public void Login_Manager(User u,HttpServletRequest req,HttpServletResponse res) {
		try {
			HttpSession session = req.getSession();
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter script = res.getWriter();
			String u_name= uDAO.Login_Manager(u, req);
	        if ( u_name == null) {
	        	req.setAttribute("ManagerID", null);
	        	script.println("<script>");
				script.println("alert('관리자 로그인 실패')");
				script.println("</script>");
				script.flush();
	        }
	        else {
	        	session.setAttribute("ManagerID",u_name);
				script.println("<script>");
				script.println("alert('관리자 로그인 성공')");
				script.println("</script>");
				script.flush();
	        }
	        script.println("<script>");
	        script.println("location.href='http://localhost/project/Main'");
			script.println("</script>");
			script.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	
	
	
}
