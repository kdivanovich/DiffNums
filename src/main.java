import java.util.Scanner;
import java.util.Vector;
public class main {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter lower limit: ");
		int lower = reader. nextInt();
		
		System.out.print("Enter the upper limit: ");
		int upper = reader.nextInt();
		
		//int[] nums = new int[10000];
		
		Vector nums = new Vector<>();
		Vector uniques = new Vector<>();
		
		for (int i = lower; i < upper; i++) {
			//nums[i-lower] = i;
			nums.add(i);
		}
		
		for (int i = 0; i < nums.size(); i++) {
			//System.out.print(nums[i] + ", ");
			System.out.print(nums.elementAt(i) + ", ");
		}
		System.out.println();
		
		
		
		for (int i = 0; i < nums.size(); i++) {						
			int a = (int) nums.elementAt(i) / 1000;	// a = 1878/1000; a=1;			
			int b = (((int) nums.elementAt(i)) - a*1000) / 100;	// b = 1878 - 1*1000 = 878 
			int c = (((int) nums.elementAt(i)) - a*1000 - b*100)/ 10;
			int d = (((int) nums.elementAt(i)) - a*1000 - b*100 - c*10);
			
			if (a != b && a != c && a != d && b != c && b != d && c != d){
				uniques.add(((int) nums.elementAt(i)));
			}			
		}		
		System.out.println();
		
		for (int i = 0; i < uniques.size(); i++) {
			System.out.println(uniques.elementAt(i) + ", ");
		}
		
		System.out.println(uniques.size());
		
	}
}