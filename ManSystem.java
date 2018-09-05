import java.util.Arrays;
import java.util.Scanner;

public class ManSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String names[]=new String[20];
		int ages[]=new int[20] ;
		String branches[]=new String[20];
		int years[] =new int[20],sems[]=new int[20] ;
		double scores[]=new double[20] ;
		System.out.println("Enter number of students:");
		int var = sc.nextInt();
		int var2=var;
		while(var>0) {
		System.out.println("Enter your name: ");
		names[var]=sc.next();
		System.out.println("Enter your age: ");
		ages[var]=sc.nextInt();
		System.out.println("Which branch do you belong to: ");
		branches[var]=sc.next();
		System.out.println("Which year and semester are you from: ");
		years[var]=sc.nextInt();
		sems[var]=sc.nextInt();
		System.out.println("Enter your previous semester's score: ");
		scores[var]=sc.nextDouble();
		var--;
		}
		Arrays.sort(scores);
		while(var2>0) {
			System.out.println(scores[var2]);
			var2--;
		}
		while(var2>0) {
			System.out.println("Name:"+names[var2]+"\nAge:"+ages[var2]+"\nBranch:"+branches[var2]+"\nYear and Semester:"+years[var2]+" and "+sems[var2]+"\nPrevious Semester Score:"+scores[var2]+"%");
			var2--;
		}
		sc.close();
	}

}
