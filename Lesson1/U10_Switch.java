package youtube.alishev;

import java.util.Scanner;

public class U10_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Введи возраст: ");
		int age = sc.nextInt();
		
		switch(age) {
			case 0:
				System.out.println("Ты родился");
				break;
			case 7:
				System.out.println("Ты пошел в школу");
				break;
			case 18:
				System.out.println("Ты закончил школу");
				break;
			default:
				System.out.println("Ни одно из условий не подошло");
		}
		
	
	}

}
