public class PrintTriangle {
	public static void main(String[] args) {
		// declare variables
		final int length = 10;
		
		// 1st triangle
		for (int i = 0; i < length; i = i + 1) {
			for (int j = 0; j < length; j = j + 1) {
				if (j < i) {
					System.out.print("  ");
				}
				else {
					System.out.print(j + " ");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// 2nd triangle
		for (int i = 0; i < length; i = i + 1) {
			for (int j = 0; j < (length - i); j = j + 1) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// 3rd triangle
		for (int i = 0; i < length; i = i + 1) {
			for (int j = 0; j <= i; j = j + 1) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// 4th triangle
		for (int i = 0; i < length; i = i + 1) {
			for (int j = 0; j < length; j = j + 1) {
				if (j < (length - i - 1)) {
					System.out.print("  ");
				}
				else {
					System.out.print(j + " ");
				}
			}
			System.out.print("\n");
		}
	}
}