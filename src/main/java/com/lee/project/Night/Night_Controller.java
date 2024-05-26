package com.lee.project.Night;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.Guest.Guest;
import com.lee.project.Night.Night;
import com.lee.project.User.User;

@Controller
public class Night_Controller {

	
	@Autowired
	private NightDAO nDAO;

    
	
	public NightDAO getnDAO() {
		return nDAO;
	}



	// 화살표 방향에 따른 각 첫번쨰 페이지
	@RequestMapping(value = "/getNight_Recipe_1Page", method = RequestMethod.GET)
	public String getNight_Recipe_1Page(HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_1Page(req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getNight_Recipe_6Page", method = RequestMethod.GET)
	public String getNight_Recipe_6Page(HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_6Page(req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	@RequestMapping(value = "/getNight_Recipe_11Page", method = RequestMethod.GET)
	public String getNight_Recipe_11Page(HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_11Page(req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
    //각 페이지에서 번호 에 따른 페이지
	@RequestMapping(value = "/Night_Recipe", method = RequestMethod.GET)
	public String Night_Recipe1(HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_popular(req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Night_Recipe6", method = RequestMethod.GET)
	public String Night_Recipe6(HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_popular(req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Night_Recipe11", method = RequestMethod.GET)
	public String Night_Recipe11(HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_popular(req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Night_Recipe_Detail", method = RequestMethod.GET)
	public String Night_Recipe_Detail(User u,Night n,HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_Detail(u,n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_Detail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// 레벨 1에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Night_Recipe_level1", method = RequestMethod.GET)
	public String Night_Recipe_level1(Night n, HttpServletRequest req) {
		try {
			String pageNO =req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:"+pageNO1);
			nDAO.getNight_Recipe_level1(n, req);
			if (pageNO1 <=5) {	
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(1).jsp");
			}
			else if (pageNO1 > 5) {
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(1)_(6-10).jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getNight_Recipe_level1_1Page", method = RequestMethod.GET)
	public String getNight_Recipe_level1_1Page(Night n, HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_level1_1Page(n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 1에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getNight_Recipe_level1_6Page", method = RequestMethod.GET)
	public String getNight_Recipe_level1_6Page(Night n, HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_level1_6Page(n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Night_Recipe_level2", method = RequestMethod.GET)
	public String Night_Recipe_level2(Night n, HttpServletRequest req) {
		try {
			String pageNO =req.getParameter("pageNO");
			Integer pageNO1 = Integer.valueOf(pageNO);
			System.out.println("pageNO1:"+pageNO1);
			nDAO.getNight_Recipe_level2(n, req);
			if (pageNO1 <=5) {
				
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(2).jsp");
			}
			else if (pageNO1 >5) {
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(2)_(6-10).jsp");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 << 눌렀을시 첫번째 페이찌
	@RequestMapping(value = "/getNight_Recipe_level2_1Page", method = RequestMethod.GET)
	public String getNight_Recipe_level2_1Page(Night n, HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_level2_1Page(n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(2).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 2에서 >> 눌렀을시 6번째 페이찌
	@RequestMapping(value = "/getNight_Recipe_level2_6Page", method = RequestMethod.GET)
	public String getNight_Recipe_level2_6Page(Night n, HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_level2_6Page(n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(2)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 레벨 3에서 번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Night_Recipe_level3", method = RequestMethod.GET)
	public String Night_Recipe_level3(Night n, HttpServletRequest req) {
		try {
			nDAO.getNight_Recipe_level3(n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(3).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	// 제목 검색했을떄  번호 클릭시 보여줄 페이지
	@RequestMapping(value = "/Night_Recipe-Search_name", method = RequestMethod.GET)
	public String Night_Recipe_Search_name(Night n, HttpServletRequest req) {
		try {
			String m_name = req.getParameter("m_name");
			req.setAttribute("m_name",m_name);
			nDAO.getNight_Recipe_Search_name(n, req);
			req.setAttribute("cp", "Night_Recipe/Night_Recipe_Search_name.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
}
