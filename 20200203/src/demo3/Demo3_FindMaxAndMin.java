package demo3;

public class Demo3_FindMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,4,2,1,23,344,12};
		//�����һ��������Сֵ
		int min = nums[0];
		//�����һ���������ֵ
		int max = nums[0];
		//ѭ��������Ԫ�رȽϣ������ĳ��Ԫ�ش���ֵ�޸�
		for(int i=1; i < nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i]; 
			}
			if(max < nums[i]) {
				max = nums[i];
			}
			
		}
		
		System.out.println("�����е���Сֵ��"+min);
		System.out.println("�����е����ֵ��"+max);
	}

}
