package com.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInPutUtil {


	/**
	 * ��ȡָ���ļ�����,����16�������������̨
	 * ����ÿ���10��byte����
	 * @param fileName
	 * @throws IOException 
	 */
	public static void printHex(String fileName) throws IOException {
		//���ļ���Ϊ�ֽ������ж�����
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 1;
		while((b = in.read()) != -1){
			if (b <= 0xf) {
				//��λ��ǰ�油0
				System.out.print(0);
			}
			System.out.print(Integer.toHexString(b) +" ");
			if (i++ % 10 == 0) {
				System.out.println();
			}
		}
		in.close();
	}
	
	public static void printHexByByteArray(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20 * 1024];
		/*��in��������ȡ�ֽ�,���뵽buf����ֽ�������,
		 *�ӵ�0��λ�ÿ�ʼ��,����buf.length��
		 *���ص��Ƕ������ֽڵĸ���
		 */
		int bytes = in.read(buf, 0, buf.length);//һ���Զ���,˵���ֽ������㹻��
		int j = 1;
		for (int i = 0; i < bytes; i++) {
			System.out.print(Integer.toHexString(buf[i] & 0xff) +" ");
			if (j++%10==0) {
				System.out.println();
			}
		}
		in.close();
	}
	
	public static void printHexByteArray(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20 * 1024];
		int bytes;
		int j = 1;
		while((bytes = in.read(buf, 0, buf.length)) != -1) {
			for (int i = 0; i< bytes; i++) {
				System.out.print(Integer.toHexString(buf[i] & 0xff) + " ");
				if (j++%10==0) {
					System.out.println();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		try {
			printHex("C:\\Users\\information\\Desktop\\SI\\�п�������˵��.txt");
			//printHexByByteArray("C:\\Users\\information\\Desktop\\SI\\�п�������˵��.txt");
			//printHexByteArray("C:\\\\Users\\\\information\\\\Desktop\\\\SI\\\\�п�������˵��.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
