package com.lee.project.Notice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NoticeController {

	@Autowired
	private NoticeDAO NoticeDAO;

	@Autowired
	private SqlSession ss;

	@RequestMapping(value = "/board{page}", method = RequestMethod.GET)
	public String getBoardPaging(@PathVariable int page, Model model) {
		int start = page * 15 - 14;
		int end = page * 15;
		System.out.println("여기까지 성공");
		List<Notice> DetailNotice = NoticeDAO.getNotice();
		List<Notice> DetailNoticePage = NoticeDAO.getNoticePaging(start, end);
		int totalPage = (int) Math.ceil(DetailNotice.size() / 5);
		model.addAttribute("DetailNotice", DetailNotice);
		model.addAttribute("DetailNoticepage", DetailNoticePage);
		model.addAttribute("page", page);
		model.addAttribute("totalPage", totalPage);

		return "mainBoard";

	}
	@RequestMapping(value = "/notice{page}", method = RequestMethod.GET)
	public String getNoticePaging(@PathVariable int page, Model model) {
		int start = page * 5 - 4;
		int end = page * 5;

		List<Notice> DetailManager = NoticeDAO.getManager();
		List<Notice> DetailManagerPage = NoticeDAO.getManagerPaging(start, end);
		int totalPage = (int) Math.ceil(DetailManager.size() / 5);
		model.addAttribute("DetailManager", DetailManager);
		model.addAttribute("DetailManagerpage", DetailManagerPage);
		model.addAttribute("page", page);
		model.addAttribute("totalPage", totalPage);

		return "notice";
	}
	
	
	

	@RequestMapping(value = "/Notice/{noticeNo}", method = RequestMethod.GET)
	public String getNoticePage(@PathVariable("noticeNo") Integer noticeNo, Model model) {
		Notice Notice = ss.selectOne("getNoticePage", noticeNo);
		List<Comment> comments = NoticeDAO.getComment(noticeNo);
		model.addAttribute("notices", Notice);
		model.addAttribute("comment", comments);
		model.addAttribute("noticeNo", noticeNo);
		return "NoticeDetail";
	}

	// 게시판 에서 글쓰기 버튼 클릭시
	@RequestMapping(value = "WriteBoard", method = RequestMethod.GET)
	public String WriteBoard(Model model) {
		// model.addAttribute("cp", "WriteBoard.jsp");
		return "WriteBoard";
	}

	// 게시판 에서 글쓰기 버튼 클릭시
	@RequestMapping(value = "WrtieBoard_Action", method = RequestMethod.GET)
	public void WrtieBoard_Action(Notice notice, Model model,HttpServletResponse res) {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter script;
		try {
			script = res.getWriter();
			NoticeDAO.WrtieBoard_Action(notice);
			script.println("<script>");
			script.println("alert('게시글 작성 완료')");
			script.println("location.href='http://localhost/project/board1'");
			script.println("</script>");
			script.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 게시판 삭제
	@RequestMapping(value = "board_delete", method = RequestMethod.GET)
	public void board_delete(Notice notice, Model model, HttpServletResponse res) {
		try {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter script = res.getWriter();
			NoticeDAO.board_delete(notice);
				script.println("<script>");
				script.println("alert('게시글 삭제 완료')");
				script.println("location.href='http://localhost/project/board1'");
				script.println("</script>");
				script.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 관리자 게시판 작성
	@RequestMapping(value = "WrtieManager_Action", method = RequestMethod.GET)
	public void WriteManager(Notice notice, Model model, HttpServletResponse res) {
		try {
			
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter script = res.getWriter();
			NoticeDAO.WriteManager_Action(notice);
			script.println("<script>");
			script.println("alert('공지글 작성 완료')");
			script.println("location.href='http://localhost/project/notice1'");
			script.println("</script>");
			script.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
