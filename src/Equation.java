import java.util.Scanner;
public class Equation {
	public static void main(String[] args){
		System.out.println("Please enter a,b,c: ");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation q=new QuadraticEquation(a,b,c);
		if(q.getDiscriminant()>0){
			System.out.print(q.getRoot1()+" ");
			System.out.println(q.getRoot2());
		}else if(q.getDiscriminant()==0)  System.out.println(q.getRoot1());
		else System.out.println("The equation has no roots.");
	}
}
class QuadraticEquation{
	private double a,b,c;
	QuadraticEquation(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
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
	public double getDiscriminant()
	{
		return b*b-4*a*c;
	}
	public double getRoot1()
	{
		if(getDiscriminant()>=0)  return ((-b+Math.sqrt(getDiscriminant()))/(2*a));
		else return 0;
	}
	public double getRoot2()
	{
		if(getDiscriminant()>=0)  return ((-b-Math.sqrt(getDiscriminant()))/(2*a));
		else return 0;
	}
}