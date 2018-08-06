import java.util.Scanner;

public class LineEquation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c,x1,x2,y1,y2,m,y=0,x;
		x1=sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x = sc.nextInt();
		m = (y2-y1)/(x2-x1);
		c = y1-m*x1;
		y = m*x+c;
		System.out.println(y);
		sc.close();
	}

}
