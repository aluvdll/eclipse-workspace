//si que compila
//*Vicente Devesa Llorens

package practica_p4_3;

public class XCopy {
	public static void main(String[] args) {
		int orig = 24;
		XCopy x = new XCopy();
		int y = x.go(orig);
		System.out.println(orig+" "+y);
	}
	
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
	
}
