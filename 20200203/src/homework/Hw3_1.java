package homework;

public class Hw3_1 {

	public static void main(String[] args) {
		//����ǰ������
		int num1 = 1, num2 = 1;
		System.out.print(num1+"\t"+num2+"\t");
		//ѭ�������������
		for(int cnt = 3; cnt <= 10; cnt++) {
			int num = num1 + num2;
			System.out.print(num+"\t");
			if(cnt == 5) {
				System.out.println();
			}
			//�ı�num1 ��num2
			num1 = num2;
			num2 = num;
		}

	}

}
