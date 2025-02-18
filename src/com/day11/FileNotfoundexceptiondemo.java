package com.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Checked Exc
public class FileNotfoundexceptiondemo {

	//throws->approach->delegate the responsibilities.
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		    FileInputStream file=new FileInputStream("test.txt");
			int data=file.read();
	}

}
