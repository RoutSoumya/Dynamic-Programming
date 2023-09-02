import java.io.*;

class SScount {

	static void printBool(int n, int len) {
		while (n>0) {
			if ((n & 1) == 1) System.out.print(1);
			else System.out.print(0);
			n >>= 1;
			len--;
		}
		while (len>0) {
			System.out.print(0);
			len--;
		}
		System.out.println();
	}

	static void printSubsetsCount(int set[], int n, int val) {
		int sum;
		int count = 0;
		for (int i=0; i < (1 << n); i++) {
			sum = 0;
			for (int j=0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					sum += set[j];
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No subset");
		}
		else {
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		int set[] = { 1, 2, 3, 4, 5 };
		printSubsetsCount(set, 5, 9);
	}
}