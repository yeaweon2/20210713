package co.java.cyw;

public class MainApp {
	public static void main(String[] args) {
//		HelloJava helloJava = new HelloJava(); // class를 생성, 인스턴스 한개를 생성
//		helloJava.setStr("안녕하세요");			// Setter
//		helloJava.toString();
//		System.out.println(helloJava.getStr() + " ==="); // Getter

//		IfTest ifTest = new IfTest(); // 사용할 클래스를 초기화 한다. ( 인스턴스 한개 생성 )
//		HelloJava helloJava = new HelloJava("이프 연습인가요?");
//
//		ifTest.simpleIf();		
//		helloJava.toString();		
//		ifTest.ifElseTest();
//		ifTest.ifElseIf();
		
//		ForTest forTest = new ForTest();
		
//		forTest.singleFor();
//		forTest.doubleFor();
//		forTest.forEach();
		
		MenuTest mainMenu = new MenuTest();
		mainMenu.run();
	}
}
