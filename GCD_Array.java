import java.util.Arrays;
import java.util.Scanner;
public class GCD_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i,small,flag=0;
		size = sc.nextInt();
		int []arr = new int[size];
		for(i=0;i<size;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		small = arr[0];
		
		for(i=small;i>1;i--) {
			for(int j=0;j<size;j++) {
				if(arr[j]%i==0)
					flag = 1;
				else
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
