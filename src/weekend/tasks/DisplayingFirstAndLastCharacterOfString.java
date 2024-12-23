package weekend.tasks;

public class DisplayingFirstAndLastCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Kannathasan";

		int lengthOftheString =	name.length();

		System.out.println("The first Character" + name.charAt(0));

		System.out.println("The Last Character" +  name.charAt(lengthOftheString-1));

	}

}
