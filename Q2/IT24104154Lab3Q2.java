import java.util.Scanner;
public class IT24104154Lab3Q2
{
	public static void main(String[]args)
	{
		double salary;
		double othours;
		double y;
		double otamount;
		double rate;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter salary:");

		salary=input.nextDouble();

		System.out.println("Enter ot hours:");
		othours=input.nextDouble();

		System.out.println("Enter ot hours rate:");
		rate=input.nextDouble();

		otamount=othours*rate;
		salary=otamount+salary;

		System.out.println("Final salary:"+salary);
	}
}