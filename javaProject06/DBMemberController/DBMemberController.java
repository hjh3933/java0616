package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberCommend.ActionCommend;
import org.java.DBMemberCommend.ActionDeleteDo;
import org.java.DBMemberCommend.ActionInsertDo;
import org.java.DBMemberCommend.ActionSelectDo;
import org.java.DBMemberCommend.ActionUpdateDo;

public class DBMemberController {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		ActionCommend commend=null;
		//������ Ȱ���غ��� - interfaceŸ������ �ڽİ�ü�ҷ�����
		
		while (true) {
			System.out.println("�������� �Է��ϼ��� insert, select, update, delete");
			String query = scn.next();

			if (query.equals("insert")) {
				commend = new ActionInsertDo();
				commend.excuteQuery();
			} else if (query.equals("select")) {
				commend = new ActionSelectDo();
				commend.excuteQuery();
			} else if (query.equals("update")) {
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			} else if (query.equals("delete")) {
				commend = new ActionDeleteDo();
				commend.excuteQuery();
				//�θ�Ŭ������ ����ʵ�� �����ǵǷ��� ��� �������̵��� �޼��� �����!
			} else if (query.equals("exit")) {
				break;
			} else {
				System.out.println("������ ����");
			}
		}
		
		scn.close();
		
		
	}
}
