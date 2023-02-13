package day06;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//<><=>===!=---->true/false
		int a=10;
		int b=20;
		double c=20.0;
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println(a>b);//f
		System.out.println(b>a);//f
		System.out.println(a<b);//f
		System.out.println(b<a);//f
		
		System.out.println("%%%%%%%%%%%%%");
		System.out.println(a>b);//t
		System.out.println(b>a);//t
		System.out.println(a<b);//t
		System.out.println(b<a);//t
		
		System.out.println("%%%%%%%%%%%%%");
		System.out.println(a>=b);//t
		System.out.println(b>=a);//t
		System.out.println(a<=b);//t
		System.out.println(b<=a);//t
		
		System.out.println("%%%%%%%%%%%%%");
		System.out.println(a==b);//f
		System.out.println(b!=a);//t
		System.out.println(b==c);//t
		System.out.println(b!=c);//f
	}

}
