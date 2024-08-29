package testng;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesconfigDemo {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\config.properties");
		FileReader fr= new FileReader(f);
		
		Properties pro = new Properties();
		
		pro.load(fr);
		
		System.out.println(pro.get("browser"));
		System.out.println(pro.get("url"));
	}

}
