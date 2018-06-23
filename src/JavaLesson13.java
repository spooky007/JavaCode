import java.util.Arrays;

public class JavaLesson13 {
	
	public static void main(String[] args) {
		
		String randomString = "I'm just a randomstring!";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + gotToQuote);
		System.out.println(randomString + " " + numTwo);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
			System.out.println("They're equal");
		}
		
		String letters = "abcdef";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		
		System.out.println(letters.compareTo(moreLetters));
		System.out.println(moreLetters.compareTo(letters));
		
		System.out.println(letters.contains("abc"));
		System.out.println(letters.endsWith("de"));
		System.out.println(letters.indexOf("cd"));
		System.out.println(letters.lastIndexOf("cd"));
		
		// You can also specify the index to start searching from
		// indexOf(StringToLookFor, IndexStartPosition)
		
		// lastIndexOf() works like indexOf() except it starts from
		// the end of the String you are searching
		
		System.out.println("Length:" + letters.length());
		
		System.out.println(letters.replace("ab", "xy"));
		
		String[] letterArray = letters.split("");
		System.out.println(Arrays.toString(letterArray));
		
		char[] charArray = letters.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(letters.substring(1, 4));
		System.out.println(letters.toLowerCase());
		
		String randString = "        abfhifosif";
		
		System.out.println(randString.trim());
		
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again"));
		System.out.println(randSB.delete(15, 21));
		System.out.println(randSB.capacity());
		
		randSB.ensureCapacity(60);
		System.out.println(randSB.capacity());
		System.out.println(randSB.length());
		
		randSB.trimToSize();
		System.out.println(randSB.capacity());
		System.out.println(randSB.insert(1, "nother"));
		
		String oldSB = randSB.toString();

	} 
}