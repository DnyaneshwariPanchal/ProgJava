package Java.Programming;

public class Addition {
	
	int sum=0;
	double doubleSum=0;
	
	int sum(int num1,int num2) {
		sum=num1+num2;
		System.out.println("Sum of Input is "+ sum);
		return sum;
	}
	
	double sum(double num1,int num2) {
		doubleSum=num1 + num2;
		System.out.println("Sum of Input is "+ doubleSum);
		return doubleSum;
	}

	public static void main(String[] arg) {
		
		Addition addition=new Addition();
		addition.sum(2,4);
		addition.sum(20.95,99);
		
	}
}
