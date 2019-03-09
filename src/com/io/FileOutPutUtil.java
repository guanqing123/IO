package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutUtil {
	
	public static void output(String fileName) throws IOException {
		//如果该文件不存在,则直接创建,如果存在,删除后创建
		FileOutputStream out = new FileOutputStream(fileName);
		out.write('A');//写出了'A'的低八位
		out.write('B');//写出了'B'的低八位
		int a = 10;//write只能写八位,那么写一个int需要写4次每次8位
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();
		
		FileInPutUtil.printHex(fileName);
	}
	
	public static void copyFile(File srcFile,File destFile) throws IOException {
		if (!srcFile.exists())
			throw new IllegalArgumentException("文件"+srcFile+"不存在");
		if (!srcFile.isFile())
			throw new IllegalArgumentException(srcFile+"不是文件");
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8*1024];
		int b;
		while((b = in.read(buf, 0, buf.length))!=-1) {
			out.write(buf, 0, b);
			out.flush();//最好加上
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
//		output("C:\\Users\\information\\Desktop\\新建文件夹\\out.dat");
		copyFile(new File("C:\\Users\\information\\Desktop\\SI\\中控屏配置说明.txt"), new File("C:\\\\Users\\\\information\\\\Desktop\\\\SI\\\\copy.txt"));
	}
}
