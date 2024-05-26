package com.lee.project.Diet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.User.User;

@Controller
public class Diet_Controller {

	@Autowired
	private DietDAO dDAO;




	
	// 화살표 방향에 따른 각 첫번쨰 페이지
	@RequestMapping(value = "/getDiet_Recipe_1Page", method = RequestMethod.GET)
	public String getDiet_Recipe_1Page(HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_1Page(req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getDiet_Recipe_6Page", method = RequestMethod.GET)
	public String getDiet_Recipe_6Page(HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_6Page(req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	@RequestMapping(value = "/getDiet_Recipe_11Page", method = RequestMethod.GET)
	public String getDiet_Recipe_11Page(HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_11Page(req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
    //각 페이지에서 번호 에 따른 페이지
	@RequestMapping(value = "/Diet_Recipe", method = RequestMethod.GET)
	public String Diet_Recipe1(HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_popular(req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/Diet_Recipe6", method = RequestMethod.GET)
	public String Diet_Recipe6(HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_popular(req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping(value = "/Diet_Recipe11", method = RequestMethod.GET)
	public String Diet_Recipe11(HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_popular(req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	
	
	
	@RequestMapping(value = "/Diet_Recipe_Detail", method = RequestMethod.GET)
	public String Diet_Recipe_Detail(User u,Diet d,HttpServletRequest req) {
		try {
            dDAO.getDiet_Recipe_Detail(u,d,req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_Detail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	

	
	//레벨 1에 번호별 페이지 (1-5)
	@RequestMapping(value = "/Diet_Recipe_level1", method = RequestMethod.GET)
	public String Diet_Recipe_level1(Diet d,HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_level1(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	//레벨 1에 번호별 페이지 (6-10)
	@RequestMapping(value = "/Diet_Recipe_level1_6", method = RequestMethod.GET)
	public String Diet_Recipe_level1_6(Diet d,HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_level1(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	//레벨 1에서 << 화살표 방향 클릭시
	@RequestMapping(value = "/getDiet_Recipe_level1_1Page", method = RequestMethod.GET)
	public String getDiet_Recipe_level1_1Page(Diet d,HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_level1_1Page(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(1).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	//레벨 1에서 >>  화살표 방향 클릭시
	@RequestMapping(value = "/getDiet_Recipe_level1_6Page", method = RequestMethod.GET)
	public String getDiet_Recipe_level1_6Page(Diet d,HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_level1_6Page(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	//레벨 2에 번호별 페이지 (1-5)
	@RequestMapping(value = "/Diet_Recipe_level2", method = RequestMethod.GET)
	public String Diet_Recipe_level2(Diet d,HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_level2(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(2).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	//레벨 2에서 << 화살표 방향 클릭시
	@RequestMapping(value = "/getDiet_Recipe_level2_1Page", method = RequestMethod.GET)
	public String getDiet_Recipe_level2_1Page(Diet d,HttpServletRequest req) {
		try {
			dDAO.getDiet_Recipe_level2_1Page(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(2).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	// 제목 검색하고 번호별  페이지
	@RequestMapping(value = "/Diet_Recipe_Search_name", method = RequestMethod.GET)
	public String Diet_Recipe_Search_name(Diet d,HttpServletRequest req) {
		try {
			String m_name = req.getParameter("m_name");
			req.setAttribute("m_name",m_name);
			dDAO.getDiet_Recipe_Search_name(d, req);
			req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_Search_name.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	
	
	

	
	
}
