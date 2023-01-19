package ch09.ex01.service;

import ch09.ex01.domain.Page;

public interface PageService {
	Page getPage();
	boolean isPrev();
	boolean isNext();
	int getStartPage();
	int getEndPage();
}
