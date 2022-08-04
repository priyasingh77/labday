/*
	Program to perform calculation using addition,subtraction multiplication and division
	method taking any no of arguments using varargs.
        by priya
*/

// importing scanner utility to scan the user input
import java.util.Scanner;

//main class
class calculator{
	
	//main method
	public static void main(String ...args){
		
		//creating scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of element : ");
		int size = scan.nextInt();
		int arr[];
		
		//creating array object to store user input
		arr = new int[size];
		System.out.println("Enter "+size+" Numbers :");
		
		//storing values 
		for(int i=0;i<size;i++){
			arr[i] = scan.nextInt();
		}
		int start = arr[0];
		System.out.println("Select Operation to perform Choose from the following :");
		System.out.println("for Addition enter       : + \nfor Subtraction enter    : - \nfor Multiplication enter : * ");
		System.out.println("for Division enter       : /");
		//storing selection in character choice
		char choice = scan.next().charAt(0);
		
		//using switch to perform user seleted operation
		switch(choice){
			case '+' : addition(arr);//calling addition method
						break;
			case '-' : subtraction(start,arr);//calling subtraction method
						break;
			case '*' : multiplication(arr);//calling multiplication method
						break;
			case '/' : division(start,arr);//calling division method
						break;
			default : System.out.println("Invalid selection!!");
		}
		scan.close();
	}
	
	//addition method to perform addition on any no of element using varargs
	public static void addition(int ...args){
		int result = 0;
		System.out.print("Addition of elements : ");
		
		//adding values 
		for(int x:args)
		{
			result +=x;
		}
		System.out.println(result);
	}
	
	//subtraction method to perform subtraction on any no of element using varargs	
	public static void subtraction(int start,int ...args){
		int result = 0;
		System.out.println("Subtraction of elements: ");
		
		//subtracting values
		for(int x : args)
		{
			
			if(result != 0){
				result -= x;
			}
			if (result == 0){
				result = start;
				start = 0;
			}
			
		}
		System.out.println(result);
	}
	
	//multiplication method to perform multiplication on any no of element using varargs
	public static void multiplication(int ...args){
		int result = 1;
		System.out.print("Multiplication of elements : ");
		
		//multiplying values
		for(int x:args){
			
			result *= x;
		}
		System.out.println(result);
	}
	
	//division method to perform subtraction on any no of element using varargs	
	public static void division(int start,int ...args){
		int result = 0;
		System.out.println("Division of elements: ");
		
		//dividing values
		for(int x : args){
			
			if(result != 0){
				result /= x;
			}
			if (result == 0){
				result = start;
				start = 0;
			}
			
		}
		
		System.out.println(result);
	}
}