
public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("헬로우 자바");
		
		// 한줄 주석문
		
		/*
		 
		 범위주석문
		 
		 html <!-- -->
		 jsp <%-- --%>
		 mySQL --
		 python # """ 주석문 """
		 
		 */
		
		System.out.println("Hello World");
		
		System.out.print("Hello"); //print- 개행안함
		System.out.print("월드");
		
		// 기능 : escape sequence - 탈출 질의 , 기호를 써서 개행 가능
		
		// \n : 개행 , \b(backspace) : 한칸 앞으로, \"(따옴표 출력), \t(뛰어쓰기), \\
		
		System.out.print("World\n");
		System.out.print("헬로우");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello\tWorld");
		System.out.println("\t월드\t헬로우");
		
		System.out.println("\\헬로우월드\\");
		
		System.out.printf("--%s-- \n", "Hello");   //f : 포멧의 약자 , Hello == 문자열(String)
		// printf(표현 자료형 , 값) , 자주 사용되진 않음. 
		
		System.out.println( 1024 );
		
		System.out.print("Hello" + "World");
		
	}

}
