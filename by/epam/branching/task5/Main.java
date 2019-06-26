package by.epam.branching.task5;

import java.util.Scanner;

public class Main {
	
	//4. ��������� �������� �������:
	
	private static double calculateExpression (Double i) {
		
		if (i<=3) {
			
			return Math.pow(i, 2) - 3*i + 9;
			
		} if (i > 3) {
			
			return 1/(Math.pow(i, 3) + 6);
			
		} else {
			
			return 0;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("������� �����:");
		
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
		
		Double result = Main.calculateExpression(i);
		System.out.printf("��� ����� %.0f �������� ������� �����:%f  \n", i, result);
			
	}

}
