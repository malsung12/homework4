import java.util.Scanner;

public class SumOfNumbers {
	Scanner b = new Scanner(System.in);
	int su;
	int i, j, total = 0;
	
	public void Number(){
		for(j = 0; j < 1; j--){
		System.out.print("���Է�(����:0): ");
		su = b.nextInt();
		
		for(i = 0; i <= su; i++){
			total += i;
		}
		System.out.println("����: " + total);
		
		if(su == 0)
		break;
		}
	}
}