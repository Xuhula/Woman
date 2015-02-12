import java.util.Scanner;
public class Girl extends Female {
	static Scanner scan = new Scanner(System.in);
	public Girl(String name) {
		super(name);
	}

	public static void main(String[]args)
	{

			String[] BetterArray = new String[args.length - 1];
			int n = 0;
			for (int i = 1; i < args.length; i++){
				BetterArray[n] = args[i];
				n++;
				
			}
			Female female = new Female(args[0]);

			String truth = female.Compliment(BetterArray);
			System.out.println(truth);
			Period period = female.Blood();
			System.out.println("When was your last period?");
			String Date = scan.nextLine();
			period.setLastPeriodDate(Date);
			System.out.println(period.ShowDate());

	}
}
