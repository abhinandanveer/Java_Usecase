package Usecase;
class Constructor{
	private int l;
	private int b;
	
	public Constructor(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public int area() {
		int a=l*b;
		return a;
	}
	
}

public class construct {
	public static void main(String[] args) {
		Constructor details =new Constructor(2,2);
		System.out.println(details.area());
		
		
		
		
	}

}
