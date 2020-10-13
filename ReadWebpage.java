import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class ReadWebpage {
	// method
	public static void separator() {
		System.out.println("==================================================");
	}
	
	// main 
	public static void main(String[] args) {
		String codes;
		File file = new File("bing.html");
		int len;
		byte[] bytes = new byte[1024];
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			URL url = new URL("https://cn.bing.com");
			bufferedInputStream = new BufferedInputStream(url.openStream());
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
			
			while ((len = bufferedInputStream.read(bytes)) != -1) {
				bufferedOutputStream.write(bytes, 0, len);
			}
			bufferedOutputStream.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				bufferedOutputStream.close();
				bufferedInputStream.close();
			} catch (IOException ioEx) {
				ioEx.printStackTrace();
			}
		}
		
		// BufferedReader bufferedReader = null;
		// BufferedWriter bufferedWriter = null;
		// try {
			// URL url = new URL("https://cn.bing.com");
			// bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			// // bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
			// bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
			
			// while ( (codes = bufferedReader.readLine()) != null ) {
				// bufferedWriter.write(codes);
				// bufferedWriter.newLine();
			// }
			// bufferedWriter.flush();
		// } catch (Exception ex) {
			// ex.printStackTrace();
		// } finally {
			// try {
				// bufferedWriter.close();
				// bufferedReader.close();
			// } catch (IOException ioEx) {
				// ioEx.printStackTrace();
			// }
		// }
	}
	
	// static code block
	static {
		separator();
		System.out.println("Scrape a web page and show it in the cmd window");
		separator();
	}
}