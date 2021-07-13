package co.java.cyw;

import java.util.Scanner;

public class MenuTest {
	private Scanner sc = new Scanner(System.in);
	
	private void menuTitle() {
		System.out.println("=====================");
		System.out.println("===[ 학생관리 시스템 ]===");
		System.out.println("==== 1.학생목록조회 ====");
		System.out.println("==== 2.학생정보조회 ====");
		System.out.println("==== 3.학생정보등록 ====");
		System.out.println("==== 4.학생정보수정 ====");
		System.out.println("==== 5.학생정보삭제 ====");
		System.out.println("==== 6.시스템 종료 ====");
		System.out.println("=====================");
		System.out.print("원하는 작업을 입력하세요 > ");
		
	}
	
	private void menuRun() {
		boolean b = true;
		int choice;
		
		do {
			menuTitle();
			switch(choice = sc.nextInt()) {
				case 1 :
					studentSelectList();
					break;
				case 2 :
					studentSelect();
					break;
				case 3 :
					studentInsert();
					break;
				case 4 :
					studentUpdate();
					break;
				case 5 :
					studentDelete();
					break;
				case 6 :
					System.out.println("시스템을 종료합니다.");
					b = false;
					break;			
			}
		}while(b);
		
	}

	private void studentSelectList() {
		// 학생전체목록조회
		System.out.println("학생 전체목록입니다.");	
	}

	private void studentSelect() {
		// 학생 한명 정보조회
		System.out.print("검색할 학생의 학번을 입력 > ");
		String id= sc.next();
		System.out.println("[ " + id + " ] 님의 정보를 조회했습니다.");
	}

	private void studentInsert() {
		// 새로운 학생 추가
		String id;
		int age;
		String name;
		
		System.out.print("추가할 학생의 학번 입력 > ");
		id = sc.next(); sc.nextLine();
		System.out.print("추가할 학생의 이름 입력 > ");
		name = sc.next(); sc.nextLine();
		System.out.print("추가할 학생의 나이 입력 > ");
		age = sc.nextInt(); sc.nextLine();
		
		System.out.println("[ " + id + " : " + name + " : " + age + " ] 정보를 입력하였습니다." );		
	}

	private void studentUpdate() {
		// 학생 정보 수정
		studentSelect(); // 정보조회 후
		// 수정할 정보 입력
		
		System.out.println("홍길동군의 정보를 수정했습니다.");
	}

	private void studentDelete() {
		// 학생 정보 삭제
		System.out.print("삭제할 학생의 학번 입력 > ");
		String id = sc.next(); sc.nextLine();
		
		System.out.println( "[ " + id + " ] 정보를 삭제했습니다.");		
	}
	
	public void run() {
		menuRun();
		sc.close();
	}
}
