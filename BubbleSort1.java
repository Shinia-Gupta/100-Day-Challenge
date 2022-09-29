package DataStructures;
import java.util.Scanner;
public class BubbleSort1 {
	//method to sort array using bubble sort
	public void bubbleSort(int a[])
	{
		int temp=0,i,j;
		//Loop for traversal of array elements
		for(i=0;i<a.length;i++)
		{
			int flag=0;
			for(j=0;j<(a.length-1);j++)
			{
				//For swapping of elements
				if(a[j]>a[j+1] && j<(a.length-1))
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					System.out.println("Swap Value iteration "+ j + " Existing Value is " + a[j] + " and New is "+ a[j+1]);
				}

			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.println("Sorted array is ");
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);

	}
	//Main method
	public static void main(String[] args) {
		//Starting the timer
		long startTime = System.nanoTime();
		System.out.println("Program started at "+startTime);
		Scanner s=new Scanner(System.in);
		BubbleSort1 b=new BubbleSort1();
		int arr[]=new int[10];
		System.out.print("Enter 10 array elements: ");
		for(int k=0;k<arr.length;k++)
		{
			arr[k]=s.nextInt();
		}
		//Calling the function using object
		b.bubbleSort(arr);
		//Ending the timer
		long endTime   = System.nanoTime();
		System.out.println("Program ended at "+endTime);
		//Total Time taken is obtained as follows
		long totalTime = endTime - startTime;
		System.out.println("Total time taken by the Bubble sort to execute is: "+totalTime+" nanoseconds");
	}
}

    
