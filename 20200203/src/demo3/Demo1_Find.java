package demo3;

import java.util.Scanner;

public class Demo1_Find {

	public static void main(String[] args) {
		//8,4,2,1,23,344,12
		int[] nums = {8,4,2,1,23,344,12};
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		int n = input.nextInt();
		//���������в�����
		boolean isExits = false;
		int i;
		for( i=0; i< nums.length; i++) {
			if(nums[i] == n) {
				System.out.println(n+"���ڣ������еĵ�"+(i+1)+"��λ��");
				isExits = true;
				break;
			}
		}
//		if(i == nums.length) {
//			System.out.println(n+"�������в�����");
//		}
		if(isExits==false) {
			System.out.println(n+"�������в�����");
		}

	}

}
