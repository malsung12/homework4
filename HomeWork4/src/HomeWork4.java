import java.util.Scanner;
public class HomeWork4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		SumOfNumbers sum = new SumOfNumbers();
		SumAndAvg avg = new SumAndAvg();
		MaxAndMin max = new MaxAndMin();
		GuGuDan gugu = new GuGuDan();
		GuGuDan2 gugu2 = new GuGuDan2();
		
		int i, select = 0;
		
		System.out.println("************");
		System.out.println("�ݺ��� �����ϱ�1");
		System.out.println("************");
		
		for(i = 0; i < 1; i--){
		System.out.println("1.1���� �Է��� ������ ���ϱ�");
		System.out.println("2.�ִ밪 �ּҰ� ���ϱ�");
		System.out.println("3.�Է¹��� ������ �հ�� ��ձ��ϱ�");
		System.out.println("4.���ϴ� ������ ����ϱ�");
		System.out.println("5.¦���� Ȧ���� ����ϱ�");
		System.out.println("6.����");
		System.out.println("��ȣ�� �Է��Ͻÿ�: ");
		select = a.nextInt();
		
		if(select == 1)
			sum.Number();
		if(select == 2)
			max.max();
		if(select == 3)
			avg.avg();
		if(select == 4)
			gugu.gugu();
		if(select == 5)
			gugu2.gugu2();
		if(select == 6)
			break;
		}
	}

}
