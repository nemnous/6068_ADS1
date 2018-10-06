import java.util.*;
import java.text.SimpleDateFormat;
import java.text.*;
class test {
	// Date dob;`
	public static void main(String[] args) {
		String dateInString = "10-Jan-2016";
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	try {
	    Date date = formatter.parse(dateInString);
	    System.out.println(date);
	    System.out.println(formatter.format(date));
	} catch (ParseException e) {
	    //handle exception if date is not in "dd-MMM-yyyy" format
	}
	// System.out.println(date);
	}
}