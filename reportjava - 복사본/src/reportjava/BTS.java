package reportjava;

public class BTS extends Idol{
	int debut;
	String[] songs=new String[9]; //인기 타이틀곡 저장
	
	public BTS(String hitsong,int member, int debut) {
		super(hitsong ,member);
		this.debut=debut;
		System.out.println("BTS:");
		System.out.println(debut+"년 데뷔");
	}
	
	void addsong() {//인기 타이틀곡 배열에 저장
		songs[0]="I NEED U";
		songs[1]="RUN";
		songs[2]="불타오르네(FIRE)";
		songs[3]="피 땀 눈물";
		songs[4]="봄날";
		songs[5]="DNA";
		songs[6]="FAKE LOVE";
		songs[7]="Dynamite";
		songs[8]="Butter";
		
	}
	void printsong() {//배열의 모든 곡들 출력
		System.out.print("타이틀 곡:");
		for (int i=0; i<songs.length; i++) {
			if (i==songs.length-1) {
				System.out.print(songs[i]);
			}
			else {
				System.out.print(songs[i]+ ", ");
			}
		}
	}
	void memprint() {//멤버 출력
		System.out.println("진, 슈가, 제이홉, RM, 지민, 뷔, 정국");
	}
	public void hitsongprint() {//매개변수의 다형성->최고 조회수 뮤비 출력
		System.out.println("유튜브 뮤직비디오 최다 조회수: 작은 것들을 위한 시 - 1,608,011,487회");
	}
	void explain() {//그룹 특징 출력
		System.out.println("특징: \"10대들이 살아가면서 겪는 힘든 일, 편견과 억압을 우리가 막아내겠다는 심오한 뜻을 담아냈다\"는 뜻.");
	}
}
