import java.util.Date;
public class Data {
	public static void main(String[] args) {
		long a[]={10000,100000,1000000,10000000,100000000,1000000000,10000000000L,100000000000L};
	    for(int i=0;i<8;i++){
	    	long milliSecond =a[i];
	    	Date date = new Date();
	    	date.setTime(milliSecond);
	    	System.out.println(date.toString());
	    }
	}
}
