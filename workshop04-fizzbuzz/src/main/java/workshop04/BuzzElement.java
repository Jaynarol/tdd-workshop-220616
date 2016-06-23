package workshop04;

public class BuzzElement implements Elements {
	
	public String getResult(int number){
		return "Buzz";
	}

	public boolean isValid(int number) {
		return number%5 == 0 && number%3 != 0;
	}
}
