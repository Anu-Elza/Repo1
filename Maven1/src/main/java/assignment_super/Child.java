package assignment_super;

public class Child extends Parent {
	public void divide() {
		super.add(10, 25);
		int d = sum % 10;
		if (d == 0) {
			System.out.println("The number is divisible by 10");
		} else {
			System.out.println("The number is not divisible by 10");
		}

	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.divide();
		System.out.println(obj.newAdd());

		// TODO Auto-generated method stub

	}

}