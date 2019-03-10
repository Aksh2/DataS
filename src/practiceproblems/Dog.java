package practiceproblems;

public  class Dog {
	public String name;


public static void main(String[] args) {
	Dog dog = new Dog();
	dog.name = "Max";
	foo(dog);
	System.out.println(dog.name.equals("Fifi"));
}

public static void foo(Dog d) {
	d.name="Fifi";
}
}
