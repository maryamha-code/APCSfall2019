*/*Maryam Hassan
  * August 29, 2019
  * Period 4
  *Group of methods that perform math calculations
*/
public class Calculate {
	public static int square(int number) {
		return number*number;
	}

	public static int cube(int number) {
		return number*number;
	}
	
	public static double average(double a, double b) {
		return (a+b)/2;
	}
	
	public static double average(double a, double b, double c) {
		return (a+b+c/3);
	}
	
	public static double toDegrees(double angle) {
		return (angle*180)/3.14159;
	}
	
	public static double toRadians(double angle) {
		return (angle*3.14159)/180;
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b*b-4*a*c);
	}
	
	public static String toImproperFrac(int a, int b, int c) {
		int d=(a*c+b);
		return d +"/"+ c;
	}
	
	public static int toMixedNum(int a, int b) {
		int c=a/b;
		int d=a%b;
		return c+"_"+d+ "/"+b;
	}
	
	public static int foil(int a, int b, int c, int d, String "n") {
		int e = a*c;
		int f = a*d+b*c;
		int g = b*d;
		return e+"n"+"^"+"2"+f+"n"+g;	
	}
	
	