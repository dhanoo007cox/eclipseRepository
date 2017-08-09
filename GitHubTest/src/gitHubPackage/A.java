package gitHubPackage;
/**
 * Represent the traditional for loop and addition
 */
public class A {
	int data[] = {-1, 3, 5, 7, 45};
	public void display(){
		System.out.println("I'm in class A\n");
	}
	
	public void m1(){
		System.out.println("This is method m1. And array contains:");
		int sum = 0;
		
		for (int a : data) {
			System.out.print( a + " ");
			sum += a;
		}
		System.out.println("\n");
		System.out.println("Sum is " + sum);
	}
}