package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 95495954, j = 78945646, k = 7474774, min = 0, max = 0;
		
		if (i > j) {
			if (i > k) {
				max = i;
			}
			
		}
		if (j > i) {
			if (j > k) {
				max = j;
			}
			
		}
		if (k > j) {
			if (k > i) {
				max = k;
			}
			
		}
		if (i < j) {
			if (i < k) {
				min = i;
			}
			
		}
		if (j < i) {
			if (j < k) {
				min = j;
			}
			
		}
		if (k < j) {
			if (k < i) {
				min = k;
			}
			
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}

}
