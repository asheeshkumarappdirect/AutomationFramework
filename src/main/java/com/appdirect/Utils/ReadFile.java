package com.appdirect.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	public Properties propertyFile(String fileName) throws IOException {
		
		FileInputStream fin = new FileInputStream(new File(fileName));
		Properties pr = new Properties();
		pr.load(fin);
		return pr;
	}
}
