package ch05.ex05.home.case02;

import java.time.LocalDate;

public class Document {
	public String title;
	public String content;
	public LocalDate creationDate;
	public int pageNum;
	
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
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String toString() {
		return String.format("제 목 : %s\n내 용 : %s\n작성일 : %s\n페이지 : %d\n", title, content, creationDate, pageNum);
	}
}
