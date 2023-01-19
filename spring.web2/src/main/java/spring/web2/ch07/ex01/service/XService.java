package spring.web2.ch07.ex01.service;

import java.util.List;

public interface XService {
	int good();
	int badWithX();
	int badNoX();
	int badService();
	List<Integer> listNums();
}
