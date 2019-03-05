package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		//了解构造函数的情况,查帮助
		File file = new File("C:\\Users\\information\\Desktop\\新建文件夹\\file");
		//File.separator 设置分隔符
		//System.out.println(file.exists());
		if (!file.exists())
			file.mkdir();//file.mkdirs();
		else
			file.delete();
		//是否是一个目录 如果是目录返回true,如果不是目录or目录不存在返回false
		System.out.println(file.isDirectory());
		//是否是一个文件
		System.out.println(file.isFile());
		
		//File file2 = new File("C:\\Users\\information\\Desktop\\新建文件夹\\日记.txt");
		File file2 = new File("C:\\Users\\information\\Desktop\\新建文件夹", "日记.txt");
		if (!file2.exists())
			file2.createNewFile();
		else
			file2.delete();
		
		//常用的File对象API
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
	}
	
}
