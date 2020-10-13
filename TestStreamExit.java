import java.io.*;

public class TestStreamExit {
	// method
	public static void separator() {
		System.out.println("=======================================");
	}
	
	// main
	public static void main(String[] args) {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String data = "";
		try {
			while (!data.equals("exit")) {
				data = bufferedReader.readLine();
				bufferedWriter.write(data);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
				outputStreamWriter.close();
				bufferedReader.close();
				inputStreamReader.close();
			} catch (Exception ex2) {
				ex2.printStackTrace();
			}
		}
		
	}
	
	// static code block
	static {
		separator();
		System.out.println("IO with cmd window");
		separator();
	}
}