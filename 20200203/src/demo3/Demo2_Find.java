package demo3;

import java.util.Scanner;

public class Demo2_Find {

	public static void main(String[] args) {
		// 12	23	34	45	56	67
		int[] nums = {12,	23,	34,	45,	56,	67};
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		int n = input.nextInt();
		
		int start, end;
		start = 0;
		end = nums.length-1;
		boolean flg = true;//true��ʾ������
		while(start <=end) {
			//ȷ���Ƚϵ��±�
			int index = (start + end)/2;
			if(nums[index] == n) {
				System.out.println(n+"���ڣ������еĵ�"+(index+1)+"��λ��");
				flg = false;//false��ʾ����
				break;				
			}else if(n > nums[index]) {
				//Ҫ���ҵ����ں��Σ��޸�start
				start= index+1;
			}else {
				//Ҫ���ҵ�����ǰ��Σ��޸�end
				end = index -1;
			}
		}
		
		if(flg == true) {
			System.out.println(n+"�������в�����");
		}
		
//		if(start >end) {
//			System.out.println(n+"�������в�����");
//		}
	}

}
