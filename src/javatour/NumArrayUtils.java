/**
 * Code from <a href="https://bit.ly/javatourbook">Quick Tour of Java Booklet</a>.
 * @author bguan
 * @see <a href="https://github.com/bguan/javatour_ex1/blob/main/LICENSE">Creative Common License</a>
 */
package javatour;

public class NumArrayUtils {

	// TODO: write code to check if a1 equals a2
	static boolean equals(double[] a1, double[] a2) {
		return false;
	}

	// TODO: write code to sum all values in a
	static double sum(double[] a) {
		return 0.0;
	}

	// TODO: write code to compute average of values in a
	static double average(double[] a) {
		return 0.0;
	}

	public static void main(String[] args) {
		double[] w = { 1.0, 2.0, 3.0 };
		double[] x = { 1.0, 2.0, 3.0 };
		double[] y = { 1.0, -2.0, 3.0 };
		double[] z = { 1.0, 2.0, 3.0, 4.0 };

		System.out.println(equals(w, x)); // true
		System.out.println(equals(x, y)); // false
		System.out.println(equals(x, z)); // false

		System.out.println(sum(w)); // 6.0
		System.out.println(average(z)); // 2.5
	}
}
