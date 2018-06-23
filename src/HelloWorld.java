import java.util.ArrayList;
import java.util.StringJoiner;

public class HelloWorld {
	
	public static void main(String[] args) {
		String[] names = {"Tome" , "Cruise" , "Junior"};
		String sentence = getFullName("Manager", names); //  "Tom", "Cruise", "Junior");
		System.out.println(sentence);
		System.out.println("I am a boy".toUpperCase());
		StringJoiner sj = new StringJoiner(", ");
		sj.setEmptyValue("Empty");
//		sj.add(" ");
		
		System.out.println(sj.toString());
		
		ArrayList<String> list = new ArrayList<>();
		list.add("People of the world");
		list.add("bar");
		
		System.out.println("Number of Elements: " + list.size());
		
		for(String s : list ) {
			System.out.println(s.toString());
		}
		
		byte bigByte = 127;
		short bigShort = 32762;
		int bigInt = 210000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.108305807670857408576;
		
		long circumferenceOfEarth = 24901;
		long circumferenceOfEarthInKilometers = Math.round(circumferenceOfEarth * 1.6d);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		char randomChar = 65;
		char anotherChar = 'A';
		char escapedChars = '\t';
		
		String randomString = "Welcome Migratory Birds";
		String anotherString = "You can have our food!";
		String andAnotherString = randomString + " " + anotherString;
		
//		Conversion from other datatypes to string
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(trueOrFalse);
		
		double aDoubleValue = 30000000000000000.975598698885;
		int doubleToInt = (int)aDoubleValue; // narrowing conversion results in loss of data	
		 
//		conversion from string to integer or other primitive datatypes
//		parseShort, parseLong, parseFloat, parseBoolean, parseDouble
		String zeroOrOne = "false";
		int stringToInt = Integer.parseInt(intString);
		boolean yesOrNo = Boolean.parseBoolean(zeroOrOne);
		
		System.out.println(escapedChars);
		System.out.println(doubleToInt);
	}
	
	// php range(startval, endvalue, increment) function in java
	public int[] range(int startVal, int endVal, int increment) {
		  if (startVal >= endVal) {
		    //handle error or add option to go backwards
		  }
		  int count = ((endVal - startVal) / increment) + 1;
		  int[] myArr = new int[count];
		  for (int i=0; i <= count; i++) {
		    myArr[i] = startVal + (i * increment);
		  }
		  return myArr;
	}
	
	public static String getFullName(String position, String... names) {
		String fullName = "";
		for(String name : names) {
			fullName += name + " ";
		}
		String positionAndName = "The " + position + " is " + fullName;
		return positionAndName;
	}
}
