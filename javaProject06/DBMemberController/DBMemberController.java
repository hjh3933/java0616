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
		//다형성 활용해보기 - interface타입으로 자식객체불러오기
		
		while (true) {
			System.out.println("쿼리문을 입력하세요 insert, select, update, delete");
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
				//부모클래스의 멤버필드와 재정의되렀을 경우 오버라이딩된 메서드 사용함!
			} else if (query.equals("exit")) {
				break;
			} else {
				System.out.println("쿼리문 오류");
			}
		}
		
		scn.close();
		
		
	}
}
