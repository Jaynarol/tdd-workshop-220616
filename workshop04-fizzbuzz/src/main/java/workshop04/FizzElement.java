package workshop04;

public class FizzElement implements Elements {
	
	public String getResult(int number){
		return "Fizz";
	}

	public boolean isValid(int number) {
		return number%3 == 0 && number%5 != 0;
	}
}
