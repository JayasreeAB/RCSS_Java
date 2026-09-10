import java.util.* ;

class Search extends Thread {
	int [] arr ;   //*
	int start , end , key;

	Search(int [] arr, int start, int end, int key) {
		this.arr = arr;  //here this means that
// the arr beside comes from * and = arr comes from SearchThread(int [] arr 
		this.start = start;
		this.end = end;
		this.key = key;
	}
	public void run() {
		for(int i =start ;i <end; i++) {
			if (arr[i] == key) {
				System.out.println("Element found at index " + i );
			}
			else {
				System.out.println("Element not found");
				
			}
			break;
		}
	}
}
public class SearchThread{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the array elements: ");
		int i;
		for(i = 0; i<n; i++) {
			arr[i] = sc.nextInt() ;
		}
		System.out.println("Enter element to search : ");
		int key = sc.nextInt();
		 // int parts = 5;
		int size = n / 5 ;
		int start = 0 ,end ;
		for ( i = 0; i < 5 ; i++ ){
			end = (i ==  4 ) ? n :start + size ;
			Search t = new Search(arr , start , end , key);
			t.start();
			start = end ; 
		}
	}
}
