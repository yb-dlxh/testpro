package demo1;

public class Demo1 {

	public static void main(String[] args) {
		
	 for(int j=1; j<=5; j++) {	
		for(int i=1; i<=5; i++) {//��ѭ����һ��5��*
			System.out.print("*");
		}
		System.out.println();//��ѭ������
	 }
	 System.out.println("----------------------------");
	 for(int j=1; j<=5; j++) {
		 
		 for(int i=1; i<=j; i++) {//��ѭ��,һ��j��
			 System.out.print("*");
		 }
		 
		 System.out.println();//��ѭ������
	 }
	 System.out.println("----------------------------");
	 for(int j=5; j>=1; j--) {
		 for(int i=1; i<=j; i++) {//��ѭ��,һ��j��
			 System.out.print("*");
		 }
		 
		 System.out.println();//��ѭ������
	 }
	 System.out.println("----------------------------");
	 for(int j=1; j<=9; j++) {
		 for(int i=1; i<=j; i++) {//��ѭ��,��ӡ�˷�ʽ��
			 System.out.print(j+"*"+i+"="+(i*j)+"\t");
		 }
		 System.out.println();
	 }
	 System.out.println("----------------------------");
	 for(int j=1; j<=5; j++) {
		 
		 for(int i=1; i<=j; i++) {//��ѭ��,һ��j��
			 System.out.print(i);
		 }
		 
		 System.out.println();//��ѭ������
	 }
	}
	

}
