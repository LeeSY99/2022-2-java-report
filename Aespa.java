package korea;

public class Aespa extends Idol{
	int debut;
	String[] songs= new String[4]; //인기 타이틀곡 저장하는 배열
	
	
	public Aespa(String hitsong,int member, int debut) {
		super(hitsong ,member); //부모 생성자 호출
		this.debut=debut;	
		System.out.println("====================================");
		System.out.println("aespa");
		System.out.println("------------------------------------");
		System.out.println(debut+"년 데뷔");
	}
	void addsong() {	//타이틀곡 배열에 곡 저장
		songs[0]="Black Mamba";
		songs[1]="Next Level";
		songs[2]="sevage";
		songs[3]="Girls";
		
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
	void memprint() { //멤버 출력
		System.out.println("카리나, 지젤, 윈터, 닝닝");
	}
	public void hitsongprint() {	//매개변수의 다형성
		System.out.println("유튜브 뮤직비디오 최다 조회수: Next Level - 252,245,607회");
	}
	void explain() { //그룹 특징 출력
		System.out.println("특징: 자신의 또 다른 자아인 아바타를 만나 새로운 세계를 경험하게 된다는 세계관을 바탕으로 활동한다.");
	}
}