package com.lee.project.Season;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lee.project.Season.*;
import com.lee.project.Season.Season_Mapper;
import com.lee.project.User.User;
import com.lee.project.User.User_Mapper;

@Repository
public class SeasonDAO {
  @Autowired
  private SqlSession ss;
	// sqlsessionTemplate
	// sqlsession의 하위 클래스
	// (public class SqlsessionTemplate implements Sqlsession)의 구조
	// 자동연결 / 자동해제
	// 자동 commit
  public List<Season> getRecipesBySeason(String season) {
    return ss.selectList("getRecipesBySeason", season);
  }
  
  
  
	public void getSeason_Recipe_Detail(User u,Season season, HttpServletRequest req) {
		try {
			String m_url = req.getParameter("m_url");
			System.out.println(m_url);

//           List<Diet> a= ss.getMapper(Season_Mapper.class).getSeason_Recipe_introduce(Season);
//           
//           for (Diet diet : a) {
//			System.out.println(diet.getI_level());
//			System.out.println(diet.getI_servings());
//			System.out.println(diet.getI_time());
//		}

			if (ss.getMapper(Season_Mapper.class).UpdateSeason_Recipe_View(season) ==1) {
				System.out.println("조회수 올리기 성공");
			}
			req.setAttribute("Season_Recipe_Mainimage", ss.getMapper(Season_Mapper.class).getSeason_Recipe_Mainimage(season));
			req.setAttribute("Season_Recipe_introduce", ss.getMapper(Season_Mapper.class).getSeason_Recipe_introduce(season));
			req.setAttribute("Season_Recipe_ingredient", ss.getMapper(Season_Mapper.class).getSeason_Recipe_ingredient(season));
			req.setAttribute("Season_Recipe_seqence", ss.getMapper(Season_Mapper.class).getSeason_Recipe_seqence(season));
			ss.getMapper(User_Mapper.class).search_history(u);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}
	}


}