package homework;

import java.util.Random;
import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {
		// �������1����β���1~100֮���������
//		double num = Math.random() *100 + 1;//����0~1֮���С��[0,1)
//		//0~100֮���С��[0,100)
//		//1~101֮��С��[1, 101)
//		int num2 = (int)num;//1~100֮�������
		
		//int num = (int)(Math.random() *100 + 1);
		
		Random ran = new Random();
		int num = ran.nextInt(100) + 1;//0~100֮�������[0,100), ����[1, 101)
		Scanner input = new Scanner(System.in);
		//������⣺��ѭ���������Ⱦͽ���ѭ��
		//ѭ���壺���룬�Ƚϣ������Ƚ���ѭ����������ȼ������룬�Ƚ�
		int cnt = 0;//ͳ������Ĵ���
		while(true) {
			System.out.println("������1~100֮�������");
			int num2 = input.nextInt();
			cnt++;
			if(num2 == num) {
				break;
			}
			if(num2 > num) {
				System.out.println("̫���ˣ�Сһ��");
			}else {
				System.out.println("̫С�ˣ���һ��");
			}
		}
		System.out.println("��ϲ��¶���");
		if(cnt==1) {
			System.out.println("��̫������");
		}else if(cnt >=2 && cnt <=5) {
			System.out.println("�����ٽ�������");
		}else {
			System.out.println("ҪŬ����");
		}
	}

}
