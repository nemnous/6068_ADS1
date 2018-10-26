import java.util.*;
import java.io.File;
class PasswordCheck {
	boolean fromDict(String theStr) {
		Set<String> dictWords = readFileIntoSet("Dictionary.txt");
		return dictWords.contains(theStr);
	}

	public Set<String> readFileIntoSet(String fileName) {
	  Set<String> result = new HashSet<String>();
	  try {
	  	Scanner sc = new Scanner(new File(fileName));
	  	for (sc = sc; sc.hasNext(); ) {
	    result.add(sc.nextLine());
		}
	  	return result;
	  } catch(Exception E) {
	  	System.out.println("FuckedUp");
	  }
	  return null;
	}

 	boolean isGood(String password) {
 		int length = password.length();
		if(length >= 8) {
			password = password.replaceAll("\\d", " ");
			String[] PassWords = password.split(" ");
			System.out.println(Arrays.toString(PassWords));
			for(String str : PassWords) {
				if(fromDict(str)) {
					return false;
				}
			}
		return true;
			}
		return false;
	}
		
}

	// boolean isGood(String password) {
	// 	int length = password.length();
	// 	if(length >= 8) {
	// 		if(isFromDict(password)) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

