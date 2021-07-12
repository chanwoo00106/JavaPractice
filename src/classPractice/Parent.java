package classPractice;

public class Parent {
	//Field
	String name;
	int age;
	
	//Constructor
	public Parent(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	//Method
	public void printName(){
		System.out.println(this.name);
	}
	public void printAge() {
		System.out.println(this.age);
	}
	public void sayHello() {
		System.out.println("Hello " + this.name + "!");
	}
}
