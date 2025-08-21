package exceptiondemo;
// demo for program without exception
public class WithoutException {

	public static void main(String[] args) {
		try {
			int c = 10/5;
			System.out.println("The result is"+c);
			int[] arr=new int[5];
			arr[6]=12;
			System.out.println("The result is"+arr);
		}catch(ArithmeticException e) {
			System.out.println(e);   // understood for programmers
			
			System.out.println("You can't divide a number with zero.+Enter a postive number value. ");
		}
		
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("The defind index is not exisisting,the size of the array is 5 only!");
			}
				
		finally {
			System.out.println("The end of the program.....");
			
			}
		System.out.println("Closing....");

	}

}
