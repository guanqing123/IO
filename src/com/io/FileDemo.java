package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		//�˽⹹�캯�������,�����
		File file = new File("C:\\Users\\information\\Desktop\\�½��ļ���\\file");
		//File.separator ���÷ָ���
		//System.out.println(file.exists());
		if (!file.exists())
			file.mkdir();//file.mkdirs();
		else
			file.delete();
		//�Ƿ���һ��Ŀ¼ �����Ŀ¼����true,�������Ŀ¼orĿ¼�����ڷ���false
		System.out.println(file.isDirectory());
		//�Ƿ���һ���ļ�
		System.out.println(file.isFile());
		
		//File file2 = new File("C:\\Users\\information\\Desktop\\�½��ļ���\\�ռ�.txt");
		File file2 = new File("C:\\Users\\information\\Desktop\\�½��ļ���", "�ռ�.txt");
		if (!file2.exists())
			file2.createNewFile();
		else
			file2.delete();
		
		//���õ�File����API
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
	}
	
}
