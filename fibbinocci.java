package week1.day1;

public class fibbinocci {
	public static void main(String[] args) {
	
		
	
	int a=0;
	int b=1;
	int c;
System.out.print(" "+a);
System.out.print(" "+b);
for(int i=0;i<=15;i++) {
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
}
}
}