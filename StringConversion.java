package day7;

public class StringConversion {
		String add (int a , int b) {
		return "add :"+(a+b);
		}
		String Sub (int a , int b) {
			return "Sub :"+(a-b);
			}
		String Mul (int a , int b) {
			return "Mul :"+(a*b);
			}
		String Div (int a , int b) {
			return "Div :"+(a/b);
			}
		String Mod (int a , int b) {
			return "Mod :"+(a%b);
			}
		public static void main(String[] args) {
			Conversion momo =new Conversion();
			String number=momo.add(20,40);
			System.out.println(number);
			String number1=momo.Sub(20,40);
			System.out.println(number1);
			String number2=momo.Mul(20,40);
			System.out.println(number2);			
			String number3=momo.Div(20,40);
			System.out.println(number3);			
			String number4=momo.Mod(20,40);
			System.out.println(number4);
		}
	}

