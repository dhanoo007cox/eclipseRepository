package gitHubPackage;

public class GitHubTestClass {
	private static void B(){
		System.out.println("I'm in method B of class GitHubTestClass");
	}
	public static void main(String[] args) {
		A a = new A();
		
		B();
		a.display();
		a.m1();
		
		System.out.println("Test 1");
		System.out.println("Test 2");
		
	}

}
