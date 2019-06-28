package unidade4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception{
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("/Users/matheus/eclipse-workspace/2Disciplina/src/unidade4/sites.xml"));
		System.out.println(sites.getProperty("1"));
	}

}
