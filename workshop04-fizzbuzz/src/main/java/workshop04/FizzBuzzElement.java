package workshop04;

public class FizzBuzzElement implements Elements {
	
	public String getResult(int number){
		return "FizzBuzz";
	}

	public boolean isValid(int number) {
		return number%3 == 0 && number%5 == 0;
	}
}
