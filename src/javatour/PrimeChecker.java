/**
 * Code from <a href="https://bit.ly/javatourbook">Quick Tour of Java Booklet</a>.
 * @author bguan
 * @see <a href="https://github.com/bguan/javatour_ex1/blob/main/LICENSE">Creative Common License</a>
 */
package javatour;

/**
 * Main class for Exercise 1.
 */
public class PrimeChecker {

    // TODO: write your code to check for prime
    static boolean isPrime(int num) {
        // simplest idea: 
        // false if num <= 1, true if num == 2, 
        // test every number from 2 to num/2
        // if any divides num with no remainder returns false
        // otherwise num must be Prime!!!
        return false;
    } 

    public static void main(String[] args) {
        System.out.println(isPrime(-1));  // false
        System.out.println(isPrime(0));   // false
        System.out.println(isPrime(1));   // false
        System.out.println(isPrime(2));   // true
        System.out.println(isPrime(9));   // false
        System.out.println(isPrime(11));  // true
        System.out.println(isPrime(999)); // false
        System.out.println(isPrime(869609999)); // HARD!
    }
}