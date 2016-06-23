package workshop04;

public class WowElement implements Elements {

	public String getResult(int number) {
		return "Wow";
	}

	public boolean isValid(int number) {
		return number%7 == 0;
	}

}
