package homework;

import java.util.Scanner;

public class Hw2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������������ߵĳ���");
		int b1 = input.nextInt();
		int b2 = input.nextInt();
		int b3 = input.nextInt();
		//����֮�ʹ��ڵ�����
		if(b1+b2>b3 && b1+b3>b2 && b2+b3>b1) {
			//����֮��С�ڵ�����
			//Math.abs(num) ����num�ľ���ֵ
			if(Math.abs(b1-b2)<b3 && Math.abs(b1-b3)<b2 && Math.abs(b2-b3)<b1) {
				System.out.println("�����߿��Թ���������");
			}else {
				System.out.println("�����߲����Թ���������");
			}
		}else {
			System.out.println("�����߲����Թ���������");
		}

	}

}
