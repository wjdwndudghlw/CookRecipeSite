package com.lee.project.Notice;

import java.util.List;

public interface Comment_Mapper {

	public abstract List<Comment> getComment(Integer noticeNo);
	public abstract List<Comment> insertComment(Integer noticeNo);
	public abstract List<Comment> replyModify(Integer noticeNo);
	public abstract List<Comment> replyDelete(Integer noticeNo);
	
	
}
