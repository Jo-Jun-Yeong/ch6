
public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("현제 t1의 채녈" +  t1.channel + "입니다");
		System.out.println("현제 t2의 채녈" +  t2.channel + "입니다");
		
		t1.channel=7;
		System.out.println("현제 t1의 채녈" +  t1.channel + "입니다");
		System.out.println("현제 t2의 채녈" +  t2.channel + "입니다");
		
		
		//객체마다 별도의 저장공간을 가지고 있다는것을 알 수 있다.
	}

}
