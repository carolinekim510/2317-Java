import java.util.*;

class Proj02Runner {

	Proj02Runner() {

		System.out.println("I certify that this program is my own work");
		System.out.println("and is not the work of others. I agree not");
		System.out.println("to share my solution with others.");
		System.out.println("Caroline Kim\n");
	}

	public Collection getCollection(String[] myArray){
		List<String> myWords = Arrays.asList(myArray);
		Collections.sort(myWords, String.CASE_INSENSITIVE_ORDER);
		return myWords;
	}
}

