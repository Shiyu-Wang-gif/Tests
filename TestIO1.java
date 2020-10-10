import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO1 {
	// method
	public static void separator() {
		System.out.println("===========================================");
	}
	
	// main 
	public static void main(String[] args) {
		File aaaFile = new File("aaa.txt");
		File abcFile = new File("abc.txt");
		FileInputStream abcFileInputStream = null;
		FileOutputStream aaaFileOutputStream = null;
		byte[] buffer = new byte[1024];
		int len;
		try {
			abcFileInputStream = new FileInputStream(abcFile);
			aaaFileOutputStream = new FileOutputStream(aaaFile);
			while ((len = abcFileInputStream.read(buffer)) != -1) {
				aaaFileOutputStream.write(buffer, 0, len);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				abcFileInputStream.close();
				aaaFileOutputStream.close();
			} catch (IOException ioEx) {
				ioEx.printStackTrace();
			}
		}
	}
	
	// static code block
	static {
		separator();
		System.out.println("Put the data from abc.txt to aaa.txt");
		separator();
	}
}