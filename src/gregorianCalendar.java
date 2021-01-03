import java.util.GregorianCalendar;
public class gregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar date=new GregorianCalendar();
		System.out.println(date.get(GregorianCalendar.YEAR)+" "+(date.get(GregorianCalendar.MONTH)+1)+" "+date.get(GregorianCalendar.DAY_OF_MONTH));
		long num=1234567898765L;
		date.setTimeInMillis(num);
		System.out.println(date.toString());
	}
	
}
