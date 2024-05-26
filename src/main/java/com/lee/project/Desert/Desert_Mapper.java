package com.lee.project.Desert;

import java.util.List;

import com.lee.project.Guest.Guest;
import com.lee.project.Desert.Desert;
import com.lee.project.Desert.Desert;

public interface Desert_Mapper {
	
	

	public abstract List<Desert> getDesert_Recipe_Popular1();

	public abstract List<Desert> getDesert_Recipe_Popular2();

	public abstract List<Desert> getDesert_Recipe_Popular3();

	public abstract List<Desert> getDesert_Recipe_Popular4();

	public abstract List<Desert> getDesert_Recipe_Popular5();

	public abstract List<Desert> getDesert_Recipe_Popular6();

	public abstract List<Desert> getDesert_Recipe_Popular7();

	public abstract List<Desert> getDesert_Recipe_Popular8();

	public abstract List<Desert> getDesert_Recipe_Popular9();

	public abstract List<Desert> getDesert_Recipe_Popular10();

	public abstract List<Desert> getDesert_Recipe_Popular11();

	public abstract List<Desert> getDesert_Recipe_Popular12();

	public abstract List<Desert> getDesert_Recipe_Popular13();

	public abstract List<Desert> getDesert_Recipe_Popular14();

	public abstract List<Desert> getDesert_Recipe_Popular15();

	public abstract List<Desert> getDesert_Recipe_Mainimage(Desert de);

	public abstract List<Desert> getDesert_Recipe_introduce(Desert de);

	public abstract List<Desert> getDesert_Recipe_ingredient(Desert de);

	public abstract List<Desert> getDesert_Recipe_seqence(Desert de);

	// 레벨에 따른 페이지
	public abstract List<Desert> getDesert_Recipe_level(Desert de);

	// 레벨(1)에 번호별 페이지
	public abstract List<Desert> getDesert_Recipe_level1(Desert de);

	// 레벨 1에서 <<, >> 클릭시 보여줄 1,6번쨰 페이지
	public abstract List<Desert> getDesert_Recipe_level1_1page(Desert de);

	public abstract List<Desert> getDesert_Recipe_level1_6page(Desert de);

	// 레벨(2)에 번호별 페이지
	public abstract List<Desert> getDesert_Recipe_level2(Desert de);

	// 레벨 2에서 <<, >> 클릭시 보여줄 1,6번쨰 페이지
	public abstract List<Desert> getDesert_Recipe_level2_1page(Desert de);

	public abstract List<Desert> getDesert_Recipe_level2_6page(Desert de);

	
//	// 레벨 (3) 에번호별 페이지
//	public abstract List<Desert> getDesert_Recipe_level3(Desert de);

	// 첫 페이지에서 제목 검색했을떄
	public abstract List<Desert> getDesert_Recipe_Search_name_first(Desert de);

	// 제목 검색했을떄 번호별 페이지
	public abstract List<Desert> getDesert_Recipe_Search_name(Desert de);

	// 디테일한 설명 페이지 들어갈떄마다 조회수 올리기
	public abstract int UpdateDesert_Recipe_View(Desert de);

	// 메인페이지에서 검색했을경우 총 검색 결과수
	public abstract int getDesert_Recipe_TotalCount(Desert de);
	
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 
	public abstract List<Desert> getDesert_Recipe_Foodall(Desert de);
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 + << , >> 클릭시 이동하는 페이지
	public abstract List<Desert> getDesert_Recipe_Foodall_1page();
	public abstract List<Desert> getDesert_Recipe_Foodall_6page();
	public abstract List<Desert> getDesert_Recipe_Foodall_11page();
	public abstract List<Desert> getDesert_Recipe_Foodall_16page();
	public abstract List<Desert> getDesert_Recipe_Foodall_21page();
	public abstract List<Desert> getDesert_Recipe_Foodall_26page();
	public abstract List<Desert> getDesert_Recipe_Foodall_31page();
	public abstract List<Desert> getDesert_Recipe_Foodall_36page();
	public abstract List<Desert> getDesert_Recipe_Foodall_41page();
	public abstract List<Desert> getDesert_Recipe_Foodall_46page();
	public abstract List<Desert> getDesert_Recipe_Foodall_51page();
	public abstract List<Desert> getDesert_Recipe_Foodall_56page();

	
	//메인 페이지에서 전체중 food level(1) 를 검색했을경우 번호별페이지
	public abstract List<Desert> getDesert_Recipe_Foodlevel1(Desert de);
	
	//메인 페이지에서 전체중 food level(1) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel1_1page();
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel1_6page();
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel1_11page();
	
	
	//메인 페이지에서 전체중 food level(2) 를 검색했을경우 번호별페이지
	public abstract List<Desert> getDesert_Recipe_Foodlevel2(Desert de);
	
	//메인 페이지에서 전체중 food level(2) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel2_1page();
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel2_6page();
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel2_11page();
	
	
	
	//메인 페이지에서 전체중 food level(3) 를 검색했을경우 번호별페이지
	public abstract List<Desert> getDesert_Recipe_Foodlevel3(Desert de);
	
	//메인 페이지에서 전체중 food level(3) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel3_1page();
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel3_6page();
	public abstract List<Desert> getDesert_Recipe_Foodall_foodlevel3_11page();
	
	
	
	
	
	//메인 페이지에서 전체중 제목을  검색했을경우 번호별페이지
	public abstract List<Desert> getDesert_Recipe_all_Search_name(Desert de);
	
	//메인 페이지에서 전체중  제목을  검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Desert> getDesert_Recipe_all_Search_name_1page(Desert de);
	public abstract List<Desert> getDesert_Recipe_all_Search_name_6page(Desert de);
	public abstract List<Desert> getDesert_Recipe_all_Search_name_11page(Desert de);
	// 메인 페이지에서 전체중 제목을  검색했을경우 몇개인지 카운트
	public abstract int getDesert_Recipe_all_Search_name_Count(Desert de);
   

}
