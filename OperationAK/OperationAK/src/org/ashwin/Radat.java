package org.ashwin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Radat {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Documents\\New Text Document.txt");
		int read = f.read();
		System.out.println((char)read);
	}

}
