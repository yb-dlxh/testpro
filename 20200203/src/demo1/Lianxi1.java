package demo1;

import java.util.Scanner;

public class Lianxi1 {

	public static void main(String[] args) {
		// ��д���򣬴Ӽ�������6��ѧ����5�ųɼ����ֱ�ͳ�Ƴ�ÿ��ѧ����ƽ���ɼ�
		Scanner input= new Scanner(System.in);
		double sum = 0;
		for(int j=1; j<=6; j++) {
			//sum = 0;
			for(int i=1; i<=5; i++) {//����5���ɼ������
				System.out.println("�������"+i+"�ſγɼ�");
				int cj = input.nextInt();
				sum = sum + cj;
			}
			System.out.println("��"+j+"��ѧ����ƽ���ɼ���"+(sum/5));
		}

	}

}
