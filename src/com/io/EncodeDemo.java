package com.io;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {		
		String s = "Ľ��ABC";
		byte[] byte1 = s.getBytes(); //ת�����ֽ������õ�����ĿĬ�ϵı���gbk
		for (byte b : byte1) {
			/*int ���� 32λ,byte ����8λ,��24λ���������(�����е�������ʽ����
			 * ,ǰ��24λȡֵ����ȷ��(��Ϊ����,����ò��뷽ʽ,ǰ24λ�Ჹ��1),
			 * �Ұ�����Ϊ����һ�������),ʹ��  & 0xff ����,���԰Ѹ� 
			 * 24 λ��Ϊ0,0x��ʾ16���� ff=11111111
			 */
			// ���ֽ� (ת������int)��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] byte2 = s.getBytes("gbk");
		//gbk��������ռ��2���ֽ�,Ӣ��ռ��1���ֽ�
		for (byte b : byte2) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] byte3 = s.getBytes("utf-8");
		//utf-8��������ռ��3���ֽ�,Ӣ��ռ��1���ֽ�
		for (byte b : byte3) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		//java��˫�ֽڱ��� utf-16be
		byte[] byte4 = s.getBytes("utf-16be");
		//utf-16be ����ռ��2���ֽ�,Ӣ��ռ��2���ֽ�
		for (byte b : byte4) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		/*
		 * ������ֽ�������ĳ�ֱ���ʱ,���ʱ������ֽ����б��
		 * �ַ���,Ҳ��Ҫ�����ֱ��뷽ʽ,������������
		 */
		String str1 = new String(byte4);//����ĿĬ�ϵı���
		System.out.println(str1);
		String str2 = new String(byte4,"utf-16be");
		System.out.println(str2);
		/*
		 * �ı��ļ� �����ֽ�����
		 * ���������������ֽ�����
		 * ������������Ļ�����ֱ�Ӵ����ı��ļ�,��ô���ı��ļ�ֻ��ʶansi����
		 * ��ͨ��������һ���ɺ�,�������÷�����utf-8����Ĺ���.
		 */
	}

}
