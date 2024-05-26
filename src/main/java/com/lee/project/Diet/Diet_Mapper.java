package com.lee.project.Diet;

import java.util.List;

import com.lee.project.Desert.Desert;
import com.lee.project.Diet.Diet;
import com.lee.project.Diet.Diet;
import com.lee.project.Diet.Diet;
import com.lee.project.Diet.Diet;
import com.lee.project.Diet.Diet;

public interface Diet_Mapper {

	
	
	public abstract List<Diet> getDiet_Recipe_Popular1();
	public abstract List<Diet> getDiet_Recipe_Popular2();
	public abstract List<Diet> getDiet_Recipe_Popular3();
	public abstract List<Diet> getDiet_Recipe_Popular4();
	public abstract List<Diet> getDiet_Recipe_Popular5();
	
	
	public abstract List<Diet> getDiet_Recipe_Popular6();
	public abstract List<Diet> getDiet_Recipe_Popular7();
	public abstract List<Diet> getDiet_Recipe_Popular8();
	public abstract List<Diet> getDiet_Recipe_Popular9();
	public abstract List<Diet> getDiet_Recipe_Popular10();
	
	
	public abstract List<Diet> getDiet_Recipe_Popular11();
	public abstract List<Diet> getDiet_Recipe_Popular12();
	public abstract List<Diet> getDiet_Recipe_Popular13();
	public abstract List<Diet> getDiet_Recipe_Popular14();
	public abstract List<Diet> getDiet_Recipe_Popular15();
	
	//설명부분
	public abstract List<Diet> getDiet_Recipe_Mainimage(Diet d);
	public abstract List<Diet> getDiet_Recipe_introduce(Diet d);
	public abstract List<Diet> getDiet_Recipe_ingredient(Diet d);
	public abstract List<Diet> getDiet_Recipe_seqence(Diet d);
	
	
	//레벨에 따른 페이지
	public abstract List<Diet> getDiet_Recipe_level(Diet d);
	
	
	//레벨(1)에 번호별 페이지
	public abstract List<Diet> getDiet_Recipe_level1(Diet d);
	public abstract List<Diet> getDiet_Recipe_level2(Diet d);
	public abstract List<Diet> getDiet_Recipe_level3(Diet d);
	public abstract List<Diet> getDiet_Recipe_level4(Diet d);
	public abstract List<Diet> getDiet_Recipe_level5(Diet d);
	public abstract List<Diet> getDiet_Recipe_level6(Diet d);
	public abstract List<Diet> getDiet_Recipe_level7(Diet d);
	public abstract List<Diet> getDiet_Recipe_level8(Diet d);

	
	//레벨(2)에 번호별 페이지
	public abstract List<Diet> getDiet_Recipe_level2_1(Diet d);
	public abstract List<Diet> getDiet_Recipe_level2_2(Diet d);
	public abstract List<Diet> getDiet_Recipe_level2_3(Diet d);
	public abstract List<Diet> getDiet_Recipe_level2_4(Diet d);
	public abstract List<Diet> getDiet_Recipe_level2_5(Diet d);
	
	
	// 첫 페이지에서 제목 검색했을떄
	public abstract List<Diet> getDiet_Recipe_Search_name_first(Diet d);
	// 제목  검색했을떄 번호별 페이지
	public abstract List<Diet> getDiet_Recipe_Search_name(Diet d);
	
	
	// 디테일 한 설명 들어갈떄마다 조회수 올리기
	public abstract int UpdateDiet_Recipe_View(Diet d);
	
	// 메인 페이지에서 검색했을경우 총 검색 결과수
	public abstract int getDiet_Recipe_TotalCount(Diet d);
	
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 
	public abstract List<Diet> getDiet_Recipe_Foodall(Diet d);
	
	// 메인 페이지에서 전체중 foodall 검색했을경우 + << , >> 클릭시 이동하는 페이지
	public abstract List<Diet> getDiet_Recipe_Foodall_1page();
	public abstract List<Diet> getDiet_Recipe_Foodall_6page();
	public abstract List<Diet> getDiet_Recipe_Foodall_11page();
	public abstract List<Diet> getDiet_Recipe_Foodall_16page();
	public abstract List<Diet> getDiet_Recipe_Foodall_21page();
	public abstract List<Diet> getDiet_Recipe_Foodall_26page();
	public abstract List<Diet> getDiet_Recipe_Foodall_31page();
	public abstract List<Diet> getDiet_Recipe_Foodall_36page();
	public abstract List<Diet> getDiet_Recipe_Foodall_41page();
	public abstract List<Diet> getDiet_Recipe_Foodall_46page();
	public abstract List<Diet> getDiet_Recipe_Foodall_51page();
	public abstract List<Diet> getDiet_Recipe_Foodall_56page();
	
	
	//메인 페이지에서 전체중 food level(1) 를 검색했을경우
	public abstract List<Diet> getDiet_Recipe_Foodlevel1(Diet d);
	
	//메인 페이지에서 전체중 food level(1) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel1_1page();
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel1_6page();
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel1_11page();
	
	
	
	
	//메인 페이지에서 전체중 food level(2) 를 검색했을경우 번호별페이지
	public abstract List<Diet> getDiet_Recipe_Foodlevel2(Diet d);
	
	//메인 페이지에서 전체중 food level(2) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel2_1page();
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel2_6page();
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel2_11page();
	
	
	
	
	//메인 페이지에서 전체중 food level(3) 를 검색했을경우 번호별페이지
	public abstract List<Diet> getDiet_Recipe_Foodlevel3(Diet d);
	
	//메인 페이지에서 전체중 food level(3) 를 검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel3_1page();
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel3_6page();
	public abstract List<Diet> getDiet_Recipe_Foodall_foodlevel3_11page();
	
	
	
	
	
	
	//메인 페이지에서 전체중 제목을  검색했을경우 번호별페이지
	public abstract List<Diet> getDiet_Recipe_all_Search_name(Diet d);
	
	//메인 페이지에서 전체중  제목을  검색했을경우  << , >> 클릭시 이동하는 페이지
	public abstract List<Diet> getDiet_Recipe_all_Search_name_1page(Diet d);
	public abstract List<Diet> getDiet_Recipe_all_Search_name_6page(Diet d);
	public abstract List<Diet> getDiet_Recipe_all_Search_name_11page(Diet d);
	
	
	
	// 메인 페이지에서 전체중 제목을  검색했을경우 몇개인지 카운트
	public abstract int getDiet_Recipe_all_Search_name_Count(Diet d);


	
	
}
