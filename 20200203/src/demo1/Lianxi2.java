package demo1;

public class Lianxi2 {

	public static void main(String[] args) {
		// ��1+2!+3!+...+20!�ĺ�
		// ��ѭ����n�Ľ׳ˣ���ѭ���ۼ�
		long sum=0, cj = 1;
		for(int i=1; i<=20; i++) {
			cj = 1;
			for(int j=1; j<=i; j++) {
				cj = cj * i;
			}
			sum = sum + cj;
		}
		
		System.out.println("1+2!+3!+...+20! = "+sum);

	}

}
