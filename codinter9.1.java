import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
		Scanner cin = new Scanner(System.in);
		int i = cin.nextInt();
		System.out.println(countSteps(i));
	}

	static int a[] = new int[100000];

	public static int countSteps(int n) {
		if (n == 1) {
			a[n] = 1;
			return a[n];
		}
		if (n == 2) {
			a[n] = 2;
			return a[n];
		}
		if (n == 3) {
			a[n] = 4;
			return a[n];
		}
                if(a[n]!=0) return a[n];
		a[n] = countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
		return a[n];

	}

}
