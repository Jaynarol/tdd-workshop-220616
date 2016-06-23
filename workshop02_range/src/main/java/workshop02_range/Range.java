package workshop02_range;

public class Range {

	public int getNumberFirst(String input) {
		int num = input.charAt(1) - 48;
		return input.startsWith("[") ? num : num+1;
	}

	public int getNumberLast(String input) {
		int num = input.charAt(3) - 48;
		return input.endsWith("]") ? num : num-1;
	}

	public String concatNumber(int first, int last) {
		String result = first+"";
		int range = last - first;
		for( int i=0; i<range; i++){
			result += "," + ++first;
		}
		return result;
	}

	public String getResult(String input) {
		return concatNumber(getNumberFirst(input), getNumberLast(input));
	}

}
