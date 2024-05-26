package com.lee.project.Night;

import java.util.List;

import com.lee.project.Night.Night;
import com.lee.project.Night.Night;
import com.lee.project.Night.Night;
import com.lee.project.Night.Night;
import com.lee.project.Night.Night;
import com.lee.project.Night.Night;
import com.lee.project.Guest.Guest;
import com.lee.project.Night.Night;
import com.lee.project.Night.Night;

public interface Night_Mapper {

	
	
	public abstract List<Night> getNight_Recipe_Popular1();
	public abstract List<Night> getNight_Recipe_Popular2();
	public abstract List<Night> getNight_Recipe_Popular3();
	public abstract List<Night> getNight_Recipe_Popular4();
	public abstract List<Night> getNight_Recipe_Popular5();
	
	
	public abstract List<Night> getNight_Recipe_Popular6();
	public abstract List<Night> getNight_Recipe_Popular7();
	public abstract List<Night> getNight_Recipe_Popular8();
	public abstract List<Night> getNight_Recipe_Popular9();
	public abstract List<Night> getNight_Recipe_Popular10();
	
	
	public abstract List<Night> getNight_Recipe_Popular11();
	public abstract List<Night> getNight_Recipe_Popular12();
	public abstract List<Night> getNight_Recipe_Popular13();
	public abstract List<Night> getNight_Recipe_Popular14();
	public abstract List<Night> getNight_Recipe_Popular15();
	
	public abstract List<Night> getNight_Recipe_Mainimage(Night n);
	public abstract List<Night> getNight_Recipe_introduce(Night n);
	public abstract List<Night> getNight_Recipe_ingredient(Night n);
	public abstract List<Night> getNight_Recipe_seqence(Night n);
	
	
	
	//레벨에 따른 페이지
	public abstract List<Night> getNight_Recipe_level(Night n);
	
	
	
	//레벨(1)에 번호별 페이지
	public abstract List<Night> getNight_Recipe_level1(Night n);
	//레벨 1에서 <<, >> 클릭시 보여줄 1,6번쨰 페이지
	public abstract List<Night> getNight_Recipe_level1_1page(Night n);
	public abstract List<Night> getNight_Recipe_level1_6page(Night n);



	//레벨(2)에 번호별 페이지
	public abstract List<Night> getNight_Recipe_level2(Night n);
	//레벨 2에서 <<, >> 클릭시 보여줄 1,6번쨰 페이지
	public abstract List<Night> getNight_Recipe_level2_1page(Night n);
	public abstract List<Night> getNight_Recipe_level2_6page(Night n);
	
	
	//레벨 (3) 에번호별 페이지
	public abstract List<Night> getNight_Recipe_level3(Night n);
	
	
	// 첫 페이지에서 제목 검색했을떄
	public abstract List<Guest> getNight_Recipe_Search_name_first(Night n);
	// 제목  검색했을떄 번호별 페이지
	public abstract List<Guest> getNight_Recipe_Search_name(Night n);
	
	// 디테일한 설명 페이지 들어갈떄마다 조회수 올리기
	public abstract int UpdateNight_Recipe_View(Night n);
	// 메인페이지에서 검색했을경우 총 검색 결과수
	public abstract int  getNight_Recipe_TotalCount(Night n);
	
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 
	public abstract List<Night> getNight_Recipe_Foodall(Night n);
	
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 + << , >> 클릭시 이동하는 페이지
	public abstract List<Night> getNight_Reciep_Foodall_1page();
	
	
	
	
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 + << , >> 클릭시 이동하는 페이지
	public abstract List<Night> getNight_Recipe_Foodall_1page();
	public abstract List<Night> getNight_Recipe_Foodall_6page();
	public abstract List<Night> getNight_Recipe_Foodall_11page();
	public abstract List<Night> getNight_Recipe_Foodall_16page();
	public abstract List<Night> getNight_Recipe_Foodall_21page();
	public abstract List<Night> getNight_Recipe_Foodall_26page();
	public abstract List<Night> getNight_Recipe_Foodall_31page();
	public abstract List<Night> getNight_Recipe_Foodall_36page();
	public abstract List<Night> getNight_Recipe_Foodall_41page();
	public abstract List<Night> getNight_Recipe_Foodall_46page();
	public abstract List<Night> getNight_Recipe_Foodall_51page();
	public abstract List<Night> getNight_Recipe_Foodall_56page();
	
	
	//메인 페이지에서 전체중 food level(1) 를 검색했을경우
	public abstract List<Night> getNight_Recipe_Foodlevel1(Night n);
	
	
	
	
	//메인 페이지에서 전체중 food level(1) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel1_1page();
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel1_6page();
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel1_11page();
	
	
	
	
	//메인 페이지에서 전체중 food level(2) 를 검색했을경우 번호별페이지
	public abstract List<Night> getNight_Recipe_Foodlevel2(Night n);
	
	//메인 페이지에서 전체중 food level(2) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel2_1page();
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel2_6page();
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel2_11page();

	
	
	
	
	
	//메인 페이지에서 전체중 food level(3) 를 검색했을경우 번호별페이지
	public abstract List<Night> getNight_Recipe_Foodlevel3(Night n);
	
	//메인 페이지에서 전체중 food level(3) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel3_1page();
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel3_6page();
	public abstract List<Night> getNight_Recipe_Foodall_foodlevel3_11page();
	
	
	
	
	//메인 페이지에서 전체중 제목을  검색했을경우 번호별페이지
	public abstract List<Night> getNight_Recipe_all_Search_name(Night n);
	
	//메인 페이지에서 전체중  제목을  검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Night> getNight_Recipe_all_Search_name_1page(Night n);
	public abstract List<Night> getNight_Recipe_all_Search_name_6page(Night n);
	public abstract List<Night> getNight_Recipe_all_Search_name_11page(Night n);
	
	// 메인 페이지에서 전체중 제목을  검색했을경우 몇개인지 카운트
	public abstract int getNight_Recipe_all_Search_name_Count(Night n);

	
}
