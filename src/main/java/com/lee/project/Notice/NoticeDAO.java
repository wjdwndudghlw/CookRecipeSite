package com.lee.project.Notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession ss;

	public List<Notice> getNotice() {
		return ss.selectList("getNotice");
	}
	
	public List<Notice> getManager() {
		return ss.selectList("getManager");
	}
	
	
	
	public Notice getNoticePage(Integer notice_no) {
		return ss.selectOne("getNotice", notice_no);
	}
	
	
	
	public Notice getManagerPage(Integer m_no) {
		return ss.selectOne("getManager", m_no);
	}
	
	
	
	
	
	
	
	public List<Notice> getBoardPaging(int start, int end) {
		return ss.selectList("getBoardPaging", new Page(start, end));
	}
	
	public List<Notice> getNoticePaging(int start, int end) {
		return ss.selectList("getNoticePaging", new Page(start, end));
	}
	public List<Notice> getManagerPaging(int start, int end) {
		return ss.selectList("getManagerPaging", new Page(start, end));
	}
	
	
	
	
	
	
	
	
	public List<Comment> getComment(Integer noticeNo) {
		return ss.selectList("getComment", noticeNo);
	}
	
	public int WrtieBoard_Action(Notice notice) {
		return ss.getMapper(Notice_Mapper.class).board_write(notice);
	}
	
	public int WriteManager_Action(Notice notice) {
		return ss.getMapper(Notice_Mapper.class).WriteManager(notice);
	}
	
	public int board_delete(Notice notice) {
		return ss.getMapper(Notice_Mapper.class).board_delete(notice);
	}

	

	
}
