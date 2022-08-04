/*program to get index of the numbers with those we get the target
    by priya */
// importing scanner utility to scan the user input
import java.util.Scanner;

//Main class
class Target{
	public static void main(String args[]){
		
		//creating scanner object named s
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size = s.nextInt();
		
		//creating array arr
		int arr[];
		arr = new int[size];
		System.out.println("Enter "+size+" elements :");	
		
		//for loop to store element in array
		for(int i=0;i<size;i++){
			arr[i]= s.nextInt();
		}
		System.out.println("Enter the Sum of two number : ");
		int target = s.nextInt();
		
		//creating object of search class named find.
		search obj = new search();
		System.out.println("-----------------------------");
		
		// calling Sum method from search class using obj object
		obj.Sum(arr,size,target);
		s.close();
	}
}

// creating class search to traverse the array and find all possible set of value
class search{
	public void Sum(int arr[],int size,int target){
		int lenght = size;
		int[] result;
		
		//creating array name result to store set of value in result array
		result = new int[2];
		
		//for loop to traverse the array
		for(int i=0;i<lenght;i++)
			{
				for(int j=i+1;j<lenght;j++)
				{
				// comparing if sum of two elements is equal to target
				if(target == arr[i]+arr[j])
				{
					result[0]=arr[i];
					result[1]=arr[j];
					
					// printing all the possible set of two value whose sum is equal to target
					System.out.print("Element: ["+result[0]+","+result[1]+"]");
					System.out.println("  Index :["+i+","+j+"]");
				}
			}
		}
	}
}