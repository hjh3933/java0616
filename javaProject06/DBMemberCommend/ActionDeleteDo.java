package org.java.DBMemberCommend;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionDeleteDo implements ActionCommend {

	@Override
	public void excuteQuery() {
		System.out.println("È¸¿øÅ»Åð");
		
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.deleteDo();
		System.out.println("È¸¿øÅ»Åð°á°ú : "+result);
	}

}
