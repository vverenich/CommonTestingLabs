
public class Main {

	public static void printTestResults(int a, int b, int c, String expectedResult, int numberOfFunctionCalled) {
		System.out.print("\n\tInput data     : "+ a + ", " + b + ", " + c);
		System.out.print("\n\tResult         : ");
		try {
			switch(numberOfFunctionCalled) {
			case 1:
				isVersatileTest(a,b,c);
				break;
			case 2:
				isEquilateralTest(a,b,c);
				break;
			case 3:
				isIsoscelesTest(a,b,c);
				break;
			case 4:
				createTriangleTest(a,b,c);
				break;
			}
		}
		catch(Exception ex) {
			System.out.print(ex.getMessage());
		}
		System.out.print("\n\tExpected result: " + expectedResult+"\n\n");
	}
	
	public static void isVersatileTest(int a, int b, int c) throws Exception {
		Triangle t = new Triangle(a,b,c);
		if(t.IsVersatile()) {
			System.out.print("is versatile");
		}else {
			System.out.print("is not versatile");
		}
	}
	
	public static void isEquilateralTest(int a, int b, int c) throws Exception {
		Triangle t = new Triangle(a,b,c);
		if(t.IsEquilateral()) {
			System.out.print("is equilateral");
		}else {
			System.out.print("is not equilateral");
		}
	}
	public static void isIsoscelesTest(int a, int b, int c) throws Exception {
		Triangle t = new Triangle(a,b,c);
		if(t.IsIsosceles()) {
			System.out.print("is isosceles");
		}else {
			System.out.print("is not isosceles");
		}
	}
	

	public static void createTriangleTest(int a, int b, int c) throws Exception {
		Triangle t = new Triangle(a,b,c);
		int p = t.getPerimeter();
		float s = t.getSquare();
		System.out.print("everything is OK");
	}
	
	public static void printWhiteBoxStrategyTests() {
		System.out.print("\nWhite box strategy\nTests:");
		
		System.out.print("\n1)");
		printTestResults(3,4,5,"is versatile",1);
		
		System.out.print("\n2)");
		printTestResults(3,3,3,"is equilateral",2);
		
		System.out.print("\n3)");
		printTestResults(3,3,5,"is isosceles",3);
		
		System.out.print("\n4)");
		printTestResults(5,3,3,"is isosceles",3);
		
		System.out.print("\n5)");
		printTestResults(3,5,3,"is isosceles",3);
		
		System.out.print("\n6)");
		printTestResults(0,4,5,"Sides should be positive", 4);
		
		System.out.print("\n7)");
		printTestResults(4,0,5,"Sides should be positive", 4);
		
		System.out.print("\n8)");
		printTestResults(5,4,0,"Sides should be positive", 4);
		
		System.out.print("\n9)");
		printTestResults(0,0,5,"Sides should be positive", 4);
		
		System.out.print("\n10)");
		printTestResults(0,0,0,"Sides should be positive", 4);
		
		System.out.print("\n11)");
		printTestResults(1,1,-1,"Sides should be positive", 4);
		
		System.out.print("\n12)");
		printTestResults(1,2,3,"Such a triangle does not exist", 4);
		
		System.out.print("\n13)");
		printTestResults(1,3,2,"Such a triangle does not exist", 4);
		
		System.out.print("\n14)");
		printTestResults(3,2,1,"Such a triangle does not exist", 4);
		
		System.out.print("\n15)");
		printTestResults(1,1,3,"Such a triangle does not exist", 4);
		
		System.out.print("\n16)");
		printTestResults(1,3,1,"Such a triangle does not exist", 4);
		
		System.out.print("\n17)");
		printTestResults(3,1,1,"Such a triangle does not exist", 4);
		
		System.out.print("\n15)");
		printTestResults(1,1,3,"Such a triangle does not exist", 4);
	}
	public static void printBlackBoxStrategyTests() {
		System.out.print("\nBlack box strategy\nTests:");
		
		System.out.print("\n1)");
		printTestResults(2000000000 ,2000000000,3,"Perimeter is out of Integer type", 4);
		
		System.out.print("\n2)");
		printTestResults(1000000000 ,1000000000,100000000,"everything is OK", 4);
	}
	public static void main(String[] args) {
		printWhiteBoxStrategyTests();
		printBlackBoxStrategyTests();
	}

}
