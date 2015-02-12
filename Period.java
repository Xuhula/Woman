import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
public class Period {
	private String MenstrualWoman;
	Date date = new Date();
	public Period(String s)
	{
		MenstrualWoman = s;
		
	}
	public Period ()
	{
		System.out.println("Enter your name as a parameter.");
	}
	public void setLastPeriodDate(String periodDate)
	{
		boolean bool = true;
		while (bool != false){
		try {
			date = DateFormat.getDateInstance().parse(periodDate);
			bool = false;
		} 
		catch (ParseException e) {
			System.out.println("Please enter a valid date.");

		}
		}
	
	}
	public String ShowDate()
	{
		return MenstrualWoman + "'s last period in on " + date.toString();

		
	}
}
