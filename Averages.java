package epam;
import java.util.ArrayList;
import java.util.Scanner;
public class Averages {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter num");
				int num = s.nextInt();
				ArrayList<Integer> A = new ArrayList<>();
				System.out.println("Enter elements in list");
				s.nextLine();
				for(int i = 0;i < num;i++){ 
					int a = s.nextInt();
					A.add(a);
				}
				int sum = A.stream().mapToInt(i -> i.intValue()).sum();
				double avg=0;
				if(A.size() > 0) {
					 avg = sum / A.size();
				}
				System.out.println("Average of the numbers is "+avg);
	}
}