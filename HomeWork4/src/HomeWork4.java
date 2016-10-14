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
		System.out.println("반복문 연습하기1");
		System.out.println("************");
		
		for(i = 0; i < 1; i--){
		System.out.println("1.1부터 입력한 수까지 더하기");
		System.out.println("2.최대값 최소값 구하기");
		System.out.println("3.입력받은 숫자의 합계와 평균규하기");
		System.out.println("4.원하는 구구단 출력하기");
		System.out.println("5.짝수단 홀수단 출력하기");
		System.out.println("6.종료");
		System.out.println("번호를 입력하시오: ");
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
