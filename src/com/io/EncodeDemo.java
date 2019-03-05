package com.io;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {		
		String s = "慕课ABC";
		byte[] byte1 = s.getBytes(); //转换成字节序列用的是项目默认的编码gbk
		for (byte b : byte1) {
			/*int 类型 32位,byte 类型8位,高24位具有随机性(从所有的数字形式来看
			 * ,前面24位取值并不确定(因为负数,会采用补码方式,前24位会补成1),
			 * 我把它视为具有一定随机性),使用  & 0xff 操作,可以把高 
			 * 24 位设为0,0x表示16进行 ff=11111111
			 */
			// 把字节 (转换成了int)以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] byte2 = s.getBytes("gbk");
		//gbk编码中文占用2个字节,英文占用1个字节
		for (byte b : byte2) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] byte3 = s.getBytes("utf-8");
		//utf-8编码中文占用3个字节,英文占用1个字节
		for (byte b : byte3) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		//java是双字节编码 utf-16be
		byte[] byte4 = s.getBytes("utf-16be");
		//utf-16be 中文占用2个字节,英文占用2个字节
		for (byte b : byte4) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		/*
		 * 当你的字节序列是某种编码时,这个时候想把字节序列变成
		 * 字符串,也需要用这种编码方式,否则会出现乱码
		 */
		String str1 = new String(byte4);//用项目默认的编码
		System.out.println(str1);
		String str2 = new String(byte4,"utf-16be");
		System.out.println(str2);
		/*
		 * 文本文件 就是字节序列
		 * 可以是任意编码的字节序列
		 * 如果我们在中文机器上直接创建文本文件,那么该文本文件只认识ansi编码
		 * 联通、联这是一种巧合,他们正好符合了utf-8编码的规则.
		 */
	}

}
