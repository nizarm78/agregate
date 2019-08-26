package related;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestClass {
	private static final String PRINT_PATH = "D:\\temp\\printout.txt";

	public void print(String message) throws IOException{
		FileUtils.writeStringToFile(new File(PRINT_PATH), message+"\n", "UTF-8", true);
	}
	
	public boolean fileExists(){
		File f = new File(PRINT_PATH);
		return f.exists();
	}
}
