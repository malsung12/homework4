import java.util.Scanner;

public class MaxAndMin {
	Scanner c = new Scanner(System.in);
	int[] num = new int[10] ;
    int max =  1, min = 100, i, j, k;
    
	public void max(){
    
	for(j = 0; j < 2; j--){
		for(i = 0; i < 10; i ++){
			System.out.print("���ڸ� �Է��ϼ���(����:0): ");
			num[i] = c.nextInt();
    
			if(num[i] == 0){
				k = num[i];
				break;
			}
			
			if(num[i] < min)
				min = num[i];
			if(num[i] > max)
				max = num[i];
			}
		System.out.println("���� ū ����" + max + "�̰� ���� ���� ���� " + min + "�Դϴ�.");
		if(k == 0)
			break;
		for(i = 0; i < 10; i++)
			num[i] = 0;
		max = 0;
		min = 0;
		}
	}
}