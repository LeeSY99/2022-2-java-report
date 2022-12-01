package korea;

public class BLACKPINK extends Idol{
	int debut;
	String[] songs=new String[7]; // 인기 타이틀곡 저장하는 배열
	
	public BLACKPINK(String hitsong,int member, int debut) {
		super(hitsong ,member);	//부모 생성자 호출
		this.debut=debut;
		System.out.println("====================================");
		System.out.println("BLACKPINK");
		System.out.println("------------------------------------");
		System.out.println(debut+"년 데뷔");
	}
	void addsong() {	//인기 타이틀곡 배열에 저장
		songs[0]="휘파람";
		songs[1]="붐바야";
		songs[2]="불장난";
		songs[3]="뚜두뚜두";
		songs[4]="Ice Cream (with Selena Gomez)";
		songs[5]="Lovesick Girls";
		songs[6]="Shutdown";
		
	}
	void printsong() {	//배열의 모든 곡들 출력
		System.out.print("타이틀 곡: ");
		for (int i=0; i<songs.length; i++) {
			if (i==songs.length-1) {
				System.out.print(songs[i]);
			}
			else {
				System.out.print(songs[i]+ ", ");
			}
		}
	}
	void memprint() {	//멤버 출력
		System.out.println("지수, 제니, 로제, 리사");
	}
	public void hitsongprint() {	//매개변수의 다형성->최고 조회수 뮤비 출력
		System.out.println("유튜브 뮤직비디오 최다 조회수: 뚜두뚜두 - 1,983,855,145회");
	}
	void explain() { //그룹 특징 출력
		System.out.println("특징: 가장 예쁜 색으로 표현되는 \"핑크\"를 \"블랙\"으로 부정하는 의미를 덧붙여 ‘예쁘게만 보지 마라’, ‘보이는 게 다가 아니다’라는 반전 의미를 담고 있다고 한다. 발표하는 노래들 역시 팀명의 의미와 부합하는 곡들이 많다.");
	}
	
}
