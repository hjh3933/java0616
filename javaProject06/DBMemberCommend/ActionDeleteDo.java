package org.java.DBMemberCommend;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionDeleteDo implements ActionCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ��Ż��");
		
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.deleteDo();
		System.out.println("ȸ��Ż���� : "+result);
	}

}
