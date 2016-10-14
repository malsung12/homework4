import java.util.Scanner;
public class GuGuDan2 {
	Scanner f = new Scanner(System.in);
	
	int num1,num2,i,sum=0;
	int select;
	
	public void gugu2(){
		
		for(i = 1; i < 2; i--){
			System.out.print("Â¦¼ö:1 È¦¼ö:2 Á¾·á:3>> ");
			select = f.nextInt();
			if(select == 1){
				for(num2 = 2; num2 <= 9; num2+=2){
					for(num1 = 1; num1 <= 9; num1++){
						sum = num2 * num1;
						System.out.println(num2+"*"+num1+"="+sum);
					}
					System.out.println();
				}
			}
			if(select == 2){
				for(num2 = 3; num2 <= 9; num2+=2){
					for(num1 = 1; num1 <=9; num1++){
						sum = num1 * num2;
						System.out.println(num2+"*"+num1+"="+sum);
					}
					System.out.println();
				}
			}
			if(select == 3)
				break;
		}
	}
}
