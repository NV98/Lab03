import java.util.Scanner ;

public class Bubblesort {
	public static void  main (String[] args) {
		Scanner sc= new Scanner(System.in);
	 	System.out.print("Enter the length of array you want to sort");	
	 	int n=sc.nextInt();
	 	int[] arr=new int[n];
	 	for (int i=0;i<n;i++) {
	 		
	 		System.out.println("Enter the next element");	
	 		arr[i]=sc.nextInt();
	 		}
	 	for (int j=0;j<n;j++) {
	 		for (int k=j;k<n;k++) {
	 			if (arr[j]>arr[k]) {
	 				
	 				arr[j]=arr[k]+arr[j];
	 				arr[k]=arr[j]-arr[k];
	 				arr[j]=arr[j]-arr[k];
	 			}
	 		}
	 	}
	for (int i=0;i<n;i++) {
	 		
	 		System.out.println(arr[i]);	
	 		
	 		}
	 		
	}
 
 	
 	

}
 