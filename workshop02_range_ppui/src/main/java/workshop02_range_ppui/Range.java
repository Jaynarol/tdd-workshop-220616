package workshop02_range_ppui;

public class Range {

	public boolean startWithInclusive(String input) {
		return input.startsWith("[");
	}

	public boolean endWithInclusive(String input) {
		return input.endsWith("]");
	}

}
