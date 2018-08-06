import java.util.Arrays;
import java.util.Scanner;

public class LCM_Of_Array_Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,j,i,Big,flag = 0;
		size = sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		Big = arr[size-1];
		for(i=1;;i++) {
			for(j=0;j<size;j++) {
				if((Big*i)%arr[j] ==0)
				{
					flag = 1;
				}
				else {
					flag = 0;
					break;
				}
			}
			if(flag ==1) {
				System.out.println(Big*i);
				break;
			}
		}
	}

}
