package by.epam.branching.task1;

public class Main {

	public static void main(String[] args) {
		
		//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
		//он прямоугольным
		int a = 45;
		int b = 45;
		int c;
		
		c = 180 - a - b;
		
		if (c > 0) {
			
			System.out.println("Треугольник существует");
			
			if (a == 90 || b == 90 || c == 90) {
				System.out.println("Треугольник пряммоугольный");
			}
			
		} else {
			
			System.out.println("Треугольник не существует");
			
		}

	}

}
