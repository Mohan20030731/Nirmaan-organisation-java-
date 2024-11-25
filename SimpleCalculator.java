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
		System.out.println("0 for add");
		System.out.println("1 for sub");
		System.out.println("2 for mul");
		System.out.println("3 for div");
		System.out.println("4 for mod");
		
		int key = sc.nextInt();
		    if(key==0) 
		    {
			int Total=(firstNum+secondNum);
			System.out.println("Addition :"+Total);
		    }
			else if(key==1) 
			{
			int Total=(firstNum-secondNum);
			System.out.println("Subraction :"+Total);
			}
			else if(key==2)
			{
			int Total=(firstNum*secondNum);
			System.out.println("Multiplication :"+Total);
			}
			else if(key==3)
			{
			int Total=(firstNum/secondNum);
		    System.out.println("Division :"+Total);
			}
			else if(key==4)
			{
		    int Total=(firstNum%secondNum);
		    System.out.println("Modulus :"+Total);
			}
            }
	        }


