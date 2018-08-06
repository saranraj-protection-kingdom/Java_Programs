import java.util.Scanner;

public class Line_Insertion_Point {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c1,c2,x1,x2,x3,x4,y1,y2,y3,y4,m,m1,y=0,x;
		x1=sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		x4 = sc.nextInt();
		y4 = sc.nextInt();
		//x = sc.nextInt();
		m = (y2-y1)/(x2-x1);
		c1 = y1-m*x1;
		m1 = (y4-y3)/(x4-x3);
		c2 = y3-m1*x3;
//		y = m*x+c;
		x = (c2-c1)/(m-m1);
		y = (m*x)+c1;
		System.out.println("x => "+x);
		System.out.println("y => "+y);
		sc.close();
	}

}
