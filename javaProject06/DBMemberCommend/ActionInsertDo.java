package org.java.DBMemberCommend;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionInsertDo implements ActionCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원가입");
		
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.insertDo();
		System.out.println("회원가입결과 : "+result);
	}

}
