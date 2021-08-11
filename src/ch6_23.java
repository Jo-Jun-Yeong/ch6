class Data{int x;}

public class ch6_23 {
	public static void main(String arg []) {
		Data d = new Data();
		d.x=3;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		
	}
	
	public static void change(int x) {
		x = 10000;
		System.out.println("change() : x = " + x);
	}
}
