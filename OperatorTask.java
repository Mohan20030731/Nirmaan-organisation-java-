package day1;

public class OperatorTask {
	
     public static void main (String arg[]) {
    	 int firstNum = 12;
    	 int secondNum = 25;
    	 int thirdNum = 10;
         int fourthNum = 50;
         int fifthNum =5;
         int sixthNum = 100;
         int initial = 10;
         int momo = 12;
    	 
    	 System.out.println("Arithmetic Operations:");
    	 System.out.println(" ");
    	 System.out.println("Addtion:"+(firstNum + secondNum));
    	 System.out.println("Subraction :"+(firstNum - secondNum));
    	 System.out.println("Multiplication :"+(firstNum * secondNum));
    	 System.out.println("Division :"+(firstNum / secondNum));
    	 System.out.println("Modulus :"+(firstNum % secondNum));
    	 System.out.println(" ");
    	 System.out.println("Relational Operations:");
    	 System.out.println(" ");
    	 System.out.println("12 > 25: "+(firstNum > secondNum));
    	 System.out.println("12 < 25: "+(firstNum < secondNum));
    	 System.out.println("12 >= 25: "+(firstNum >= secondNum));
    	 System.out.println("12 <= 25: "+(firstNum <= secondNum));
    	 System.out.println("12 == 25: "+(firstNum == secondNum));
    	 System.out.println("12 != 25: "+(firstNum != secondNum));
    	 System.out.println(" ");
    	 System.out.println("Logical Operations");
    	 System.out.println(" ");
    	 System.out.println("12 > 10 AND 25 < 50 :"+(firstNum > thirdNum && secondNum < fourthNum));
    	 System.out.println("12 < 5 OR 25 > 100 :"+(firstNum < fifthNum || secondNum > sixthNum));
    	 System.out.println(" ");
    	 System.out.println("Assignment Operations");
    	 System.out.println("After += :"+(firstNum += secondNum));
    	 System.out.println("After -= :"+(firstNum -= secondNum));
    	 System.out.println("After * :"+(firstNum *= secondNum));
    	 System.out.println("After /= :"+(firstNum /= secondNum));
    	 System.out.println("After %= :"+(firstNum %= secondNum));
    	 System.out.println(" ");
    	 System.out.println("Unary Operator");
    	 System.out.println("Initial value: 12");
    	 System.out.println("After increment :"+(++momo));
    	 System.out.println("After decrement :"+(--momo-1));
    	 System.out.println(" ");
    	 System.out.println("Conditional Operator");
    	 System.out.println("12 is Even");
    	   }
     }
