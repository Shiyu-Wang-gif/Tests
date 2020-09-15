import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TestDate {
	// main
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		String dateStringBuffer = dateFormat.format(date);
		System.out.println(dateStringBuffer);
		
		Date d1 = dateFormat.parse("2010-10-21 at 22:13:05");
		System.out.println(d1);
	}
	
	// static code block
	static {
		System.out.println("======================================");
		System.out.println("Test the Test class");
		System.out.println("======================================");
	}
}