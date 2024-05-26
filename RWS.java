
public class RWS {

	public static void main(String[] args) {

		System.out.println("Output without spaces:" + removeWS("Hello nice and big world"));
	}
	
	static String removeWS (String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}

}
