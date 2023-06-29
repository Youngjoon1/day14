package generic;

class Test02 {
	public void sumFunc(int n1, int n2) { 
		System.out.println(n1 + "," + n2); 
	}
	public void sumFunc(String s1, String s2) { 
		System.out.println(s1 + "," + s2); 
	}
	
	

}

public class MainClass02 {

	public static void main(String[] args) {
		Test02 t = new Test02();
		t.sumFunc(100, 200);
		t.sumFunc("aaa","bbb");
		

	}

}
