package week1.day2;

public class Calculator {
	/*1. Create a class called Calculator with below methods
    a) add() with 2 int arguments and return the sum result
    b) sub() with 2 double arguments and return the diff result
    c) mul() with 2 double arguments and return the mul result
    d) div() with 2 int arguments and return the div result
	*/
	
		public int add(int num1, int num2) {
			int sum;
			return sum=num1+num2;
			
		}
		public double sub(double num1,double num2) {
			double differ;
			return differ=num1-num2;
		}
		public double multi(double num1,double num2) {
			double mutli;
			return mutli = num1*num2;
			
		}
			public int div(int num1, int num2) {
				int div;
				return div = num1/num2;
			}
		public static void main(String[] args) {
			Calculator cal=new Calculator();
			System.out.println(cal.add(20, 30));
			System.out.println(cal.sub(8.0,4.0));
			System.out.println(cal.multi(2.5, 2.5));
			System.out.println(cal.div(25, 5));
		}
	}


