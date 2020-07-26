package epam;

import java.util.*;
import java.util.stream.Collectors;
public class Startingletter {
	public static List<String> startingA(List<String> withletterA){
		List<String> res = withletterA.stream().filter(String-> String.charAt(0) == 'a' && (String.length() == 3) ).collect(Collectors.toList());
		return res;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int num=sc.nextInt();
		List<String> a = new ArrayList<String>();
		System.out.println("Enter the list of strings:");
		sc.nextLine();
		for(int i=0;i<num;i++) {
			a.add(sc.nextLine());
		}
		System.out.println("The strings starting with 'a' are: ");
		List<String> ans = startingA(a);
		ans.forEach(str->System.out.println(str));
	}
}