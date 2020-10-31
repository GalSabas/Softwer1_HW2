package il.ac.tau.cs.sw1.ex2;

import java.util.Arrays;

public class Assignment02Q03 {

	public static void main(String[] args) {
		int numOfEven = 0;
		int n = -1;
		// Your code goes here
		n = Integer.parseInt(args[0]);
		int[] FibNum = new int[n];
		FibNum[0] = 1;
		FibNum[1] = 1;
		for (int i=2; i<n; i++) {
			FibNum[i] = FibNum[i-1] + FibNum[i-2];
			if(FibNum[i] % 2 == 0) {
				numOfEven += 1;
			}
		}
		System.out.println("The first "+ n +" Fibonacci numbers are:");
		System.out.println(ArrayToString(FibNum));
		System.out.println("The number of even numbers is: "+numOfEven);

	}
	
	public static String ArrayToString(int[] Fib) {
		String ArrToSt = (Arrays.toString(Fib)).replace(",", "");
		String ArrToStFinal = ArrToSt.substring(1, ArrToSt.length()-1);
		return(ArrToStFinal);
	}

}