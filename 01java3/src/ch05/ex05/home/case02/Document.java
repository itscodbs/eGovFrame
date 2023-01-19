package ch05.ex05.home.case02;

import java.time.LocalDate;

public class Document {
	private String title;
	private String content;	
	private LocalDate regDate;
	private int pageNum;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public String toString() {
		return String.format("제 목 : %s\n내 용 : %s\n작성일 : %s\n페이지 : %d\n", title, content, regDate, pageNum);
	}
}
