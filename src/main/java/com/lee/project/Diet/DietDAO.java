package com.lee.project.Diet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.project.User.User;
import com.lee.project.User.User_Mapper;

@Service
public class DietDAO {

	private static final DietDAO dDAO = new DietDAO();

	public DietDAO() {
		// TODO Auto-generated constructor stub
	}

	public static DietDAO getDdao() {
		return dDAO;
	}
	

	@Autowired
	private SqlSession ss;
	// sqlsessionTemplate
	// sqlsession의 하위 클래스
	// (public class SqlsessionTemplate implements Sqlsession)의 구조
	// 자동연결 / 자동해제
	// 자동 commit

	// food_level all 일시 번호 클릭시 이동하는 페이지 분류
	public void getDiet_Recipe_popular(HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			// 잘 가져왔는지 확인
//			List<Diet> a=ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular9();
//		
//		    for (Diet diet : a) {
//				System.out.println(diet);
//			}	
			

			// System.out.println(num1); null
			System.out.println("num:" + num);

			if (num.equals("1")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular1());
			} else if (num.equals("2")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular2());
			} else if (num.equals("3")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular3());
			} else if (num.equals("4")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular4());
			} else if (num.equals("5")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular5());
			} else if (num.equals("6")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular6());
			} else if (num.equals("7")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular7());
			} else if (num.equals("8")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular8());
			} else if (num.equals("9")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular9());
			} else if (num.equals("10")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular10());
			} else if (num.equals("11")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular11());
			} else if (num.equals("12")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular12());
			} else if (num.equals("13")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular13());
			} else if (num.equals("14")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular14());
			} else if (num.equals("15")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular15());
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getDiet_Recipe_Search(Diet d, HttpServletRequest req) { // 다이어트 라고 검색했울땨
		try {
			String Food_Type = req.getParameter("Food_Type");
			String m_level = req.getParameter("m_level");
			if (Food_Type.equals("Diet") && m_level.equals("all")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular1());
			} 
			System.out.println("Food_Type:" + Food_Type);
			System.out.println("m_level:" + m_level);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getDiet_Recipe_Search_level(Diet d, HttpServletRequest req) { // 다이어트 라고 검색했울땨
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level(d));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	

	public void getDiet_Recipe_1Page(HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular1());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getDiet_Recipe_6Page(HttpServletRequest req) { // >> 클릭시 6번쨰 페이지로
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular6());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getDiet_Recipe_11Page(HttpServletRequest req) { // >> 클릭시 11번쨰 페이지로
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular11());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getDiet_Recipe_Detail(User u,Diet d, HttpServletRequest req) {
		try {
			String m_url = req.getParameter("m_url");
			System.out.println(m_url);

//           List<Diet> a= ss.getMapper(Diet_Mapper.class).getDiet_Recipe_introduce(d);
//           
//           for (Diet diet : a) {
//			System.out.println(diet.getI_level());
//			System.out.println(diet.getI_servings());
//			System.out.println(diet.getI_time());
//		}

            if(ss.getMapper(Diet_Mapper.class).UpdateDiet_Recipe_View(d) == 1) {
            	 System.out.println("조회수 올리기 성공");
            }
            
			req.setAttribute("Diet_Recipe_Mainimage", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Mainimage(d));
			req.setAttribute("Diet_Recipe_introduce", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_introduce(d));
			req.setAttribute("Diet_Recipe_ingredient", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_ingredient(d));
			req.setAttribute("Diet_Recipe_seqence", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_seqence(d));
			ss.getMapper(User_Mapper.class).search_history(u);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	//레벨(1)별로 1,2,3...클릭시 페이지
	public void getDiet_Recipe_level1(Diet d,HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			// 잘 가져왔는지 확인
//			List<Diet> a=ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular9();
//		
//		    for (Diet diet : a) {
//				System.out.println(diet);
//			}	

			// System.out.println(num1); null
			System.out.println("num:" + num);

			if (num.equals("1")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level1(d));
			} else if (num.equals("2")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2(d));
			} else if (num.equals("3")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level3(d));
			} else if (num.equals("4")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level4(d));
			} else if (num.equals("5")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level5(d));
			} else if (num.equals("6")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level6(d));
			} else if (num.equals("7")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level7(d));
			} else if (num.equals("8")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level8(d));
			} 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	

	public void getDiet_Recipe_level1_1Page(Diet d,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level1(d));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	public void getDiet_Recipe_level1_6Page(Diet d,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level6(d));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	// 레벨 2에서 번호 클릭시
	public void getDiet_Recipe_level2(Diet d,HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			// 잘 가져왔는지 확인
//			List<Diet> a=ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Popular9();
//		
//		    for (Diet diet : a) {
//				System.out.println(diet);
//			}	

			// System.out.println(num1); null
			System.out.println("num:" + num);

			if (num.equals("1")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2_1(d));
			} else if (num.equals("2")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2_2(d));
			} else if (num.equals("3")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2_3(d));
			} else if (num.equals("4")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2_4(d));
			} else if (num.equals("5")) {
				req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2_5(d));
			} 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	

	public void getDiet_Recipe_level2_1Page(Diet d,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_level2_1(d));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	//다이어트 + 제목 메인  페이지에서 검색했을떄
	public void getDiet_Recipe_Search_name_first(Diet d,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("TotalCount",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_TotalCount(d));
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Search_name_first(d));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	// 다이어트 + 제목 검색했을 경우 번호별 페이지
	public void getDiet_Recipe_Search_name(Diet d,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("TotalCount",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_TotalCount(d));
			req.setAttribute("Diet_Recipe", ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Search_name(d));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	
	
	
	
	

}
