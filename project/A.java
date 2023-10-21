package project;

public class A {
	void hell() {
		System.out.println("Hell");
	}
}

class B extends A {
	void hi() {
		System.out.println("Hi");
	}
}

class C extends B {
	void no() {
		System.out.println("No");
	}
}

class D extends C {
	void yes() {
		System.out.println("Yes");
	}

	public static void main(String[] args) {
		D d = new D();
		d.hell();
		d.hi();
		d.no();
		d.yes();

	}
}