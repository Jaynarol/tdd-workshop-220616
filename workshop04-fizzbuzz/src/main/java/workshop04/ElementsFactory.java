package workshop04;

public class ElementsFactory {

	public static Elements[] create() {
		Elements[] eles = {
			new FizzBuzzElement(), 
			new FizzElement(), 
			new BuzzElement(), 
			new WowElement()
		};
		return eles;
	}

}
