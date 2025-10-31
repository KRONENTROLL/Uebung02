package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 1, j = 2, k = -10;
		
		if (i > j) {
			if (i < 199) {
				if (j < 99) {
					k = 1;
				}
			}
		}
		
		if (i > j) {
			if (i > 200) {
				if (j < 99) {
					k = 2;
				}
			}
		}
		
		if (i > j) {
			if (i > 200) {
				if (j > 100) {
					k = 3;
				}
			}
		}	
		
		if (i < j) {
			if (i < 200) {
				if (j < 99) {
					k = 4;
				}
			}
		}	
		System.out.println(k);
	}
	

}
