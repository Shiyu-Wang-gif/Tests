import java.io.File;

public class TraverseDirectory {
	// field
	private static int count;
	
	// method
	public static void separator() {
		System.out.println("===============================");
	}
	
	public static void printFile(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f:files) {
				try {
					printFile(f);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		} else {
			System.out.println(file.getAbsolutePath());
			count++;
		}
	}
	
	// main
	public static void main(String[] args) {
		String partition = "E:/";
		File file = new File(partition);
		count = 0;
		printFile(file);
		
		System.out.println("There are " + count + " files in " + partition);
	}
	
	// static code block
	static {
		separator();
		System.out.println("Traverse the directory of C:\\");
		separator();
	}
}