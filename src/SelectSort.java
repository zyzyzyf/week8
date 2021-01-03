import java.util.Random;
public class SelectSort {
	public static void main(String[] args)
	{
		Random x=new Random();
		int[] a=new int[100000];
		for(int i=0;i<100000;i++) a[i]=x.nextInt();
		
		StopWatch s=new StopWatch();
		selectSort(a);
		s.stop();
		
		System.out.println(s.getElapsedTime());
	}
	public static void selectSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
	    {
	        int min=i;
	        for(int j=i;j<a.length;j++)
	        {
	            if(a[j]<a[min])
	            {
	                min=j;
	            }
	        }
	        int t=a[i];
	        a[i]=a[min];
	        a[min]=t;
	    }
	}
}
class StopWatch {
	private long startTime;
	private long endTime;
	StopWatch()
	{
		this.startTime=System.currentTimeMillis();
	}
	public void start()
	{
		this.startTime=System.currentTimeMillis();
	}
	
	public void stop()
	{
		this.endTime=System.currentTimeMillis();
	}
	public long getElapsedTime()
	{
		return endTime-startTime;
	}
}




