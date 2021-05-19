package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	static Properties pro;
	
	public ConfigUtils() throws IOException{
		File file=new File("src/test/resources/ConfigFile/Config.properties");
		FileReader reader=new FileReader(file);
		pro=new Properties();
		pro.load(reader);
	}
	
	public String getURL() {
		return pro.getProperty("url");
	}
	
	public String getUserName() {
		return pro.getProperty("userName");
	}
	
	public String getPwd() {
		return pro.getProperty("password");
	}
	
	public String getLoginTitle() {
		return pro.getProperty("LoginTitle");
	}

}
