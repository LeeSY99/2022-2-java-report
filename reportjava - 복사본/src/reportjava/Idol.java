package reportjava;

public class Idol extends Kpop{
	int members;
	
	public Idol(String hitsong,int member) {
		super(hitsong);
		this.members=member;
	}
	
	void memprint() {
	}
	public void hitsongprint() {
		System.out.println("히트곡을 출력합니다"); //매개변수의 다형성 이용할 예정
	}
}
 