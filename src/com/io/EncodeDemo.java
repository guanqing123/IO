package com.io;

public class EncodeDemo {

	public static void main(String[] args) {
		
		String s = "慕课ABC";
		byte[] byte1 = s.getBytes();
		for (byte b : byte1) {
			// 把字节 (转换成了int)以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff) +" ");
			
			// 把字节 (转换成了int) 以16进制的方式显示
			Integer.toHexString(b & 0xff);
			// &是位操作符,"按位与"当&作为位运算时,1&1=1,1&0=0,0&0=0
			// 举个栗子: a=1;b=2;a&b=0
			// 计算方法为:
			// 1转成二进制 01
			// 2转成二进制 10
			// 所以, a&b=00 转成十进制为0
			// 0xff 是什么
			// 0x 表示是十六进制
			// ff 是两个十六进制的数,每个f用二进制表示是1111,所以占四位(bit),两个f(ff)占八位(bit),八位(bit)也就是一个字节
			
			//https://blog.csdn.net/u010648159/article/details/51384202
			//https://blog.csdn.net/Jamie_Jiang/article/details/78343549
			
		}
		
	}
	
}
