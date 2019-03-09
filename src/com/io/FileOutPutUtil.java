package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutUtil {
	
	public static void output(String fileName) throws IOException {
		//������ļ�������,��ֱ�Ӵ���,�������,ɾ���󴴽�
		FileOutputStream out = new FileOutputStream(fileName);
		out.write('A');//д����'A'�ĵͰ�λ
		out.write('B');//д����'B'�ĵͰ�λ
		int a = 10;//writeֻ��д��λ,��ôдһ��int��Ҫд4��ÿ��8λ
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		
		byte[] gbk = "�й�".getBytes("gbk");
		out.write(gbk);
		out.close();
		
		FileInPutUtil.printHex(fileName);
	}
	
	public static void copyFile(File srcFile,File destFile) throws IOException {
		if (!srcFile.exists())
			throw new IllegalArgumentException("�ļ�"+srcFile+"������");
		if (!srcFile.isFile())
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8*1024];
		int b;
		while((b = in.read(buf, 0, buf.length))!=-1) {
			out.write(buf, 0, b);
			out.flush();//��ü���
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
//		output("C:\\Users\\information\\Desktop\\�½��ļ���\\out.dat");
		copyFile(new File("C:\\Users\\information\\Desktop\\SI\\�п�������˵��.txt"), new File("C:\\\\Users\\\\information\\\\Desktop\\\\SI\\\\copy.txt"));
	}
}
