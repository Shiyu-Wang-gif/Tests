import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PrintCalendar {
	// method
	public static void separateLine() {
		System.out.println("=========================================");
	}
	
	public static int[] dateScan() {
		Scanner sc = new Scanner(System.in);
		int[] dateInput = new int[3]; // dateInput[0] for year, dateInput[1] for month, and dateInput[2] for day
		String[] yearMonthDay = {"Year: ", "Month: ", "Day: "};
		
		separateLine();
		for (int i = 0; i < dateInput.length; i++) {
			System.out.print(yearMonthDay[i]);
			dateInput[i] = sc.nextInt();
		}
		return dateInput;
	}
	
	public static void setDate(int[] dateInput, Calendar calendar) {
		calendar.set(Calendar.YEAR, dateInput[0]);
		calendar.set(Calendar.MONTH, dateInput[1] - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dateInput[2]);
		separateLine();
		System.out.println("Date is set as:");
		System.out.println(calendar.getTime());
	}
	
	public static void printCalendar(Calendar calendar, int[] dateInput) {
		String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		separateLine();
		for (int i = 0; i < weekDays.length; i++) {
			System.out.print(weekDays[i] + "   ");
		}
		System.out.println();
		
		StringBuffer stringBuffer = new StringBuffer();
		int dayOfMonth;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
				
				if (dayOfMonth < 10) {
					stringBuffer.append(' ');
				}
				stringBuffer.append(dayOfMonth).append("    ");
				
				if ((dateInput[2] == dayOfMonth) && (dateInput[1] - 1 == calendar.get(Calendar.MONTH))) {
					stringBuffer.replace(stringBuffer.length() - 4, stringBuffer.length() - 3, "*");
				}
				
				calendar.add(Calendar.DAY_OF_MONTH, 1);
			}
			stringBuffer.append('\n');
		}
		
		System.out.println(stringBuffer);
	}
	
	// main
	public static void main(String[] args) {
		// create objects
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd 'at' HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
		
		// scan date input
		int[] dateInput = dateScan();
		
		// set date to the input date
		setDate(dateInput, calendar);
		
		// goes to the first day of the month
		calendar.add(Calendar.DAY_OF_MONTH, -dateInput[2] + 1);
		
		// goes to the Sunday of last month
		calendar.add(Calendar.DAY_OF_MONTH, -calendar.get(Calendar.DAY_OF_WEEK) + 1);

		// print a calendar
		printCalendar(calendar, dateInput);
	}
	
	// static code block
	static {
		separateLine();
		System.out.println("Print a calendar required by user");
		separateLine();
	}
}