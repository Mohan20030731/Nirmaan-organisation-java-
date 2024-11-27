package day2;
import  java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First Number :");
		int firstNum= sc.nextInt();
		System.out.println("Enter your Second Number :");
		int secondNum= sc.nextInt();
		
		
		System.out.println("Enter your Choice :");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		System.out.println("5 for mod");
		System.out.println("0 for Exit");
		int key = sc.nextInt();
		sc.close();
		switch (key)
		{
		case 1:
	    {
		int Total=(firstNum+secondNum);
		System.out.println("Addition :"+Total);
	    break;
		    }
		case 2:
	    {
		int Total=(firstNum-secondNum);
		System.out.println("Subraction :"+Total);
	    break;
			}
		case 3:
	    {
		int Total=(firstNum*secondNum);
		System.out.println("Multiplication :"+Total);
	    break;
			}
		case 4:
	    {
		int Total=(firstNum/secondNum);
		System.out.println("Division :"+Total);
	    break;
			}
		case 5:
	    {
		int Total=(firstNum%secondNum);
		System.out.println("Modulus :"+Total);
	    break;
			}
	    case 0:
	    {
		System.out.println("Thankyou for using my Calulator");
	    break;
            }
	        }
	}
}

