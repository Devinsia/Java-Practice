package newpackage;
//import static staticMembers.Employee2.COMP_FOUNDATION_YEAR;
import static staticMembers.Employee2.*;

public class TestStaticImport {

	public static void main(String[] args) {
		System.out.printf("Company Foundation year: %d%n", COMP_FOUNDATION_YEAR, getCount());

		System.out.printf("Square root of 900 is %f%n", Math.sqrt(900));
	}

}

//Problem