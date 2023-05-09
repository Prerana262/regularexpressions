package regularexpressions;
//Importing Pattern class from java.util.regex package
import java.util.regex.*;
// Main class
public class RE {
    // Main method
	public static void main(String[] args) {
		String pattern="[a-s]+";
		String check="Prerana Mohapatra";
		//create a pattern to be searched
		Pattern a = Pattern.compile(pattern);
		//search  the pattern in "Prerana Mohapatra"
		Matcher b = a.matcher(check);
		//Finding string using find()method
		while (b.find())
		// print starting and ending indexes of the pattern in the .substring() method provided by the check class 	
		System.out.println(check.substring(b.start(),b.end()));	
			

	}

}
