package assignment_encapsulation;

public class Pgm1 {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void getPin() {
		if (this.pin == 1001) {
			System.out.println("valid pin 1001");
		} else if (this.pin == 1234) {
			System.out.println("valid pin 1234");

		} else if (this.pin == 1212) {
			System.out.println("valid pin 1212");

		} else {
			System.out.println("invalid pin");

		}

	}

}
