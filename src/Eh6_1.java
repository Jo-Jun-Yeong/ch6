
public class Eh6_1 {
	public  static  void main(String [] args) {
		Tv t = new Tv();
		
		t.channel=7;
		t.color = "black";
		
		t.channelDown();
		t.channelDown();
		
		System.out.println(t.channel);
	}
}

class Tv{
	int channel;
	boolean power;
	String color;
	
	public void chnnelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
	public void power() {
		power = !power;
	}
}
