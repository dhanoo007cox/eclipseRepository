package gitHubPackage;
/**
 * Represent the traditional for loop and addition
 */
public class A {
	int data[] = {3, 5, 7};
	public void display(){
		System.out.println("I'm in class A");
	}
	
	public void m1(){
		System.out.println("This is method m1. And array contains:");
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			sum += i;
		}
		System.out.println("Sum is " + sum);
	}
}