package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		// Your code goes here
		double deno = 1.0;
		double calc = 0.0;
		int len = Integer.parseInt(args[0]);
		for (int i=1; i<=len; i++){
			if(i % 2 == 0) {
				calc -= (1 / deno);
			}
			else {
				calc += (1 / deno);
			}
			deno += 2;
		}
		piEstimation = 4 * calc;
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}
}
