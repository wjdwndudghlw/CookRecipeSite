package com.lee.project.Night;

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
public class NightDAO {

	
	private static final NightDAO gDAO = new NightDAO();

	public NightDAO() {
		// TODO Auto-generated constructor stub
	}

	public static NightDAO getDdao() {
		return gDAO;
	}

	@Autowired
	private SqlSession ss;
	// sqlsessionTemplate
	// sqlsession의 하위 클래스
	// (public class SqlsessionTemplate implements Sqlsession)의 구조
	// 자동연결 / 자동해제
	// 자동 commit

	
	
	//번호 클릭시 이동하는 페이지 분류
	public void getNight_Recipe_popular(HttpServletRequest req) {  //1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			
			//잘 가져왔는지 확인
//			List<Diet> a=ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular9();
//		
//		    for (Diet diet : a) {
//				System.out.println(diet);
//			}	
			
			System.out.println(num);
			//System.out.println(num1); null

			    
				
			
			if (num.equals("1")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular1());
			} else if (num.equals("2")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular2());
			} else if (num.equals("3")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular3());
			} else if (num.equals("4")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular4());
			} else if (num.equals("5")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular5());
			}else if (num.equals("6")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular6());
			}else if (num.equals("7")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular7());
			}else if (num.equals("8")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular8());
			}else if (num.equals("9")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular9());
			}else if (num.equals("10")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular10());
			}else if (num.equals("11")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular11());
			}else if (num.equals("12")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular12());
			}else if (num.equals("13")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular13());
			}else if (num.equals("14")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular14());
			}else if (num.equals("15")) {
				req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular15());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getNight_Recipe_Search(HttpServletRequest req) { //다이어트 라고 검색했울땨
		try {
			String num = req.getParameter("pageNO");
			System.out.println(num);
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular1());	    
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	////////////
	public void getNight_Recipe_Search_level(Night n, HttpServletRequest req) { // 손님 접대라고 검색했울땨
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level(n));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	public void getNight_Recipe_1Page(HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular1());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getNight_Recipe_6Page(HttpServletRequest req) { // >> 클릭시 6번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular6());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	public void getNight_Recipe_11Page(HttpServletRequest req) { // >> 클릭시 11번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular11());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	public void getNight_Recipe_Detail(User u,Night n,HttpServletRequest req) { 
		try {
			String m_url=req.getParameter("m_url");
            System.out.println(m_url);
            
//           List<Diet> a= ss.getMapper(Diet_Mapper.class).getNight_Recipe_introduce(d);
//           
//           for (Diet diet : a) {
//			System.out.println(diet.getI_level());
//			System.out.println(diet.getI_servings());
//			System.out.println(diet.getI_time());
//		}
            if(ss.getMapper(Night_Mapper.class).UpdateNight_Recipe_View(n) == 1) {
           	 System.out.println("조회수 올리기 성공");
           }
 
            req.setAttribute("Night_Recipe_Mainimage", ss.getMapper(Night_Mapper.class).getNight_Recipe_Mainimage(n));
			req.setAttribute("Night_Recipe_introduce", ss.getMapper(Night_Mapper.class).getNight_Recipe_introduce(n));
			req.setAttribute("Night_Recipe_ingredient", ss.getMapper(Night_Mapper.class).getNight_Recipe_ingredient(n));
			req.setAttribute("Night_Recipe_seqence", ss.getMapper(Night_Mapper.class).getNight_Recipe_seqence(n));
			ss.getMapper(User_Mapper.class).search_history(u);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	
	
	
	
	
	
	// 레벨(1)별로 1,2,3...클릭시 페이지
	public void getNight_Recipe_level1(Night n, HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("pageNO");
			String num1 = (String) req.getAttribute("pageNO");
//				HashMap<String,String> map = new HashMap<String, String>();
//			    map.put("num", num);

			// 잘 가져왔는지 확인
//				List<Diet> a=ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular9();
//			
//			    for (Diet diet : a) {
//					System.out.println(diet);
//				}	

			// System.out.println(num1); null
			System.out.println("num:" + num);
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level1(n));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getNight_Recipe_level1_1Page(Night n, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level1_1page(n));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	public void getNight_Recipe_level1_6Page(Night n, HttpServletRequest req) { // >> 클릭시 6번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level1_6page(n));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}

	
	// 레벨 2에서 번호 클릭시
	public void getNight_Recipe_level2(Night n, HttpServletRequest req) { // 1,2,3,4,5 번호 클릭시
		try {

			String num = (String) req.getParameter("1");
			String num1 = (String) req.getAttribute("1");

			// 잘 가져왔는지 확인
//				List<Diet> a=ss.getMapper(Night_Mapper.class).getNight_Recipe_Popular9();
//			
//			    for (Diet diet : a) {
//					System.out.println(diet);
//				}	

			// System.out.println(num1); null
			System.out.println("num:" + num);

			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level2(n));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
    // 레벨 2에서 << 클릭시 첫번쨰 페이지
	public void getNight_Recipe_level2_1Page(Night n, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level2_1page(n));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}   
	// 레벨 2에서 >> 클릭시 6번쨰 페이지
	public void getNight_Recipe_level2_6Page(Night n, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level2_6page(n));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	// 레벨 3           
	public void getNight_Recipe_level3(Night n, HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_level3(n));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	//술안주 + 제목 메인  페이지에서 검색했을떄
	public void getNight_Recipe_Search_name_first(Night n,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("TotalCount",ss.getMapper(Night_Mapper.class).getNight_Recipe_TotalCount(n));
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Search_name_first(n));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	// 술안주 + 제목  검색했을 경우 번호별 페이지
	public void getNight_Recipe_Search_name(Night n,HttpServletRequest req) { // << 클릭시 1번쨰 페이지로
		try {
			req.setAttribute("TotalCount",ss.getMapper(Night_Mapper.class).getNight_Recipe_TotalCount(n));
			req.setAttribute("Night_Recipe", ss.getMapper(Night_Mapper.class).getNight_Recipe_Search_name(n));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}
	
	
	
	
}
