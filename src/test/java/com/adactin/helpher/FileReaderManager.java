package com.adactin.helpher;

import java.io.IOException;

import com.adactin.properties.ConfigReader;

public class FileReaderManager {
	
	
	private void FileReaderManager() {


	}

	public static FileReaderManager getInstance() {

		FileReaderManager helpher = new FileReaderManager();
		return helpher;

	}


	public ConfigReader getInstanceCR() throws IOException {

		ConfigReader cr  = new ConfigReader();
		return cr;	
	}





}
