package com.io;

public class EncodeDemo {

	public static void main(String[] args) {
		
		String s = "Ľ��ABC";
		byte[] byte1 = s.getBytes();
		for (byte b : byte1) {
			// ���ֽ� (ת������int)��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff) +" ");
			
			// ���ֽ� (ת������int) ��16���Ƶķ�ʽ��ʾ
			Integer.toHexString(b & 0xff);
			// &��λ������,"��λ��"��&��Ϊλ����ʱ,1&1=1,1&0=0,0&0=0
			// �ٸ�����: a=1;b=2;a&b=0
			// ���㷽��Ϊ:
			// 1ת�ɶ����� 01
			// 2ת�ɶ����� 10
			// ����, a&b=00 ת��ʮ����Ϊ0
			// 0xff ��ʲô
			// 0x ��ʾ��ʮ������
			// ff ������ʮ�����Ƶ���,ÿ��f�ö����Ʊ�ʾ��1111,����ռ��λ(bit),����f(ff)ռ��λ(bit),��λ(bit)Ҳ����һ���ֽ�
			
			//https://blog.csdn.net/u010648159/article/details/51384202
			//https://blog.csdn.net/Jamie_Jiang/article/details/78343549
			
		}
		
	}
	
}
