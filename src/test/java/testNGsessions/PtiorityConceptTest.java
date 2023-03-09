package testNGsessions;

import org.testng.annotations.Test;

public class PtiorityConceptTest {
	
//if we add priority with -ve,0,+ve and non priority test together
//then order of execution will be -ve >(0/non-priority[default value is zero] test in alphabetical order )> +ve test
//>same priority added for multiple test then execution will be alphabetical order
	
	@Test(priority= 2)
	public void a_Test() {
		System.out.println("a test");
	}
	

	@Test(priority= -1)
	public void b_Test() {
		System.out.println("b test");
	}

	@Test
	public void c_Test() {
		System.out.println("c test");
	}

	@Test(priority= 0)
	public void d_Test() {
		System.out.println("d test");
	}

	@Test(priority= 1)
	public void e_Test() {
		System.out.println("e test");
	}

}
