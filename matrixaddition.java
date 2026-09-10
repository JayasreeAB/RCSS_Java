import java.util.*;
public class matrixaddition{
	public static void main(String[] args){
		int a[][],b[][],d[][],r,c,i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		r = sc.nextInt();

		System.out.println("Enter the number of columns:");
		c = sc.nextInt();
//insert to arrays
		a = new int[r][c];
		b = new int[r][c];
//matric 1 elements
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				System.out.println("Enter the a [" + i + "][" + j + "] element ");
		a[i][j] = sc.nextInt();
}
}
//matrix 2 elements
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				System.out.println("Enter the b [" + i + "][" + j + "] element ");
		b[i][j] = sc.nextInt();
}
}
//print matrix a 
		System.out.println("1st matrix a :");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				
				System.out.print(a[i][j] + "\t" );
								}
	System.out.println();
}
//print matrix b 
		System.out.println("2nd matrix b :");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				
				System.out.print(b[i][j] + "\t" );
								}
	System.out.println();
}
//addition logic
		d = new int [r][c];
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				d[i][j] = a[i][j]+b[i][j];
}
}
// print matrix d
		System.out.println("Sum of matrix a and b:");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				
				System.out.print(d[i][j] + "\t" );
								}
	System.out.println();
}
}
}






		