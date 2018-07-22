package program;
import java.util.Scanner;
public class Helloprint {

	public static void main(String[] args) {
		String s;
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of times to print:");
		n=in.nextInt();
		System.out.println("Enter the String:");
		s=in.next();
		for(i=0;i<n;i++){
			System.out.println(s);
		}
		}

}
