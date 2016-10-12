import java.util.Scanner;
public class GuGuDan {
	Scanner e = new Scanner(System.in);
	
	int num1, num2, i, sum=0;
	
	public void gugu(){
		
		for(i = 1; i < 2; i--){
			System.out.print("구구단(종료0): ");
			num1 = e.nextInt();
			
			if(num1 == 0)
				break;
			
			if(num1 > 9){
				System.out.print("잘못입력");
				continue;
			}
			if(num1 < 2){
				System.out.print("잘못입력");
				continue;
			}

			for(num2 = 1; num2 <=9; num2++){
				sum = num1 * num2;
				System.out.println(num1+"*"+num2+"="+sum);
			}
			System.out.println("------------------------");
		}
	}
}
