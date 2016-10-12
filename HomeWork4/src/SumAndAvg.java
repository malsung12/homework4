import java.util.Scanner;

public class SumAndAvg {
	Scanner c = new Scanner(System.in);
	int num1, i, j, total = 0;
	double avg, sum = 0;
	
	public void avg(){
		for(i = 0; i <=2; i--){
			sum = 0;
			total = 0;
			for(j = 1; j <= 5; j++){
				System.out.print("숫자를 입력(0:종료)>> ");
					num1 = c.nextInt();
					if(num1 == 0)
						break;
					sum += num1;
					total += num1;
			}
			avg = sum /5;
			System.out.println("합계는 "+total+"이고, 평균은 "+avg+"입니다.");
			if(num1 == 0)
				break;
		}
	}
}
