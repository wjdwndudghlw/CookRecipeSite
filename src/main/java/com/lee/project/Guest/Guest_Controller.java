package com.lee.project.Guest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.User.User;

@Controller
public class Guest_Controller {

	@Autowired
	private GuestDAO gDAO;

	public GuestDAO getgDAO() {
		return gDAO;
	}

	// 화살표 방향에 따른 각 첫번쨰 페이지
	@RequestMapping(value = "/getGuest_Recipe_1Page", method = RequestMethod.GET)
	public String getDiet_Recipe_1Page(HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_1Page(req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getGuest_Recipe_6Page", method = RequestMethod.GET)
	public String getDiet_Recipe_6Page(HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_6Page(req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getGuest_Recipe_11Page", method = RequestMethod.GET)
	public String getDiet_Recipe_11Page(HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_11Page(req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 각 페이지에서 번호 에 따른 페이지
	@RequestMapping(value = "/Guest_Recipe", method = RequestMethod.GET)
	public String Diet_Recipe1(HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_popular(req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Guest_Recipe6", method = RequestMethod.GET)
	public String Diet_Recipe6(HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_popular(req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Guest_Recipe11", method = RequestMethod.GET)
	public String Diet_Recipe11(HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_popular(req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Guest_Recipe_Detail", method = RequestMethod.GET)
	public String Guest_Recipe_Detail(User u,Guest g, HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_Detail(u,g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_Detail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Guest_Recipe_level1", method = RequestMethod.GET)
	public String Guest_Recipe_level1(Guest g, HttpServletRequest req) {
		try {

			gDAO.getGuest_Recipe_level1(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getGuest_Recipe_level1_1Page", method = RequestMethod.GET)
	public String getGuest_Recipe_level1_1Page(Guest g, HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_level1_1Page(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getGuest_Recipe_level1_6Page", method = RequestMethod.GET)
	public String getGuest_Recipe_level1_6Page(Guest g, HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_level1_6Page(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Guest_Recipe_level2", method = RequestMethod.GET)
	public String Guest_Recipe_level2(Guest g, HttpServletRequest req) {
		try {
			String pageNO = req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:" + pageNO1);
			gDAO.getGuest_Recipe_level2(g, req);
			if (pageNO1 <= 5) {
				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(2).jsp");

			} else if (pageNO1 > 5) {

				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(2)_(6-10).jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getGuest_Recipe_level2_1Page", method = RequestMethod.GET)
	public String getGuest_Recipe_level2_1Page(Guest g, HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_level2_1Page(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(2).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getGuest_Recipe_level2_6Page", method = RequestMethod.GET)
	public String getGuest_Recipe_level2_6Page(Guest g, HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_level2_6Page(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(2)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	// 레벨 3에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Guest_Recipe_level3", method = RequestMethod.GET)
	public String Guest_Recipe_level3(Guest g, HttpServletRequest req) {
		try {
			gDAO.getGuest_Recipe_level3(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(3).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	
	// 제목 검색했을떄  번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Guest_Recipe_Search_name", method = RequestMethod.GET)
	public String Guest_Recipe_Search_name(Guest g, HttpServletRequest req) {
		try {
			String m_name = req.getParameter("m_name");
			req.setAttribute("m_name",m_name);
			gDAO.getGuest_Recipe_Search_name(g, req);
			req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_Search_name.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
}
