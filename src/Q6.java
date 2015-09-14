import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void writeHello(String filename) throws IOException {
	    writeToFile("Hello", filename);
	  }
	  public void writeToFile(String text, String filename) throws IOException {
	    File file = new File(filename);
	    if (!file.exists()) {
	      throw new IllegalStateException("The file does not exist");
	    }
	    FileWriter writer = null;
	    try {
	      writer = new FileWriter(file);
	      writer.write(text);
	    } catch (IOException e) {
	      throw new IllegalStateException("Failed to write to file", e);
	    } finally {
	    	writer.close();
	    }
	  }

}
