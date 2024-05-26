package com.lee.project.Season;

import java.util.List;

public interface Season_Mapper {
	public abstract List<Season> getRecipesBySeason(String season);
  
	public abstract List<Season> getSeason_Recipe_Mainimage(Season season);
	public abstract List<Season> getSeason_Recipe_introduce(Season season);
	public abstract List<Season> getSeason_Recipe_ingredient(Season season);
	public abstract List<Season> getSeason_Recipe_seqence(Season season);
  
	public abstract int UpdateSeason_Recipe_View(Season season);

}