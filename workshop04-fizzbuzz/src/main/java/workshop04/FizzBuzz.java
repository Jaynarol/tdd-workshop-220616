package workshop04;

public class FizzBuzz {

	public String getResult(int number) {
		
		String result = String.valueOf(number);
		Elements[] elements = ElementsFactory.create();

		for (Elements ele : elements) {
			if( ele.isValid(number) ){
				result = ele.getResult(number);
			}
		}
		
		return result;
	}

}
