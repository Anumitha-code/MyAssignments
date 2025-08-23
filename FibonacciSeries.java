package weel1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
        int num2 = 1;
        int count=8;
        System.out.println(num1+""+num2);
		for (int i = 2; i < count; i++) {
			
			int total = num1 + num2;
			System.out.print(total);
			num1 = num2;
			num2 = total;
		}
		
	}}
