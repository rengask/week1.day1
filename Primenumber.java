package week1.day1;

public class Primenumber {
	public static void main(String[] args) {
		int input=6;
		boolean flag=false;
		int i;
		for(i=2; i<input/2; i++) {
			int remainder=input%i;
			if(remainder==0)
			{
				flag=true;
				break;
			}
		}
		 if(flag==false) {
				System.out.println("It is Prime No");
		 }
		 else if(flag==true) {
			System.out.println("Not a Prime No");
			}
	}
			}
	


