package com.lee.project;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lee.project.Desert.Desert;
import com.lee.project.Desert.Desert_Mapper;
import com.lee.project.Diet.Diet;
import com.lee.project.Diet.Diet_Mapper;
import com.lee.project.Guest.Guest;
import com.lee.project.Guest.Guest_Mapper;
import com.lee.project.Night.Night;
import com.lee.project.Night.Night_Mapper;
import com.lee.project.Search_Video.Search_Video;
import com.lee.project.Search_Video.Search_Video_Mapper;
import com.lee.project.Speed.Speed;
import com.lee.project.Speed.Speed_Mapper;



@Controller
public class HomeDAO {

	
	
	private static final HomeDAO hDAO = new HomeDAO();

	public HomeDAO() {
		// TODO Auto-generated constructor stub
	}

	public static HomeDAO getDdao() {
		return hDAO;
	}
    
	@Autowired
	private SqlSession ss;
	// sqlsessionTemplate
	// sqlsession의 하위 클래스
	// (public class SqlsessionTemplate implements Sqlsession)의 구조
	// 자동연결 / 자동해제
	// 자동 commit
	
	
	// 메인 페이지에서 전체 + foodall 을 검색했을때 보여줄 1번쨰 페이지
	public void getall_Recipe_Foodall_1page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_1page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_1page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_1page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_1page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_1page());	
	}
	
	// 메인 페이지에서 전체 + foodall 을 검색하고 번호별 페이지
	public void getall_Recipe_Foodall(Desert de,Diet d,Guest g,Night n,Speed s,HttpServletRequest req) {
		 String pageNO =req.getParameter("pageNO");
		 System.out.println(pageNO);
		 req.setAttribute("pageNO", pageNO);
		 if (pageNO.equals("1")) {
			System.out.println("1입니다");
		}
         req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall(de));
         req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall(s));
         req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall(n));
         req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall(d));
         req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall(g));	
	}
	
	
	
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_6page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_6page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_6page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_6page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_6page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_6page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_11page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_11page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_11page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_11page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_11page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_11page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_16page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_16page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_16page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_16page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_16page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_16page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_21page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_21page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_21page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_21page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_21page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_21page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_26page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_26page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_26page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_26page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_26page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_26page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_31page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_31page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_31page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_31page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_31page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_31page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_36page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_36page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_36page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_36page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_36page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_36page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_41page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_41page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_41page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_41page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_41page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_41page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_46page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_46page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_46page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_46page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_46page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_46page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_51page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_51page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_51page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_51page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_51page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_51page());	
	}
	// 메인 페이지에서 전체 + foodall 을 검색하고 >> 클릭시 6번쨰 페이지
	public void getall_Recipe_Foodall_56page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_56page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_56page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_56page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_56page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_56page());	
	}
	
	
	

	// 메인 페이지에서 전체 + food level(1)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel1_1page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel1_1page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel1_1page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel1_1page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel1_1page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel1_1page());
	}
	// 메인 페이지에서 전체 + food level(1)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel1_6page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel1_6page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel1_6page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel1_6page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel1_6page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel1_6page());
	}
	// 메인 페이지에서 전체 + food level(1)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel1_11page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel1_11page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel1_11page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel1_11page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel1_11page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel1_11page());
	}
	
	
	// 메인 페이지에서 전체 + food level(1)  을 검색했을경우 번호별페이지
	public void getall_Recipe_Foodall_foodlevel1(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodlevel1(de));
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodlevel1(s));
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodlevel1(n));
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodlevel1(d));
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodlevel1(g));
	}
	
	
	
	
	
	
	
	// 메인 페이지에서 전체 + food level(2)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel2_1page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel2_1page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel2_1page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel2_1page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel2_1page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel2_1page());
	}
	// 메인 페이지에서 전체 + food level(1)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel2_6page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel2_6page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel2_6page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel2_6page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel2_6page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel2_6page());
	}
	// 메인 페이지에서 전체 + food level(1)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel2_11page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel2_11page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel2_11page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel2_11page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel2_11page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel2_11page());
	}

	
	// 메인 페이지에서 전체 + food level(2)  을 검색했을경우 번호별페이지
	public void getall_Recipe_Foodall_foodlevel2(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodlevel2(de));
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodlevel2(s));
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodlevel2(n));
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodlevel2(d));
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodlevel2(g));
	}

	
	
	
	
	
	// 메인 페이지에서 전체 + food level(3)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel3_1page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel3_1page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel3_1page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel3_1page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel3_1page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel3_1page());
	}
	// 메인 페이지에서 전체 + food level(3)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel3_6page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel3_6page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel3_6page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel3_6page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel3_6page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel3_6page());
	}
	// 메인 페이지에서 전체 + food level(3)  을 검색했을경우
	public void getall_Recipe_Foodall_foodlevel3_11page(HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_Foodall_foodlevel3_11page());
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_Foodall_foodlevel3_11page());
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodall_foodlevel3_11page());
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodall_foodlevel3_11page());
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodall_foodlevel3_11page());
	}
	
	
	// 메인 페이지에서 전체 + food level(3)  을 검색했을경우 번호별페이지
	public void getall_Recipe_Foodall_foodlevel3(Night n,Diet d,Guest g,HttpServletRequest req) {
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_Foodlevel3(n));
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_Foodlevel3(d));
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_Foodlevel3(g));
	}
	
	
	
	
	
	
	// 메인 페이지에서 전체 + 제목 을 검색했을경우 번호별페이지
	public void getall_Recipe_all_Search_name(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_all_Search_name(de));
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_all_Search_name(s));
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_all_Search_name(n));
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_all_Search_name(d));
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_all_Search_name(g));
	}
	
	
	
	
	// 메인 페이지에서 전체 + 제목  을 검색했을경우
	public void getall_Recipe_all_Search_name_1page(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_all_Search_name_1page(de));
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_all_Search_name_1page(s));
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_all_Search_name_1page(n));
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_all_Search_name_1page(d));
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_all_Search_name_1page(g));
	}
	// 메인 페이지에서 전체 + 제목  을 검색했을경우
	public void getall_Recipe_all_Search_name_6page(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		req.setAttribute("Desert_Recipe",ss.getMapper(Desert_Mapper.class).getDesert_Recipe_all_Search_name_6page(de));
		req.setAttribute("Speed_Recipe",ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_all_Search_name_6page(s));
		req.setAttribute("Night_Recipe",ss.getMapper(Night_Mapper.class).getNight_Recipe_all_Search_name_6page(n));
		req.setAttribute("Diet_Recipe",ss.getMapper(Diet_Mapper.class).getDiet_Recipe_all_Search_name_6page(d));
		req.setAttribute("Guest_Recipe",ss.getMapper(Guest_Mapper.class).getGuest_Recipe_all_Search_name_6page(g));
	}
	
	
	// 메인 페이지에서 전체 + food level(3)  을 검색했을경우
	public void getGuest_Recipe_all_Search_name_Count(Desert de,Speed s,Night n,Diet d,Guest g,HttpServletRequest req) {
		int Desert_Count = ss.getMapper(Desert_Mapper.class).getDesert_Recipe_all_Search_name_Count(de);
		int Speed_Count = ss.getMapper(Speed_Mapper.class).getSpeed_Recipe_all_Search_name_Count(s);
		int Night_Count = ss.getMapper(Night_Mapper.class).getNight_Recipe_all_Search_name_Count(n);
		int Diet_Count = ss.getMapper(Diet_Mapper.class).getDiet_Recipe_all_Search_name_Count(d);
		int Guest_Count = ss.getMapper(Guest_Mapper.class).getGuest_Recipe_all_Search_name_Count(g);
		
		int totalCount=Desert_Count+Speed_Count+Night_Count+Diet_Count+Guest_Count;
		
		req.setAttribute("TotalCount", totalCount);
	}
	
	
	

	public void getSearch_video_Main_first(HttpServletRequest req) {
		req.setAttribute("Search_Video_Mains",ss.getMapper(Search_Video_Mapper.class).getSearch_video_Main_fisrt());
	}
	public void getSearch_video_Main(Search_Video sv,HttpServletRequest req) {
		req.setAttribute("Search_Video_Mains",ss.getMapper(Search_Video_Mapper.class).getSearch_video_Main(sv));
	}
	
	
	
	}


	
	
	
	
	
	

