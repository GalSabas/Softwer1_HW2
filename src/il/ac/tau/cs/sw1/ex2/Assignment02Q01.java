package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q01 {

	public static void main(String[] args) {
		// Your code goes here
		int toascii;
		char ch;
		for (String st: args) {
			ch = st.charAt(0);
			toascii = (int)ch;
			if(toascii % 3 == 0 && toascii % 2 == 0) {
				System.out.println(ch);
			}
		}
	}
}