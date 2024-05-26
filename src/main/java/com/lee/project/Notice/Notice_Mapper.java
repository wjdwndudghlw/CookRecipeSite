package com.lee.project.Notice;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface Notice_Mapper {
    public abstract List<Notice> getNotice();
    public abstract List<Notice> getManager();


    public abstract Notice getNoticePage(Integer noticeNo);
    public abstract Notice getManagerPage(Integer m_no);


    
    public abstract List<Notice> getBoardPaging(int start, int end);

    public abstract List<Notice> getNoticePaging(int start, int end);
    
    public abstract List<Notice> getManagerPaging(int start, int end);

    
    public abstract int board_view(Notice notice);
    public abstract int board_write(Notice notice);
    public abstract int board_delete(Notice notice);  


    public abstract int WriteManager(Notice notice);


}