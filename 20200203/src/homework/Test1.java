package homework;

import java.util.Random;
import java.util.Scanner;;

public class Test1 {

	public static void main(String[] args) {
		//��� System.out.println();
		System.out.println("hello");
		//����-10�ľ���ֵ
		System.out.println(Math.abs(9-19));
		
		//����2��10��
		System.out.println(Math.pow(2, 10));
		
		int rs1 = (int)Math.pow(2, 10);
		System.out.println(rs1);
		
		//���ܼ��������int
		Scanner input = new Scanner(System.in);
		int rs2 = input.nextInt();
		System.out.println("rs2 = "+rs2);
		
		//���1~3֮����
		Random ran = new Random();
		int rs3 = ran.nextInt(3) + 1;
		System.out.println(rs3);
		System.out.println("over");

	}

}
