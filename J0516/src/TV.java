
public class TV {     //class는 대문자로 써야한다
	                  //전부 대문자면 상수

	String color;    //클래스 바로 아래있는 변수들은 디폴트값이 들어간다 = 0
	                 //String에는 
	//지역변수는 기본값 없으면 에러난다
	//클래스 변수는 없어도 가능함
	
	//뒤에 ()가 있으면 메소드
	
	
	boolean power;
	int channel;
	int volume;
	final int NUM=0;
	
	//파워 메소드
	void power() {
		power = !power;
	}
	
	//채널업 메소드
	void channelUp() {
		if(channel>=999) {
			channel = 1;
			return;
		}
		channel++;			
	}
	
	//채널다운 메소드
	void channelDown() {
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
	}
	
	
	void volumeUp() {
		if(volume>=999) {
			volume=1;
			return;
		}
		volume++;
	}
	
	void volumeDown() {
		if(volume<=1) {
			volume=0;
			return;
		}
		volume--;
	}
	
	
	
	
}
