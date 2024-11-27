package day5;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		Scanner mo = new Scanner(System.in);
		System.out.println("Enter the Table Value :");
		int Table = mo.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(Table+"x"+i+"="+i*Table);
		}
	}

}
