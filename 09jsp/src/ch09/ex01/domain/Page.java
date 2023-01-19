package ch09.ex01.domain;

public class Page {
	protected int currentPage; // 현재 페이지
	private int rowCnt; // 글 개수, 화면
	
	public Page(){
		this(1, 10);
	}
	
	public Page(int currentPage){
		this(currentPage, 10);
	}

	public Page(int currentPage, int rowCnt) {
		this.currentPage = currentPage;
		this.rowCnt = rowCnt;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRowCnt() {
		return rowCnt;
	}

	public void setRowCnt(int rowCnt) {
		this.rowCnt = rowCnt;
	}	
}
