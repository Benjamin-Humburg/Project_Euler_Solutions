/*
Problem Query:

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/

package ProjectEuler;

public class Solutions {
	
	public static void main(String[] args) {
		
		
		final int multiple1 = 3;
		final int multiple2 = 5;
		final int belowThis = 1000;
		
		System.out.println("Solution is: " + sumOfAUB(3, 5, 1000));
		
	}
	
	// It is important to note that this function only works for two multiples that are relatively prime.
	public static int sumOfAUB(int multiple1, int multiple2, int belowThis) {
		
		int numMult1 = (int) (Math.ceil((double) belowThis / (double) multiple1) - 1);
		int numMult2 = (int) (Math.ceil((double) belowThis / (double) multiple2) - 1);
		int numMultIntersection = (int) (Math.ceil((double) belowThis / ((double) multiple1 * (double) multiple2)) - 1);
		
		int sumOfMults1 = multiple1 * sumOfFirstNNaturals(numMult1);
		int sumOfMults2 = multiple2 * sumOfFirstNNaturals(numMult2);
		int sumOfInters = (multiple1 * multiple2) * sumOfFirstNNaturals(numMultIntersection);
		
		return sumOfMults1 + sumOfMults2 - sumOfInters;
	}
	
	public static int sumOfFirstNNaturals(int n) {
		
		return (n * (n + 1)) / 2;
	}
}
