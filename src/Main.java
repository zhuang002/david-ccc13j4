import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Integer> chores = new ArrayList<>();
		for (int i=0;i<n;i++) {
			chores.add(sc.nextInt());
		}
		
		Collections.sort(chores);
		
		int count = 0;
		int sum = 0;
		for (int chore:chores) {
			sum += chore;
			if (sum > t) {
				break;
			}
			count++;
		}
		
		System.out.println(count);

	}

}
