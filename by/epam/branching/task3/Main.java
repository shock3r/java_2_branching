package by.epam.branching.task3;
public class Main {

	public static void main(String[] args) {
		
		//1.  3. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������
		
		int x1 = 1;
		int y1 = 1;
		
		int x2 = 2;
		int y2 = 2;
		
		int x3 = 3;
		int y3 = 3;
		
		if ((x3-x1)*(y2-y1) == (x2-x1)*(y3-y1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

	}

}
