package com.techlab.test;

import java.io.*;

public class ImageTest {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/circle.png");
	    FileInputStream inputStream = new FileInputStream(file);
	    byte bytes[] = new byte[(int) file.length()/2];
	    FileOutputStream outputStream = new FileOutputStream("D:/half-circle.png");
	    outputStream.write(bytes);
	    System.out.println("Image Created!!!");
	}	
}
