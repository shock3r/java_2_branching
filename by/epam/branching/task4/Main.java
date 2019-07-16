package by.epam.branching.task4;
public class Main {
	
	//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие
		
	/*
	 * @return true of false. find out if one side of the brick will pass through the hole
	 */
	public static boolean willPassThroughtThehole(int holeX, int holeY,
			                                  int brickX, int brickY) {
		
		if (((brickX <= holeX) && (brickY <= holeY))
				|| ((brickX <= holeY)) && (brickY <= holeX)) {
			return true;	
		} else {
			return false;	
		}	
	}
	
	/*
	 * @return true of false.Find if brick can go throung the hole
	 */
	public static boolean willBrickPass(boolean passXY, boolean passXZ, boolean passYZ) {
		
		if (passXY || passXZ || passYZ) {
			
			return true;
			
		} else {
			
			return false;
		
		}
			
	}
	
	public static void main(String[] args) {
		
		int a = 5; // hole x
		int b = 3; // hole y 	
		
		int x = 100; // brick x
		int y = 1; // brick y
		int z = 5; // brick z
		
		boolean passXY = Main.willPassThroughtThehole(a, b, x, y);
		boolean passXZ = Main.willPassThroughtThehole(a, b, x, z);
		boolean passYZ = Main.willPassThroughtThehole(a, b, y, z);
		
		boolean brickPassThroungTheHole = Main.willBrickPass(passXY, passXZ, passYZ);
		
		System.out.println(brickPassThroungTheHole);
		
	}
}
