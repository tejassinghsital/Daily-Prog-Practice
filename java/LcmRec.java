import java.util.Scanner;
import java.lang.Math;

public class LcmRec{
	public static void main(String[] args){
		// Scanner sc= new Scanner(System.in);
		// int num=sc.nextInt();

		System.out.println(hcfx(1,76));
		
	}
	public static int hcfx(int num1, int num2){
		int max=Math.max(num1,num2);
		int count=1;
		for(int i=1;i<=max;i++){
			if((num1%i==0)&&(num2%i==0)){
				num1=num1/i;
				num2=num2/i;
				count=count*i;
				i=1;
				//System.out.println(num1+"..."+num2+"..."+count);
			}		
		}
		return count;
		}
}


