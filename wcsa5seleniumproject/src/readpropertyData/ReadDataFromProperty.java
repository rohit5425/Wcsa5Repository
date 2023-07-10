package readpropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	public static void main(String[] args) throws IOException {

		// read the data from config.properties file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		// create a object of properties 
		Properties prop = new Properties();
		
		// make a file ready for read 
		prop.load(fis);
		// Read the particular property From file 
		
		String data = prop.getProperty("Username");
		System.out.println(data);


	}

}
