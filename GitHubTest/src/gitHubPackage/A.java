package gitHubPackage;

public class A {
	int data[] = {-1, 3, 5, 7, 45};
	public void display(){
		System.out.println("I'm in class A\n");
	}
	
	public void m1(){
		System.out.println("This is method m1... And array contains:");
		for (int a : data) {
			
			System.out.print( a + " ");
		}
		System.out.println("\n");
	}
}