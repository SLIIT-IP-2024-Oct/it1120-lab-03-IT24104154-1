import java.util.Scanner;
public class IT24104154Lab3Q1A
{
	public static void main(String[]args)
	{
		double kilo;
		double price;
		double x;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the price of 1kg of rice :"); 
		price=input.nextDouble();

		System.out.println("Enter the number of kilograms you want to buy :");
		kilo=input.nextDouble();
		
		x=kilo*price;
		System.out.println("total amount is:" +x);
	}
}
	
	