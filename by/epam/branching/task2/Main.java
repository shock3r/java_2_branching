package by.epam.branching.task2;
import static java.lang.Math.*;
public class Main {

	public static void main(String[] args) {
		
		//1.  Найти max{min(a, b), min(c, d)}.
		
		int a;
		int b;
		int c;
		int d;
		
		a = 78;
		b = 44;
		c = 96;
		d = 54;
		
		int max_ab = max(a, b);
		int min_cd = min(c, d);
		
		int z = max(max_ab, min_cd);
		
		System.out.println(z);

	}

}
