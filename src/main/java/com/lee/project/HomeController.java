package com.lee.project;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.Desert.Desert;
import com.lee.project.Desert.DesertDAO;
import com.lee.project.Diet.Diet;
import com.lee.project.Diet.DietDAO;
import com.lee.project.Guest.Guest;
import com.lee.project.Guest.GuestDAO;
import com.lee.project.Night.Night;
import com.lee.project.Night.NightDAO;
import com.lee.project.Search_Video.Search_Video;
import com.lee.project.Season.Season;
import com.lee.project.Season.SeasonDAO;
import com.lee.project.Speed.Speed;
import com.lee.project.Speed.SpeedDAO;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private DietDAO dDAO;
	@Autowired
	private HomeDAO hDAO;
	@Autowired
	private GuestDAO gDAO;
	@Autowired
	private NightDAO nDAO;
	@Autowired
	private DesertDAO deDAO;
	@Autowired
	private SpeedDAO sDAO;
	@Autowired
	private SeasonDAO srDAO;
	

	
	public void getSeason_Recipe(Model model, HttpServletRequest req) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		String season = "";
		if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		List<Season> SeasonRecipes = srDAO.getRecipesBySeason(season);
		model.addAttribute("season", season);
		model.addAttribute("SeasonRecipe", SeasonRecipes);
	}
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req) {
	    getSeason_Recipe(model, req);
	    req.setAttribute("cp", "SeasonRecipe.jsp");
		return "home";
	}
	@RequestMapping(value = "/Main", method = RequestMethod.GET)
	public String Main(Model model,HttpServletRequest req) {
		getSeason_Recipe(model, req);
		req.setAttribute("cp", "SeasonRecipe.jsp");
		return "home";
	}

	
	
	@RequestMapping(value = "Search_Recipe_Video", method = RequestMethod.GET)
	public String Search_Recipe_Video(HttpServletRequest req) {
		req.setAttribute("cp", "Search_Recipe_Video.jsp");
		return "home";
	}

	@RequestMapping(value = "/Recipe_Search", method = RequestMethod.GET)
	public String Recipe_Search(Diet d, Guest g, Night n, Desert de, Speed s, HttpServletRequest req) {
		try {
			// 다이어트 + 레벨에 따라
			String Food_Type = req.getParameter("Food_Type");
			String m_name = req.getParameter("m_name");
			String m_level = req.getParameter("m_level");
			if (Food_Type.equals("Diet") && m_name.isEmpty() && m_level.equals("all")) {
				dDAO.getDiet_Recipe_Search(d, req);
				req.setAttribute("cp", "Diet_Recipe/Diet_Recipe(1-5).jsp");
			} else if (Food_Type.equals("Diet") && m_name.isEmpty() && m_level.equals("아무나")) {
				dDAO.getDiet_Recipe_Search_level(d, req);
				req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(1).jsp");
			} else if (Food_Type.equals("Diet") && m_name.isEmpty() && m_level.equals("초급")) {
				dDAO.getDiet_Recipe_Search_level(d, req);
				req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(2).jsp");
			} else if (Food_Type.equals("Diet") && m_name.isEmpty() && m_level.equals("중급")) {
				dDAO.getDiet_Recipe_Search_level(d, req);
				req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_level/Diet_Recipe_level(3).jsp");
			}

			// 다이어트 + 제목 검색했을경우
			else if (Food_Type.equals("Diet") && !m_name.isEmpty()) {
				req.setAttribute("m_name", m_name);
				System.out.println("다이어트 + 제목 검색했을경우");
				dDAO.getDiet_Recipe_Search_name_first(d, req);
				req.setAttribute("cp", "Diet_Recipe/Diet_Recipe_Search_name.jsp");
			}

			// 전체 중에 foodall 검색했을경우
			else if (Food_Type.equals("All") && m_name.isEmpty() && m_level.equals("all")) {
				System.out.println("all 도달성공");
				hDAO.getall_Recipe_Foodall_1page(req);
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(1-5).jsp");
			} else if (Food_Type.equals("All") && m_name.isEmpty() && m_level.equals("아무나")) {
				System.out.println("아무나 도달성공");
				hDAO.getall_Recipe_Foodall_foodlevel1_1page(req);
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(1-5).jsp");
			} else if (Food_Type.equals("All") && m_name.isEmpty() && m_level.equals("초급")) {
				System.out.println("초급 도달성공");
				hDAO.getall_Recipe_Foodall_foodlevel2_1page(req);
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(1-5).jsp");
			} else if (Food_Type.equals("All") && m_name.isEmpty() && m_level.equals("중급")) {
				System.out.println("중급 도달성공");
				hDAO.getall_Recipe_Foodall_foodlevel3_1page(req);
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(3)_(1-5).jsp");
			}
			
			
			
			
			// 전체 중에 + 제목 검색했을경우
			else if (Food_Type.equals("All") && !m_name.isEmpty()) {
				req.setAttribute("m_name", m_name);
				System.out.println("전체 + 제목 검색했을경우");
				hDAO.getGuest_Recipe_all_Search_name_Count(de, s, n, d, g, req);
				hDAO.getall_Recipe_all_Search_name_1page(de,s,n, d, g,req);
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_Search_name_(1-5).jsp");
			}
			
			
			
			

			// 손님접대용
			else if (Food_Type.equals("Guest") && m_name.isEmpty() && m_level.equals("all")) {
				gDAO.getGuest_Recipe_Search(req);
				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe(1-5).jsp");
			} else if (Food_Type.equals("Guest") && m_name.isEmpty() && m_level.equals("아무나")) {
				gDAO.getGuest_Recipe_Search_level(g, req);
				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(1).jsp");
			} else if (Food_Type.equals("Guest") && m_name.isEmpty() && m_level.equals("초급")) {
				gDAO.getGuest_Recipe_Search_level(g, req);
				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(2).jsp");
			} else if (Food_Type.equals("Guest") && m_name.isEmpty() && m_level.equals("중급")) {
				gDAO.getGuest_Recipe_Search_level(g, req);
				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_level/Guest_Recipe_level(3).jsp");
			}

			// 손님접대 + 제목 검색했을경우
			else if (Food_Type.equals("Guest") && !m_name.isEmpty()) {
				System.out.println("손님접대 + 제목 검색했을경우");
				req.setAttribute("m_name", m_name);
				gDAO.getGuest_Recipe_Search_name_first(g, req);
				req.setAttribute("cp", "Guest_Recipe/Guest_Recipe_Search_name.jsp");
			}

			// 술 안주
			else if (Food_Type.equals("Night") && m_name.isEmpty() && m_level.equals("all")) {
				nDAO.getNight_Recipe_Search(req);
				req.setAttribute("cp", "Night_Recipe/Night_Recipe(1-5).jsp");
				System.out.println(Food_Type);
				System.out.println(m_level);
			} else if (Food_Type.equals("Night") && m_name.isEmpty() && m_level.equals("아무나")) {
				nDAO.getNight_Recipe_Search_level(n, req);
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(1).jsp");
			} else if (Food_Type.equals("Night") && m_name.isEmpty() && m_level.equals("초급")) {
				nDAO.getNight_Recipe_Search_level(n, req);
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(2).jsp");
			} else if (Food_Type.equals("Night") && m_name.isEmpty() && m_level.equals("중급")) {
				nDAO.getNight_Recipe_Search_level(n, req);
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_level/Night_Recipe_level(3).jsp");
			}

			// 술안주 + 제목 검색했을경우
			else if (Food_Type.equals("Night") && !m_name.isEmpty()) {
				System.out.println("손님접대 + 제목 검색했을경우");
				req.setAttribute("m_name", m_name);
				nDAO.getNight_Recipe_Search_name_first(n, req);
				req.setAttribute("cp", "Night_Recipe/Night_Recipe_Search_name.jsp");
			}

			// 디저트용
			else if (Food_Type.equals("Desert") && m_name.isEmpty() && m_level.equals("all")) {
				deDAO.getDesert_Recipe_Search(req);
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe(1-5).jsp");
			} else if (Food_Type.equals("Desert") && m_name.isEmpty() && m_level.equals("아무나")) {
				deDAO.getDesert_Recipe_Search_level(de, req);
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(1).jsp");
			} else if (Food_Type.equals("Desert") && m_name.isEmpty() && m_level.equals("초급")) {
				deDAO.getDesert_Recipe_Search_level(de, req);
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_level/Desert_Recipe_level(2).jsp");
			}

			// 디저트용 + 제목 검색했을경우
			else if (Food_Type.equals("Desert") && !m_name.isEmpty()) {
				System.out.println("디저트용 + 제목 검색했을경우");
				req.setAttribute("m_name", m_name);
				deDAO.getDesert_Recipe_Search_name_first(de, req);
				req.setAttribute("cp", "Desert_Recipe/Desert_Recipe_Search_name.jsp");
			}

			// 스피드용
			else if (Food_Type.equals("Speed") && m_name.isEmpty() && m_level.equals("all")) {
				sDAO.getSpeed_Recipe_Search(req);
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe(1-5).jsp");
			} else if (Food_Type.equals("Speed") && m_name.isEmpty() && m_level.equals("아무나")) {
				sDAO.getSpeed_Recipe_Search_level(s, req);
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(1).jsp");
			} else if (Food_Type.equals("Speed") && m_name.isEmpty() && m_level.equals("초급")) {
				sDAO.getSpeed_Recipe_Search_level(s, req);
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_level/Speed_Recipe_level(2).jsp");
			}

			// 초스피드 + 제목 검색했을경우
			else if (Food_Type.equals("Speed") && !m_name.isEmpty()) {
				System.out.println("디저트용 + 제목 검색했을경우");
				req.setAttribute("m_name", m_name);
				sDAO.getSpeed_Recipe_Search_name_first(s, req);
				req.setAttribute("cp", "Speed_Recipe/Speed_Recipe_Search_name.jsp");
			}

			System.out.println(m_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_Foodall", method = RequestMethod.GET)
	public String getall_Recipe_Foodall(Desert de, Diet d, Guest g, Night n, Speed s, HttpServletRequest req) {
		try {
			String pageNO = req.getParameter("pageNO");
			int pageNO1 = Integer.valueOf(pageNO);
			hDAO.getall_Recipe_Foodall(de, d, g, n, s, req);
			if (pageNO1 <= 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(1-5).jsp");
			} else if (pageNO1 > 56) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(56-60).jsp");
			} else if (pageNO1 > 51) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(51-56).jsp");
			} else if (pageNO1 > 46) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(46-50).jsp");
			} else if (pageNO1 > 41) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(41-45).jsp");
			} else if (pageNO1 > 36) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(36-40).jsp");
			} else if (pageNO1 > 31) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(31-35).jsp");
			} else if (pageNO1 > 26) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(26-30).jsp");
			} else if (pageNO1 > 21) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(21-25).jsp");
			} else if (pageNO1 > 16) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(16-20).jsp");
			} else if (pageNO1 > 11) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(11-15).jsp");
			} else if (pageNO1 > 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(6-10).jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_1page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_1page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_1page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_6page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_6page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_6page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_11page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_11page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_11page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_16page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_16page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_16page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(16-20).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_21page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_21page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_21page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(21-25).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_26page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_26page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_26page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(26-30).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_31page", method = RequestMethod.GET)
	public String getNight_Recipe_31Page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_31page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(31-35).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_36page", method = RequestMethod.GET)
	public String getNight_Recipe_36Page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_36page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(36-40).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_41page", method = RequestMethod.GET)
	public String getNight_Recipe_41Page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_41page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(41-45).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_46page", method = RequestMethod.GET)
	public String getNight_Recipe_46Page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_46page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(46-50).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_51page", method = RequestMethod.GET)
	public String getNight_Recipe_51Page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_51page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(51-55).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_foodall_56page", method = RequestMethod.GET)
	public String getall_Recipe_foodall_56page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_56page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe(56-60).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 전체 음식 중에서 레벨 1을 검색했을떄 번호별 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel1", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel1(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			String pageNO = req.getParameter("pageNO");
			int pageNO1 = Integer.valueOf(pageNO);
			hDAO.getall_Recipe_Foodall_foodlevel1(de,s,n,d,g,req);
			if (pageNO1 <= 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(1-5).jsp");
			} else if (pageNO1 > 10) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(10-15).jsp");
			} else if (pageNO1 > 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(6-10).jsp");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	// 전체 음식 중에서 레벨 1을 검색했을떄 1,6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel1_1page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel1_1page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel1_1page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	// 전체 음식 중에서 레벨 1을 검색했을떄 6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel1_6page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel1_6page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel1_6page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel1_11page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel1_11page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel1_11page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(1)_(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	// 전체 음식 중에서 레벨 2을 검색했을떄 번호별 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel2", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel2(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			String pageNO = req.getParameter("pageNO");
			int pageNO1 = Integer.valueOf(pageNO);
			hDAO.getall_Recipe_Foodall_foodlevel2(de,s,n,d,g,req);
			if (pageNO1 <= 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(1-5).jsp");
			} else if (pageNO1 > 10) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(11-15).jsp");
			} else if (pageNO1 > 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(6-10).jsp");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	
	
	
	// 전체 음식 중에서 레벨 2을 검색했을떄 1,6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel2_1page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel2_1page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel2_1page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	// 전체 음식 중에서 레벨 1을 검색했을떄 6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel2_6page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel2_6page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel2_6page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel2_11page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel2_11page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel2_11page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(2)_(11-15).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	
	
	
	// 전체 음식 중에서 레벨 3을 검색했을떄 번호별 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel3", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel3(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			String pageNO = req.getParameter("pageNO");
			int pageNO1 = Integer.valueOf(pageNO);
			hDAO.getall_Recipe_Foodall_foodlevel3(n,d,g,req);
			if (pageNO1 <= 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(3)_(1-5).jsp");
			} else if (pageNO1 > 10) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(3)_(6-10).jsp");
			} else if (pageNO1 > 5) {
				req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(3)_(11-15).jsp");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	// 전체 음식 중에서 레벨 3을 검색했을떄 1,6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_Foodall_foodlevel3_1page", method = RequestMethod.GET)
	public String getall_Recipe_Foodall_foodlevel3_1page(HttpServletRequest req) {
		try {
			hDAO.getall_Recipe_Foodall_foodlevel3_1page(req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_level(3)_(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	// 전체 음식 중에서 제목을 검색했을떄  번호별번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_all_Search_name", method = RequestMethod.GET)
	public String getall_Recipe_all_Search_name(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			String m_name =req.getParameter("m_name");
			req.setAttribute("m_name", m_name);
			hDAO.getGuest_Recipe_all_Search_name_Count(de, s, n, d, g, req);
			hDAO.getall_Recipe_all_Search_name(de,s,n,d,g,req);
		    String pageNO =req.getParameter("pageNO");
		    int pageNO1 = Integer.valueOf(pageNO);
		    if (pageNO1 <= 5) {	
		    	req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_Search_name_(1-5).jsp");
			}
		    else if (pageNO1 > 5) {
		    	req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_Search_name_(6-10).jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	// 전체 음식 중에서 제목을 검색했을떄 1,6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_all_Search_name_1page", method = RequestMethod.GET)
	public String getall_Recipe_all_Search_name_1page(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			String m_name =req.getParameter("m_name");
			req.setAttribute("m_name", m_name);
			hDAO.getGuest_Recipe_all_Search_name_Count(de, s, n, d, g, req);
			hDAO.getall_Recipe_all_Search_name_1page(de,s,n,d,g,req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_Search_name_(1-5).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	// 전체 음식 중에서 제목을 검색했을떄 1,6,11번쨰 페이지
	@RequestMapping(value = "/getall_Recipe_all_Search_name_6page", method = RequestMethod.GET)
	public String getall_Recipe_all_Search_name_6page(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			String m_name =req.getParameter("m_name");
			req.setAttribute("m_name", m_name);
			hDAO.getGuest_Recipe_all_Search_name_Count(de, s, n, d, g, req);
			hDAO.getall_Recipe_all_Search_name_6page(de,s,n,d,g,req);
			req.setAttribute("cp", "Search_all_Recipe/Search_all_Recipe_Search_name_(6-10).jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	// 로그인/회원가입 페이지 이동
	@RequestMapping(value = "/login_signUp", method = RequestMethod.GET)
	public String login_signUp(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		try {
			req.setAttribute("cp", "Login/login_signUp.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	
	
	
	

	@RequestMapping(value = "/getSearch_video_Main_first", method = RequestMethod.GET)
	public String getSearch_video_Main_first(HttpServletRequest req) {
		try {
			hDAO.getSearch_video_Main_first(req);
			req.setAttribute("cp", "Search_Recipe_Video.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	@RequestMapping(value = "/getSearch_video_Main", method = RequestMethod.GET)
	public String getSearch_video_Main(Search_Video sv,HttpServletRequest req) {
		try {
			hDAO.getSearch_video_Main(sv,req);
			req.setAttribute("cp", "Search_Recipe_Video.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	
	// 장소 검색하기
	@RequestMapping(value = "/Search_Place", method = RequestMethod.GET)
	public String Search_Place(Search_Video sv,HttpServletRequest req) {
		try {
			req.setAttribute("cp", "Search_Place.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	// 장소 검색하기
	@RequestMapping(value = "/Search_Place2", method = RequestMethod.GET)
	public String Search_Place2(Search_Video sv,HttpServletRequest req) {
		try {
			req.setAttribute("cp", "Search_Place2.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	

	


	


}
