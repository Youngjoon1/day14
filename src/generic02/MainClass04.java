package generic02;

import java.util.ArrayList;

class Test04{
	private String name, addr;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getAddr() { return addr; }
	public void setAddr(String addr) { this.addr = addr; }
}
public class MainClass04 {
public static void main(String[] args) {
	Test04 t01 = new Test04();
	t01.setName("홍길동"); t01.setAddr("산골짜기");
	
	Test04 t02 = new Test04();
	t02.setName("김개똥"); t02.setAddr("개똥별");
	
	ArrayList< Test04 >arr = new ArrayList<>();
	arr.add( t01 );
	arr.add( t02 );
	
	System.out.println("t01 : "+ t01 );
	System.out.println("arr.get(0) : "+ arr.get(0) );
	
	System.out.println( t01.getName() );
	System.out.println( arr.get(0).getName() );
	
	System.out.println("--------------");
	Test04 t = arr.get(1);
	System.out.println("t02 : "+t02);
	System.out.println("t : "+t);
	System.out.println( t02.getName() );
	System.out.println( t.getName() );
}
}





































