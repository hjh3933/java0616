package org.java.DBMemberCommend;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionUpdateDo implements ActionCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������");
		
		DBMemberDAO dao = new DBMemberDAO();
		int result =dao.updateDo();
		System.out.println("ȸ��������� : "+result);
	}

}