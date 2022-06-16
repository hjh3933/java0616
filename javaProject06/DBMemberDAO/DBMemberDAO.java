package org.java.DBMemberDAO;

import java.util.ArrayList;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemberDAO {
	
//	private static final DBMemberDAO INSTANCE = new DBMemberDAO(); 
//	private DBMemberDAO() {};
//	public static DBMemberDAO getInstance() {
//		return INSTANCE;
//	} 싱글톤
	
	public DBMemberDAO() {
		System.out.println("DAO생성자");
	}
	
	//CRUD, DB(Data) Access Object-> DAO
	
	public int insertDo() {
		int result = 0;
		//회원 가입 실행
		return result;
	}
	public ArrayList<DBMemberDTO> list() {
		ArrayList<DBMemberDTO> lists = new ArrayList<DBMemberDTO>();
		//회원 조회 실행
		return lists;
	}
	public int updateDo() {
		int result = 0;
		//회원 수정 실행
		return result;
	}
	public int deleteDo() {
		int result = 0;
		//회원 탈퇴 실행
		return result;
	}
	
	
}
