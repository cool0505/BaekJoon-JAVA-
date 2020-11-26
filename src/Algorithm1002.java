import java.util.Scanner;
//터렛
public class Algorithm1002 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		int x1,x2,y1,y2,r1,r2;
		double d;
		for(int i=0;i<T;i++) {
			x1=in.nextInt();
			y1=in.nextInt();
			r1=in.nextInt();
			x2=in.nextInt();
			y2=in.nextInt();
			r2=in.nextInt();
			d=Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
			
			if(x1==x2&&y1==y2&&r1==r2) System.out.println(-1);
			else if(d==r1+r2||Math.abs(r1-r2)==d)
				System.out.println(1);
			else if(d>r1+r2||x1==x2&&y1==y2&&r1!=r2||d<Math.abs(r1-r2))
				System.out.println(0);
			else System.out.println(2);
		}
	}

}