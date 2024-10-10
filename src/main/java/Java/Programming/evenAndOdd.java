package Java.Programming;

public class evenAndOdd {
	
	public static int evenOdd(int num) {
		int evenNum=0;
		int oddNum=0;
		if(num%2==0) {
			System.out.println(num+" is Even Number");
			return evenNum;
		}else {
			System.out.println(num+" is Odd Number");
			return oddNum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenOdd(34);
		evenOdd(33);

	}

}
