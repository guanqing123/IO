package com.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInPutUtil {


	/**
	 * 读取指定文件内容,按照16进制输出到控制台
	 * 并且每输出10个byte换行
	 * @param fileName
	 * @throws IOException 
	 */
	public static void printHex(String fileName) throws IOException {
		//把文件作为字节流进行读操作
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 1;
		while((b = in.read()) != -1){
			if (b <= 0xf) {
				//单位数前面补0
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
		/*从in中批量读取字节,放入到buf这个字节数组中,
		 *从第0个位置开始放,最多放buf.length个
		 *返回的是读到的字节的个数
		 */
		int bytes = in.read(buf, 0, buf.length);//一次性读完,说明字节数组足够大
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
			printHex("C:\\Users\\information\\Desktop\\SI\\中控屏配置说明.txt");
			//printHexByByteArray("C:\\Users\\information\\Desktop\\SI\\中控屏配置说明.txt");
			//printHexByteArray("C:\\\\Users\\\\information\\\\Desktop\\\\SI\\\\中控屏配置说明.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
