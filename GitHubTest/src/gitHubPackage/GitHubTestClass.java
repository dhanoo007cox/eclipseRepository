package gitHubPackage;

public class GitHubTestClass {
	private static void B(){
		System.out.println("I'm in method B of class GitHubTestClass");
	}
	public static void main(String[] args) {
		A a = new A();
		
		B();
		a.display();
		
		System.out.println("Test 1");
		
	}

}
