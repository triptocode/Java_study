package basic02;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class CustomizedDate {
	
	public static void main(String[] args) throws ParseException {
		
		
		DateFormatSymbols symbol = new DateFormatSymbols(Locale.US);
		symbol.setAmPmStrings(new String[] { "AM", "PM"});
		SimpleDateFormat simple = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a", symbol);

		System.out.println(simple.format(System.currentTimeMillis()));
		System.out.println(simple.parse("05/26/2014 06:57:09 AM"));
	}

}
