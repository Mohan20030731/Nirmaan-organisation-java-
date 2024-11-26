package day3;
import java.util.Scanner;
public class StudentMark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :");
		int mark = sc.nextInt();
		sc.close();
		if (mark>=35){
			System.out.println("Pass");
		}
	    if (mark<35) {
			System.out.println("Fail");
		}
	    else if (mark<=90) {
			System.out.println("Grade A");
		}
	    else if (mark<=80) {
			System.out.println("Grade B");
		}
	    else if (mark<=50) {
			System.out.println("Grade c");
		}
		
	}

}
