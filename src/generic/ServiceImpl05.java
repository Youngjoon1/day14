package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl05 implements Service05 {
	private ArrayList<DTO05> member;
	public ServiceImpl05() {
		member = new ArrayList<>();
	}
	
	public int registor(String n, String s) {
		DTO05 dto = new DTO05();
		dto.setName(n);
		dto.setAddr(s);
		member.add(dto);
		/*
		 * if문을 통해서 저장이 잘 되면 1을 돌려주고
		 * 실패하면 0으로 돌려준다.
		 */
		return 1;
	}
	
	
	public void display() {
		
		
		System.out.println("===회원 관리===");
		Scanner sc = new Scanner(System.in);
		int num, result= 0;
		String name = null, addr = null;
		while(true) {
			System.out.println("1. 회원 저장");
			System.out.println("2. 모든 회원 보기");
			System.out.println("3. main 이동");
			num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("이름 입력 : ");
				name = sc.next();
				System.out.println("주소 입력 : ");
				addr = sc.next();
				
				result = registor(name ,addr);
				break;
			case 2 :
				memberview();
				break;
			case 3 :
				return;
			}
			
		}
	}
	public void memberview() {
		System.out.println("=======");
		System.out.println("이름\t주소");
		System.out.println("=======");
		for(int i = 0; i < member.size(); i++) {
			DTO05 dto = member.get(i);
			System.out.println(dto.getName() + dto.getAddr());
		}
	}
	
}
