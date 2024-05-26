package com.lee.project.Speed;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.Guest.Guest;
import com.lee.project.Speed.Speed;
import com.lee.project.User.User;

@Controller
public class Speed_Controller {

	
	@Autowired
	private SpeedDAO deDAO;

    
	



	public SpeedDAO getdeDAO() {
		return deDAO;
	}

	public void setdeDAO(SpeedDAO deDAO) {
		this.deDAO = deDAO;
	}

	
	// 화살표 방향에 따른 각 첫번쨰 페이지
	@RequestMapping(value = "/getSpeed_Recipe_1Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_1Page(HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_1Page(req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getSpeed_Recipe_6Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_6Page(HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_6Page(req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	@RequestMapping(value = "/getSpeed_Recipe_11Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_11Page(HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_11Page(req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
    //각 페이지에서 번호 에 따른 페이지
	@RequestMapping(value = "/Speed_Recipe", method = RequestMethod.GET)
	public String Speed_Recipe1(HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_popular(req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Speed_Recipe6", method = RequestMethod.GET)
	public String Speed_Recipe6(HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_popular(req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Speed_Recipe11", method = RequestMethod.GET)
	public String Speed_Recipe11(HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_popular(req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Speed_Recipe_Detail", method = RequestMethod.GET)
	public String Speed_Recipe_Detail(User u,Speed s,HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_Detail(u,s, req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_Detail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// 레벨 1에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Speed_Recipe_level1", method = RequestMethod.GET)
	public String Speed_Recipe_level1(Speed s, HttpServletRequest req) {
		try {
			String pageNO =req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:"+pageNO1);
			deDAO.getSpeed_Recipe_level1(s, req);
			if (pageNO1 <=5) {	
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(1).jsp");
			}
			else if (pageNO1 > 5) {
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(1)_(6-10).jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getSpeed_Recipe_level1_1Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_level1_1Page(Speed s, HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_level1_1Page(s, req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getSpeed_Recipe_level1_6Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_level1_6Page(Speed s, HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_level1_6Page(s, req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Speed_Recipe_level2", method = RequestMethod.GET)
	public String Speed_Recipe_level2(Speed s, HttpServletRequest req) {
		try {
			String pageNO =req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:"+pageNO1);
			deDAO.getSpeed_Recipe_level2(s, req);
			if (pageNO1 <=5) {
				
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(2).jsp");
			}
			else if (pageNO1 >5) {
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(2)_(6-10).jsp");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getSpeed_Recipe_level2_1Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_level2_1Page(Speed s, HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_level2_1Page(s, req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(2).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getSpeed_Recipe_level2_6Page", method = RequestMethod.GET)
	public String getSpeed_Recipe_level2_6Page(Speed s, HttpServletRequest req) {
		try {
			deDAO.getSpeed_Recipe_level2_6Page(s, req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(2)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	
	
//	// 레벨 3에서 번호 클릭시 보여줄 페이지
//	@RequestMapping(value = "/Speed_Recipe_level3", method = RequestMethod.GET)
//	public String Speed_Recipe_level3(Speed s, HttpServletRequest req) {
//		try {
//			deDAO.getSpeed_Recipe_level3(s, req);
//			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(3).jsp");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "home";
//	}
	
	
	// 제목 검색했을떄  번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Speed_Recipe_Search_name", method = RequestMethod.GET)
	public String Speed_Recipe_Search_name(Speed s, HttpServletRequest req) {
		try {
			String m_name = req.getParameter("m_name");
			req.setAttribute("m_name",m_name);
			deDAO.getSpeed_Recipe_Search_name(s, req);
			req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_Search_name.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
}
