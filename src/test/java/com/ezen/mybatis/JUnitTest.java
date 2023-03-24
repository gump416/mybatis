package com.ezen.mybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.ezen.mybatis.domain.some.service.SomeServiceImpl;


public class JUnitTest {
	SomeServiceImpl service;
	
	@BeforeEach
	public void setUp() {
		service = new SomeServiceImpl();
	}
	@AfterEach
	public void destroy() {
		// 후행 작업(자원해제 등)
	}
	@Test
	public void sumTest() {
//		System.out.println(service.sum(20, 30)); 안쓰는거 권장 눈으로 봐야겠다 싶으면 쓰기
		
		Assertions.assertEquals(20, service.sum(10, 10));
		//Assert.assertEquals(20, service.sum(10, 10)); //assertEquals(expected, actual);
		//assertEquals(20, service.sum(10, 10)); //static import 활용
	}
	@Test
	//@Disabled //주석처리해서 실행중지하지말고 실행중지 어노테이션사용 권장
	public void getMessageTest() {
		assertNotNull(service); //null체크할때
		assertNotNull(service.getMessage());
	}
	
	@DisplayName("사용자 메소드명") //결과창에보여줄이름(자주쓰진않음)
	@Test
	public void test() {
		 assertEquals(10, 10);	//내가입력한값이랑 같은지 확인할때
	}
}


