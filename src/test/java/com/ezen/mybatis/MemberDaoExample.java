package com.ezen.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ezen.mybatis.domain.employee.dto.Employee;
import com.ezen.mybatis.domain.employee.dto.Member;
import com.ezen.mybatis.domain.employee.mapper.EmployeeMapper;
import com.ezen.mybatis.domain.employee.mapper.MemberDao;


public class MemberDaoExample {
	
	//private static final String namespace = "com.ezen.mybatis.domain.employee.mapper.EmployeeMapper"; Mapper인터페이스일땐 필요없는 코드
	
	/**
	 * 자바 애플리케이션 Mybatis사용 예제
	 * @param args
	 */
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		// 트랜잭션 Auto Commit
		//SqlSession sqlSession = sqlSessionFactory.openSession(true); //true는 auto 커밋
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
	
		
		System.out.println("==================== sqlSession 생성 완료 ====================");
		
		System.out.println("==================== 전체사원 조회 ========================");
//		List<Employee> employeeList = sqlSession.selectList(namespace + ".findAll");
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class); //내가지정한인터페이스타입만지정해주면 Mybatis가 알아서 구현체만들어서 return해줌 받을땐 지정인터페이스로..
	
		List<Member> memberList= memberDao.findAll(); //Dao안쓰고 Mapper권장,구현체 만들필요없어서 좋음
		for (Member member : memberList) {
			System.out.println(member);
		}
//		
//		System.out.println("==================== 사원번호로 사원조회 ========================");
//		int id = 200;
//		Employee employee = employeeMapper.findById(id);
//		System.out.println(employee);
//		
	}
	
}











