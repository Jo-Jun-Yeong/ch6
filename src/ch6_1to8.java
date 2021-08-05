/* #ch6-1 객체 지향 언어(Object - orinated - Programing)
 * 	1. 캡슐화
 * 	2. 상속
 *  3. 추상화
 *  4. *다형성*
 *  
 *  객체 지향 언어 = 프로그래밍 언어 + 객체지향 개념(규칙)
 *  
 * #ch6-2
 *  클래스 : 객체를 정의 해 놓은 것, 객체를 생성하는데 사용
 *  객체 : 시물, 또는 개념, 객체마다의 기능과 속성에 따라 다르다
 *  
 *  객체 = 속성(변수)+기능(메서드)
 *  ex) class Tv{
 *  		String color;
 *  		booleean power;
 *  		int channel;
 *  	//위는 속성
 *  		void Power() {power  = !power;}
 *  		void channelDown {channel--;}
 *  		void channelUp{channel++;}
 *  	//속성 아래부터 기능(메서드)
 *  	}
 * #6-4 객체와 인스턴스
 *  class(설계도)  --(인스턴스화)-> 인스턴스(객체)(제품)
 *  
 * #6-5 하나의 소스에 여러 클래스 작성
 * 	*올바른 작성
 * 	1. public class가 있는 경우 소스파일의 이름은 반듣시 public class와 같아야 한다.
 * 	2. public class가 하나도없는 경우 소스파일의 이름은 어떤 class라도 된다
 *
 *	*잘못된 작성
 *	1. 하나의 소스파일에 둘 이상의 public class가  존재하면 안되다.
 *	2. 소스파일의 이름이 public class와 이름이 일치하지 않다, 대.소문자를 구분하므로 주의.
 *
 * #6-6 객체의 생성과 사용
 * 1. 객체의 생성
 * 	클래스명 변수 명; //클래스의 객체를 참조하기 위한 참조변수 선언
 * 	변수 명 = new 클래스명(); 	//클래스의 객체 생성 후, 객체의 주소를 참조변수에 선언
 * 	Tv t; 		//참조변수 t선언
 *  t=new Tv(); //참조변수 t에 Tv의 인스턴스 주소를 저장
 *  
 * 2. 객체의 사용 = 변수, 메서드의 사용
 * 	참조변수.메서드;
 * 
 * 		*기본형(int, String, booleean, float, double, char, long, byte)
 * 		을 제외한 참조변수는 모두 참조형이다
 * 
 * 	선언 : 클래스명 참조변수 = new 클래스명();
 * 
 * #6-8 객체 배열
 * 	객체 배열 == 참조변수의  배열
 *  Tv tv1, tv2, tv3 = Tv[] tvArr = new Tv[3];
 *  				 =
 *  				   tvArr[0]=new Tv();
 *   				   tvArr[1]=new Tv();
 *     				   tvArr[2]=new Tv();          
 *     				 =
 *     				   Tv [] tvArr = {newTv(),newTv(),newTv()};	   
 * */
public class ch6_1to8 {

}
