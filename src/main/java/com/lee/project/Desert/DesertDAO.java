package com.lee.project.Desert;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.project.Diet.Diet;
import com.lee.project.Diet.Diet_Mapper;
import com.lee.project.Guest.Guest;
import com.lee.project.User.User;
import com.lee.project.User.User_Mapper;


@Service
public class DesertDAO {

	
	private static final DesertDAO deDAO = new DesertDAO();

	public DesertDAO() {
		// TODO Auto-generated constructor stub
	}

	public static DesertDAO getDdao() {
		return deDAO;
	}

	@Autowired
	private SqlSession ss;
	// sqlsessionTemplate
	// sqlsession의 하위 클래스
	// (public class SqlsessionTemplate implements Sqlsession)의 구조
	// 자동연결 / 자동해제
	// 자동 commit

	
	
	//번호 클릭시 이동하는 페이지 분류
	public void getDesert_Recipe_popular(HttpServletRequest req) {  //1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			
			//잘 가져왔는지 확인
//			List<Diet> a=ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular9();
//		
//		    for (Diet diet : a) {
//				System.out.println(diet);
//			}	
			
			System.out.println(num);
			//System.out.println(num1); null

			    
				
			
			if (num.equals("1")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular1());
			} else if (num.equals("2")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular2());
			} else if (num.equals("3")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular3());
			} else if (num.equals("4")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular4());
			} else if (num.equals("5")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular5());
			}else if (num.equals("6")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular6());
			}else if (num.equals("7")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular7());
			}else if (num.equals("8")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular8());
			}else if (num.equals("9")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular9());
			}else if (num.equals("10")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular10());
			}else if (num.equals("11")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular11());
			}else if (num.equals("12")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular12());
			}else if (num.equals("13")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular13());
			}else if (num.equals("14")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular14());
			}else if (num.equals("15")) {
				req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular15());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getDesert_Recipe_Search(HttpServletRequest req) { //다이어트 라고 검색했울땨
		try {
			String num = req.getParameter("pageNO");
			System.out.println(num);
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular1());	    
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	////////////
	public void getDesert_Recipe_Search_level(Desert de, HttpServletRequest req) { // 손님 접대라고 검색했울땨
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level(de));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	public void getDesert_Recipe_1Page(HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular1());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getDesert_Recipe_6Page(HttpServletRequest req) { // >> 클릭시 6번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular6());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getDesert_Recipe_11Page(HttpServletRequest req) { // >> 클릭시 11번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular11());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	public void getDesert_Recipe_Detail(User u,Desert de,HttpServletRequest req) { 
		try {
			String m_url=req.getParameter("m_url");
            System.out.println(m_url);
            
//           List<Diet> a= ss.getMapper(Diet_Mapper.class).getDesert_Recipe_introduce(de);
//           
//           for (Diet diet : a) {
//			System.out.println(diet.getI_level());
//			System.out.println(diet.getI_servings());
//			System.out.println(diet.getI_time());
//		}
            if(ss.getMapper(Desert_Mapper.class).UpdateDesert_Recipe_View(de) == 1) {
           	 System.out.println("조회수 올리기 성공");
           }
 
            req.setAttribute("Desert_Recipe_Mainimage", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Mainimage(de));
			req.setAttribute("Desert_Recipe_introduce", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_introduce(de));
			req.setAttribute("Desert_Recipe_ingredient", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_ingredient(de));
			req.setAttribute("Desert_Recipe_seqence", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_seqence(de));
			ss.getMapper(User_Mapper.class).search_history(u);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	
	
	
	
	
	
	// 레벨(1)별로 1,2,3...클릭시 페이지
	public void getDesert_Recipe_level1(Desert de, HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("pageNO");
			String num1 = (String) req.getAttribute("pageNO");
//				HashMap<String,String> map = new HashMap<String, String>();
//			    map.put("num", num);

			// 잘 가져왔는지 확인
//				List<Diet> a=ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular9();
//			
//			    for (Diet diet : a) {
//					System.out.println(diet);
//				}	

			// System.out.println(num1); null
			System.out.println("num:" + num);
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level1(de));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getDesert_Recipe_level1_1Page(Desert de, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level1_1page(de));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getDesert_Recipe_level1_6Page(Desert de, HttpServletRequest req) { // >> 클릭시 6번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level1_6page(de));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	
	// 레벨 2에서 번호 클릭시
	public void getDesert_Recipe_level2(Desert de, HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			// 잘 가져왔는지 확인
//				List<Diet> a=ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Popular9();
//			
//			    for (Diet diet : a) {
//					System.out.println(diet);
//				}	

			// System.out.println(num1); null
			System.out.println("num:" + num);

			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level2(de));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
    // 레벨 2에서 << 클릭시 첫번쨰 페이지
	public void getDesert_Recipe_level2_1Page(Desert de, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level2_1page(de));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}   
	// 레벨 2에서 >> 클릭시 6번쨰 페이지
	public void getDesert_Recipe_level2_6Page(Desert de, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level2_6page(de));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
//	// 레벨 3           
//	public void getDesert_Recipe_level3(Desert de, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
//		try {
//			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_level3(de));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("가져오기 실패");
//		}
//	}
	
	
	//디저트 + 제목 메인  페이지에서 검색했을떄
	public void getDesert_Recipe_Search_name_first(Desert de,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("TotalCount",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_TotalCount(de));
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Search_name_first(de));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	// 디저트 + 제목  검색했을 경우 번호별 페이지
	public void getDesert_Recipe_Search_name(Desert de,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("TotalCount",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_TotalCount(de));
			req.setAttribute("Desert_Recipe", ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Search_name(de));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	
}
