package demo1;

import java.util.Random;
import java.util.Scanner;

public class Lianxi3 {

	public static void main(String[] args) {
		String ans ;
		do {
			Random ran = new Random();
			int num = ran.nextInt(100) + 1;
			Scanner input = new Scanner(System.in);
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
			
			System.out.println("�Ƿ�����һ�֣�y/n");
			ans = input.next();
		}while(ans.equalsIgnoreCase("y"));//equalsIgnoreCase()���Դ�Сд�Ƚ��ַ���

	}

}
