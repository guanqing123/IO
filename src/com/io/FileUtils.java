package com.io;

import java.io.File;

//�г�File��һЩ���ò���������ˡ������Ȳ���
public class FileUtils {
	
	/**
	 * �г�ָ��Ŀ¼��(��������Ŀ¼)�������ļ�
	 * @param dir
	 */
	public static void listDirectory(File dir) {
		if (!dir.exists())
			throw new IllegalArgumentException("Ŀ¼:"+dir+"������.");
		if (!dir.isDirectory())
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		/* ���ص����ַ�������,ֱ���ӵ�����,��������Ŀ¼�µ�����
		String[] strs = dir.list();
		for (String str : strs) {
			System.out.println(dir + "\\" + str);
		}*/
		//���Ҫ������Ŀ¼�µ����ݾ���Ҫ�����File�������ݹ����,File�ṩ��ֱ�ӷ���File�����API
		File[] files = dir.listFiles();//���ص���ֱ����Ŀ¼(�ļ�)�ĳ���
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					//�ݹ�
					listDirectory(file);
				}else {
					System.out.println(file);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\information\\Desktop\\log");
		listDirectory(file);
	}
}
