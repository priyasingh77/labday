import java.util.Scanner;

public class Transpose
{
	
public static void main (String args[]){
	
							//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows :");
	int rows = scan.nextInt();
	System.out.println("Enter the no of coloumns :");
	int cols = scan.nextInt();
	
							//creating array arr normal and transpose matrix
	int arr[][] = new int[rows][cols];
	
							//Storing values in array
	System.out.println("Enter the value for first array:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr[i][j]= scan.nextInt();
		}
	}
	
	System.out.println("MATRIX");
	for (int i=0;i<rows;i++){
		for (int j=0;j<cols;j++){
							//displaying array before transposition
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	System.out.println("TRANSPOSE MATRIX");
	//calling display method
	display(rows,cols,arr);
	scan.close();
}

							//creating a method name display to perform matrix transposition
public static void display(int rows,int cols,int arr[][]){

	
	for(int i=0;i<cols;i++){
		for(int j=0;j<rows;j++){
			

							//Displaying transpose value
			System.out.print(arr[j][i]+" ");
		}
		System.out.println(" ");
	}
}
}