package date_input_format_database;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.sql.Date;

public class Date_input_format_database {

	public static  String DateToDbInput(Date Date_Time){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String reportDate = df.format(Date_Time);
		
		
		return reportDate;
	}
	
	public static void main(String[] args) {
		
		String string = "07/16/2016 07:48:02.746 PM";
		DateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss.SSS a");
		Date date = new Date();
		
		try {
	        date = formatDate.parse(string);
	        
	        System.out.println(date);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
		
		String str = DateToDbInput(date);
		System.out.println(str);
	}

}