import java.util.Scanner;
public class Linear {
	public static void main(String[] args){
		System.out.println("Please enter a,b,c,d,e,f: ");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		LinearEquation l=new LinearEquation(a,b,c,d,e,f);
		if(l.isSolvable()){
			System.out.print(l.getX()+" ");
			System.out.println(l.getY());
		}else System.out.println("The equation has no solution.");
	}
}
class LinearEquation{
	private double a,b,c,d,e,f;
	LinearEquation(double a,double b,double c,double d,double e,double f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double geta(){
		return this.a;
	}
	public double getb(){
		return this.b;
	}
	public double getc(){
		return this.c;
	}
	public double getd(){
		return this.d;
	}
	public double gete(){
		return this.e;
	}
	public double getf(){
		return this.f;
	}
	public boolean isSolvable()
	{
		return (a*d-b*c!=0);
	}
	
	public double getX()
	{
		return (e*d-b*f)/(a*d-b*c);
	}
	
	public double getY()
	{
		return (a*f-e*c)/(a*d-b*c);
	}
}
