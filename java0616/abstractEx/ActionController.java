package org.java.abstractEx;

import java.util.Scanner;

public class ActionController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ActionCommend action = null;// ������

		System.out.println("�������� �Է��ϼ���");
		String input = scn.next();

		if (input.equals("insert")) {
			action = new ActionInsertDo();
			action.excuteQuery();
		} else if (input.equals("select")) {
			action = new ActionSelectDo();
			action.excuteQuery();
		} else if (input.equals("update")) {
			action = new ActionUpdateDo();
			action.excuteQuery();
		} else if (input.equals("delete")) {
			action = new ActionDeleteDo();
			action.excuteQuery();
		}
		
		scn.close();
	}

}
