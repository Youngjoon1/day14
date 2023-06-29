package generic02;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		Service05 mem = new ServiceImpl05();
		while(true) {
			System.out.println("1.회원관리");
			System.out.println("2.종료");
			num = input.nextInt();
			switch( num ) {
			case 1: 
				mem.display();
				break;
			case 2: return;
			}
		}
	}
}














