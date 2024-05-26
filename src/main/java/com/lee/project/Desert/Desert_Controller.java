package com.lee.project.Desert;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.Guest.Guest;
import com.lee.project.User.User;
import com.lee.project.Desert.Desert;

@Controller
public class Desert_Controller {

	
	@Autowired
	private DesertDAO deDAO;

    
	



	public DesertDAO getdeDAO() {
		return deDAO;
	}

	public void setdeDAO(DesertDAO deDAO) {
		this.deDAO = deDAO;
	}

	
	// 화살표 방향에 따른 각 첫번쨰 페이지
	@RequestMapping(value = "/getDesert_Recipe_1Page", method = RequestMethod.GET)
	public String getDesert_Recipe_1Page(HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_1Page(req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getDesert_Recipe_6Page", method = RequestMethod.GET)
	public String getDesert_Recipe_6Page(HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_6Page(req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	@RequestMapping(value = "/getDesert_Recipe_11Page", method = RequestMethod.GET)
	public String getDesert_Recipe_11Page(HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_11Page(req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
    //각 페이지에서 번호 에 따른 페이지
	@RequestMapping(value = "/Desert_Recipe", method = RequestMethod.GET)
	public String Desert_Recipe1(HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_popular(req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Desert_Recipe6", method = RequestMethod.GET)
	public String Desert_Recipe6(HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_popular(req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Desert_Recipe11", method = RequestMethod.GET)
	public String Desert_Recipe11(HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_popular(req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Desert_Recipe_Detail", method = RequestMethod.GET)
	public String Desert_Recipe_Detail(User u,Desert d,HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_Detail(u,d, req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_Detail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// 레벨 1에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Desert_Recipe_level1", method = RequestMethod.GET)
	public String Desert_Recipe_level1(Desert d, HttpServletRequest req) {
		try {
			String pageNO =req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:"+pageNO1);
			deDAO.getDesert_Recipe_level1(d, req);
			if (pageNO1 <=5) {	
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(1).jsp");
			}
			else if (pageNO1 > 5) {
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(1)_(6-10).jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getDesert_Recipe_level1_1Page", method = RequestMethod.GET)
	public String getDesert_Recipe_level1_1Page(Desert d, HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_level1_1Page(d, req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getDesert_Recipe_level1_6Page", method = RequestMethod.GET)
	public String getDesert_Recipe_level1_6Page(Desert d, HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_level1_6Page(d, req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Desert_Recipe_level2", method = RequestMethod.GET)
	public String Desert_Recipe_level2(Desert d, HttpServletRequest req) {
		try {
			String pageNO =req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:"+pageNO1);
			deDAO.getDesert_Recipe_level2(d, req);
			if (pageNO1 <=5) {
				
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(2).jsp");
			}
			else if (pageNO1 >5) {
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(2)_(6-10).jsp");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getDesert_Recipe_level2_1Page", method = RequestMethod.GET)
	public String getDesert_Recipe_level2_1Page(Desert d, HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_level2_1Page(d, req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(2).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getDesert_Recipe_level2_6Page", method = RequestMethod.GET)
	public String getDesert_Recipe_level2_6Page(Desert d, HttpServletRequest req) {
		try {
			deDAO.getDesert_Recipe_level2_6Page(d, req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(2)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	
	
//	// 레벨 3에서 번호 클릭시 보여줄 페이지
//	@RequestMapping(value = "/Desert_Recipe_level3", method = RequestMethod.GET)
//	public String Desert_Recipe_level3(Desert d, HttpServletRequest req) {
//		try {
//			deDAO.getDesert_Recipe_level3(d, req);
//			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(3).jsp");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "home";
//	}
	
	
	// 제목 검색했을떄  번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Desert_Recipe_Search_name", method = RequestMethod.GET)
	public String Desert_Recipe_Search_name(Desert d, HttpServletRequest req) {
		try {
			String m_name = req.getParameter("m_name");
			req.setAttribute("m_name",m_name);
			deDAO.getDesert_Recipe_Search_name(d, req);
			req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_Search_name.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
}
